<?php
require_once "Alumno1.php";

$alumnos = [
    new Alumno1("Iker", 3),
    new Alumno1("Unaxa", 1),
    new Alumno1("Patatapolis", 4),
    new Alumno1("Pimiento", 7),
    new Alumno1("Curro", 2),
    new Alumno1("Pascal", 9)
];

foreach($alumnos as $a){
    if($a -> getNota() >= 5){
        echo  $a -> inform() . " Aprobado <br>";
    }else{
        echo $a -> inform() . " Suspendido <br>";
    }
}
?>