<?php
require_once "Producto.php";

	$productos = [
		new Producto("Xiaomi", 1943.993),
		new Producto("Nothing Phone 1", 308.897),
		new Producto("Botella", 1.897)
	];

	foreach($productos as $p){
		$p -> mostrar();
		echo "<br>";
	}
?>