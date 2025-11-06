<?php
$notas = [
    "Ana" => 8,
    "Luis" => 6,
    "Marta" => 9,
    "Juan" => 7
];

echo "<tr><th>Alumno</th><th>Nota</th></tr>";
foreach ($notas as $alumno => $nota) {
    echo "<tr><td>$alumno</td><td>$nota</td></tr>";
}
echo "</table>";
?>