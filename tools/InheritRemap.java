import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.commons.ClassRemapper;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import java.util.zip.*;

/**
 * Inheritance-aware SRG -> MCP remapper for Forge 1.7.10 mod jars.
 *
 * SpecialSource fails to remap field/method references whose constant-pool
 * owner is a SUBCLASS of the MC class where the mapping is defined (a known
 * 1.7.10 dev-workspace issue). This tool builds an inheritance map across
 * the input jar plus an "inherit" classpath, then resolves each FIELDREF /
 * METHODREF by walking the class hierarchy.
 *
 * Usage:
 *   java -cp asm-debug-all-5.2.jar:. InheritRemap \
 *       --in <input.jar> --out <output.jar> \
 *       --fields fields.csv --methods methods.csv \
 *       --inherit forgeSrc.jar[,extra.jar]
 */
public class InheritRemap {

    static final Map<String, String> SUPER = new HashMap<>();
    static final Map<String, String[]> IFACES = new HashMap<>();
    static final Map<String, Map<String, String>> FIELDS = new HashMap<>();
    static final Map<String, Map<String, String>> METHODS = new HashMap<>();
    // Set of "owner#funcName(desc)" method declarations that must be DROPPED from
    // the output, because renaming them to the MCP name would collide with an
    // existing method on the same class with the same descriptor.
    static final Set<String> SKIP_DECL = new HashSet<>();

    public static void main(String[] args) throws Exception {
        String inPath = null, outPath = null, fieldsCsv = null, methodsCsv = null;
        List<String> inheritJars = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "--in": inPath = args[++i]; break;
                case "--out": outPath = args[++i]; break;
                case "--fields": fieldsCsv = args[++i]; break;
                case "--methods": methodsCsv = args[++i]; break;
                case "--inherit":
                    for (String j : args[++i].split("[,;" + File.pathSeparator + "]"))
                        if (!j.isEmpty()) inheritJars.add(j);
                    break;
                default: throw new IllegalArgumentException("Unknown arg: " + args[i]);
            }
        }
        if (inPath == null || outPath == null) throw new IllegalArgumentException("--in and --out required");

        // Load CSVs into a SRG->MCP name map keyed by srg name (unique across MC).
        Map<String, String> srgToMcp = new HashMap<>();
        if (fieldsCsv != null) loadCsv(fieldsCsv, srgToMcp);
        if (methodsCsv != null) loadCsv(methodsCsv, srgToMcp);
        System.out.println("Loaded " + srgToMcp.size() + " name mappings");

        // Build inheritance map by scanning input jar + inherit jars.
        scanJarForInheritance(inPath);
        for (String j : inheritJars) scanJarForInheritance(j);
        System.out.println("Indexed " + SUPER.size() + " classes for inheritance");

        // Compute duplicate-method skip set for input jar classes only.
        // If a class declares both func_X(desc) and mcpName(desc), drop func_X.
        computeSkipDecls(inPath, srgToMcp);
        System.out.println("Skipping " + SKIP_DECL.size() + " duplicate method declarations");

        // Remap input jar.
        File in = new File(inPath);
        File out = new File(outPath);
        try (JarFile jin = new JarFile(in);
             JarOutputStream jout = new JarOutputStream(new BufferedOutputStream(new FileOutputStream(out)))) {
            Enumeration<JarEntry> entries = jin.entries();
            while (entries.hasMoreElements()) {
                JarEntry e = entries.nextElement();
                if (e.isDirectory()) continue;
                String name = e.getName();
                byte[] data;
                try (InputStream is = jin.getInputStream(e)) { data = readAll(is); }

                if (name.endsWith(".class")) {
                    data = remapClass(data, srgToMcp);
                }
                JarEntry nout = new JarEntry(name);
                jout.putNextEntry(nout);
                jout.write(data);
                jout.closeEntry();
            }
        }
        System.out.println("Wrote " + outPath);
    }

    static void loadCsv(String path, Map<String, String> out) throws IOException {
        try (BufferedReader r = new BufferedReader(new FileReader(path))) {
            String line = r.readLine(); // header
            while ((line = r.readLine()) != null) {
                int comma = line.indexOf(',');
                if (comma < 0) continue;
                String srg = line.substring(0, comma);
                int comma2 = line.indexOf(',', comma + 1);
                String mcp = comma2 > 0 ? line.substring(comma + 1, comma2) : line.substring(comma + 1);
                out.put(srg, mcp);
            }
        }
    }

    /**
     * For each class in the input jar, check whether any declared method named
     * "func_..." would, after SRG->MCP remap, collide with another method
     * already declared on the same class with the same descriptor. Record the
     * func_X declaration in SKIP_DECL so remapClass can omit it.
     *
     * The METHODS map stores key = name + descriptor and value = descriptor.
     * To check collision we need to inspect both names against the same desc.
     */
    static void computeSkipDecls(String jarPath, Map<String, String> srgToMcp) throws IOException {
        try (JarFile jf = new JarFile(jarPath)) {
            Enumeration<JarEntry> entries = jf.entries();
            while (entries.hasMoreElements()) {
                JarEntry e = entries.nextElement();
                if (e.isDirectory() || !e.getName().endsWith(".class")) continue;
                try (InputStream is = jf.getInputStream(e)) {
                    ClassReader cr = new ClassReader(is);
                    final String className = cr.getClassName();
                    // Collect (name, desc) pairs declared directly on this class.
                    final List<String[]> declared = new ArrayList<>();
                    cr.accept(new ClassVisitor(Opcodes.ASM5) {
                        @Override public org.objectweb.asm.MethodVisitor visitMethod(int a, String n, String d, String s, String[] ex) {
                            declared.add(new String[]{n, d});
                            return null;
                        }
                    }, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
                    // Build set of (name+desc) for fast lookup.
                    Set<String> declSet = new HashSet<>();
                    for (String[] nd : declared) declSet.add(nd[0] + nd[1]);
                    // For each func_X(desc) check if mcpName(desc) also declared.
                    for (String[] nd : declared) {
                        String name = nd[0], desc = nd[1];
                        if (!name.startsWith("func_")) continue;
                        String mcp = srgToMcp.get(name);
                        if (mcp == null) continue;
                        if (declSet.contains(mcp + desc)) {
                            SKIP_DECL.add(className + "#" + name + desc);
                            System.out.println("  SKIP duplicate decl: " + className + "." + name + desc + " (collides with " + mcp + ")");
                        }
                    }
                }
            }
        }
    }

    static void scanJarForInheritance(String jarPath) throws IOException {
        try (JarFile jf = new JarFile(jarPath)) {
            Enumeration<JarEntry> entries = jf.entries();
            while (entries.hasMoreElements()) {
                JarEntry e = entries.nextElement();
                if (e.isDirectory() || !e.getName().endsWith(".class")) continue;
                try (InputStream is = jf.getInputStream(e)) {
                    ClassReader cr = new ClassReader(is);
                    String name = cr.getClassName();
                    SUPER.put(name, cr.getSuperName());
                    IFACES.put(name, cr.getInterfaces());
                    // Index declared fields and methods on this class for later inherited lookup.
                    Map<String, String> fieldMap = new HashMap<>();
                    Map<String, String> methodMap = new HashMap<>();
                    cr.accept(new ClassVisitor(Opcodes.ASM5) {
                        @Override public org.objectweb.asm.FieldVisitor visitField(int a, String n, String d, String s, Object v) {
                            fieldMap.put(n, d); return null;
                        }
                        @Override public org.objectweb.asm.MethodVisitor visitMethod(int a, String n, String d, String s, String[] ex) {
                            methodMap.put(n + d, d); return null;
                        }
                    }, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
                    FIELDS.put(name, fieldMap);
                    METHODS.put(name, methodMap);
                }
            }
        }
    }

    /** Walk owner -> super chain until we find a class that declares the field. */
    static String resolveFieldOwner(String owner, String fieldName) {
        String cur = owner;
        while (cur != null) {
            Map<String, String> declared = FIELDS.get(cur);
            if (declared != null && declared.containsKey(fieldName)) return cur;
            cur = SUPER.get(cur);
        }
        return null;
    }

    static String resolveMethodOwner(String owner, String methodName, String desc) {
        String cur = owner;
        while (cur != null) {
            Map<String, String> declared = METHODS.get(cur);
            if (declared != null && declared.containsKey(methodName + desc)) return cur;
            // Also check interfaces.
            String[] interfaces = IFACES.get(cur);
            if (interfaces != null) {
                for (String iface : interfaces) {
                    String r = resolveMethodOwner(iface, methodName, desc);
                    if (r != null) return r;
                }
            }
            cur = SUPER.get(cur);
        }
        return null;
    }

    static byte[] remapClass(byte[] in, Map<String, String> srgToMcp) {
        ClassReader cr = new ClassReader(in);
        final String classBeingRemapped = cr.getClassName();
        ClassWriter cw = new ClassWriter(0);
        Remapper remapper = new Remapper() {
            @Override
            public String mapFieldName(String owner, String name, String descriptor) {
                if (!name.startsWith("field_")) return name;
                // Walk inheritance to find real owner declaring this field.
                String realOwner = resolveFieldOwner(owner, name);
                if (realOwner == null) realOwner = owner;
                String mcp = srgToMcp.get(name);
                return mcp != null ? mcp : name;
            }
            @Override
            public String mapMethodName(String owner, String name, String descriptor) {
                if (!name.startsWith("func_")) return name;
                String realOwner = resolveMethodOwner(owner, name, descriptor);
                if (realOwner == null) realOwner = owner;
                String mcp = srgToMcp.get(name);
                return mcp != null ? mcp : name;
            }
            @Override
            public String mapInvokeDynamicMethodName(String name, String descriptor) {
                return name.startsWith("func_") && srgToMcp.containsKey(name) ? srgToMcp.get(name) : name;
            }
        };
        ClassRemapper remapVisitor = new ClassRemapper(cw, remapper);
        // Chain: cr -> filter (drops SKIP_DECL methods by ORIGINAL name) -> remapVisitor -> cw
        ClassVisitor filter = new ClassVisitor(Opcodes.ASM5, remapVisitor) {
            @Override
            public org.objectweb.asm.MethodVisitor visitMethod(int access, String name, String desc, String sig, String[] ex) {
                if (SKIP_DECL.contains(classBeingRemapped + "#" + name + desc)) {
                    return null;
                }
                return super.visitMethod(access, name, desc, sig, ex);
            }
        };
        cr.accept(filter, 0);
        return cw.toByteArray();
    }

    static byte[] readAll(InputStream is) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[8192];
        int n;
        while ((n = is.read(buf)) > 0) out.write(buf, 0, n);
        return out.toByteArray();
    }
}
