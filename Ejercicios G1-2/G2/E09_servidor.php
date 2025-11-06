<?php
$host = $_SERVER['HTTP_HOST'];
$metodo = $_SERVER['REQUEST_METHOD'];
$script = $_SERVER['SCRIPT_NAME'];
echo "$host<br>";
echo "$metodo<br>";
echo "$script<br>";
?>