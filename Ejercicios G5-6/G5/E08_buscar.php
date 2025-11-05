<?php
$numeros = [3, 5, 7, 9, 11];
$encontrado = false;

foreach ($numeros as $valor) {
    if ($valor == 7) {
        echo "El número 7 aparece en el array.";
        $encontrado = true;
        break;
    }
}

if (!$encontrado) {
    echo "El número 7 no aparece en el array.";
}
?>