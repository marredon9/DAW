<?php
$n = 12345;
$contador = 0;

if ($n == 0) {
    $contador = 1;
} else {
    $n = abs($n); 
    while ($n > 0) {
        $n = intdiv($n, 10);
        $contador++;
    }
}

echo "tiene ". $contador . " dígito(s).";
?>