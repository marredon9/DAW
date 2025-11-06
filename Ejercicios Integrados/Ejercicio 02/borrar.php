<?php
require 'conexion.php';
require 'Alumno.php';

$a = Alumno::find($cn, $_GET['id']);
if ($a) {
    $a->delete($cn);
}
header("Location: index.php");
?>
