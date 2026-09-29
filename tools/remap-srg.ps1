param(
    [string]$SrcDir = 'C:\Users\Junior\Documents\Java Projects\JrmcCoreRecompiled\src\main\java',
    [string]$MapDir = 'C:\Users\Junior\Documents\Java Projects\JrmcCoreRecompiled\tools\mcp_stable-12'
)

$ErrorActionPreference = 'Stop'
$sw = [System.Diagnostics.Stopwatch]::StartNew()

Write-Host "Loading mappings..."
$map = @{}

function Load-Csv($path, $keyCol) {
    Import-Csv -Path $path | ForEach-Object {
        $srg = $_.$keyCol
        $mcp = $_.name
        if ($srg -and $mcp -and -not $script:map.ContainsKey($srg)) {
            $script:map[$srg] = $mcp
        }
    }
}

Load-Csv "$MapDir\methods.csv" 'searge'
Load-Csv "$MapDir\fields.csv"  'searge'
Load-Csv "$MapDir\params.csv"  'param'

Write-Host ("Loaded {0} mappings in {1}ms" -f $map.Count, $sw.ElapsedMilliseconds)

$pattern = [regex]'\b(func_\d+_[A-Za-z0-9_]*|field_\d+_[A-Za-z0-9_]*|p_\w+_\d+_)\b'
$evaluator = {
    param($m)
    $name = $m.Value
    if ($script:map.ContainsKey($name)) { return $script:map[$name] }
    return $name
}

$files = Get-ChildItem -Path $SrcDir -Recurse -Filter *.java
Write-Host ("Files to process: {0}" -f $files.Count)

$totalReplacements = 0
$filesChanged = 0
$i = 0
foreach ($f in $files) {
    $i++
    $orig = [System.IO.File]::ReadAllText($f.FullName)
    $count = 0
    $new = $pattern.Replace($orig, {
        param($m)
        $name = $m.Value
        if ($script:map.ContainsKey($name)) {
            $script:totalReplacements++
            return $script:map[$name]
        }
        return $name
    })
    if ($new -ne $orig) {
        [System.IO.File]::WriteAllText($f.FullName, $new)
        $filesChanged++
    }
    if ($i % 50 -eq 0) { Write-Host ("  {0}/{1} files, {2} replacements so far" -f $i, $files.Count, $totalReplacements) }
}

$sw.Stop()
Write-Host ""
Write-Host ("Done. {0} files changed, {1} total replacements in {2}s" -f $filesChanged, $totalReplacements, [math]::Round($sw.Elapsed.TotalSeconds, 2))
