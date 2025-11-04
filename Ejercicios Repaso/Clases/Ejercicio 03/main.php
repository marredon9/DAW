<?php
require_once "Producto.php";

	$productos = [
		new Producto("Xiaomi", 1943.993),
		new Producto("Nothing Phone 1", 308.897),
		new Producto("Botella", 1.897),
		new Producto("Barik", 3),
		new Producto("Boli", 0.897),
		new Producto("Libro", 13.98),
		new Producto("Peluche", 43.993),
		new Producto("Pato de goma", 21.47),
		new Producto("Bici", 134.897)
	];

	for($i = 0; $i < count($productos); $i++){
		if($productos[$i] -> getPrecio() > 20){
			$productos[$i] -> mostrar();
			echo "<br>";
		}
	}
?>