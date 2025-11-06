<?php
$arr = ["manzana", "banana", "cereza"];
echo "Estado inicial:<br>";
print_r($arr);
array_push($arr, "nuevo");

array_shift($arr);
echo "<br><br>Estado final:<br>";
print_r($arr);
?>