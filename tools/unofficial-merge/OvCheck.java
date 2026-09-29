import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.util.*;
import java.util.zip.*;

public class OvCheck {
    static Map<String, ClassNode> cls = new HashMap<>();
    static void loadJar(String p) throws Exception {
        try (ZipFile z = new ZipFile(p)) {
            for (Enumeration<? extends ZipEntry> e = z.entries(); e.hasMoreElements();) {
                ZipEntry en = e.nextElement();
                if (!en.getName().endsWith(".class")) continue;
                ClassNode cn = new ClassNode();
                new ClassReader(z.getInputStream(en)).accept(cn, ClassReader.SKIP_CODE);
                cls.putIfAbsent(cn.name, cn);
            }
        }
    }
    static void loadDir(File d) throws Exception {
        for (File f : d.listFiles()) {
            if (f.isDirectory()) loadDir(f);
            else if (f.getName().endsWith(".class")) {
                ClassNode cn = new ClassNode();
                try (InputStream in = new FileInputStream(f)) { new ClassReader(in).accept(cn, ClassReader.SKIP_CODE); }
                cls.put(cn.name, cn);
            }
        }
    }
    static boolean inSupers(String c, String name, String desc, boolean self) {
        if (c == null) return false;
        ClassNode cn = cls.get(c);
        if (cn == null) { return c.startsWith("java/") ? jdkHas(c, name, desc) : false; }
        if (!self) for (MethodNode m : cn.methods) if (m.name.equals(name) && m.desc.equals(desc) && (m.access & Opcodes.ACC_PRIVATE) == 0) return true;
        if (inSupers(cn.superName, name, desc, false)) return true;
        for (String i : cn.interfaces) if (inSupers(i, name, desc, false)) return true;
        return false;
    }
    static boolean jdkHas(String c, String name, String desc) {
        try {
            Class<?> k = Class.forName(c.replace('/', '.'));
            for (java.lang.reflect.Method m : k.getMethods()) if (m.getName().equals(name) && Type.getMethodDescriptor(m).equals(desc)) return true;
            for (java.lang.reflect.Method m : k.getDeclaredMethods()) if (m.getName().equals(name) && Type.getMethodDescriptor(m).equals(desc)) return true;
        } catch (Throwable t) {}
        return false;
    }
    public static void main(String[] a) throws Exception {
        // a[0] = classes dir, a[1] = list of class internal names to check, rest = jars
        for (int i = 2; i < a.length; i++) loadJar(a[i]);
        loadDir(new File(a[0]));
        BufferedReader br = new BufferedReader(new FileReader(a[1]));
        for (String l; (l = br.readLine()) != null;) {
            l = l.trim(); if (l.isEmpty()) continue;
            ClassNode cn = cls.get(l);
            if (cn == null) { System.out.println("MISSING " + l); continue; }
            for (MethodNode m : cn.methods) {
                if (m.name.startsWith("<") || (m.access & Opcodes.ACC_STATIC) != 0 || (m.access & Opcodes.ACC_SYNTHETIC) != 0) continue;
                if (!inSupers(cn.name, m.name, m.desc, true))
                    System.out.println(cn.name.substring(cn.name.lastIndexOf('/') + 1) + " " + m.name + m.desc);
            }
        }
    }
}
