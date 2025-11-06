<?php

require_once 'Alumno.php';
require_once 'AlumnoBecado.php';

$alumnos = [
    new AlumnoBecado("Ibai", 5, 400),
    new Alumno("Iker", 6),
    new Alumno("Unax", 3),
];

function promedioNotas(array $alumnos)
{
    if (count($alumnos) === 0)
        return 0.0;

    $suma = 0.0;
    foreach ($alumnos as $a) {
        if ($a instanceof Alumno) {
            $suma += $a->getNota();
        }
    }
    return $suma / count($alumnos);
}
foreach($alumnos as $a){
    $nombre = $a -> getNombre();
    $nota = $a -> getNota();
    $estado = $a ? "Aprobado" : "Suspenso";

    echo $nombre . " Nota " . $nota . " Estado " . $estado . "<br>";
    echo "<br>";
    if($a instanceof AlumnoBecado){
        echo $a->info() . "<br>";
    }
    echo "<br>";
}

$promedio = promedioNotas($alumnos);
echo "Promedio de las notas: " . $promedio;

?>