<?php
	require_once "Animal.php";
	require_once "Perro.php";

	$animales = [
		new Animal("Elefante"),
		new Perro("Pluto"),
		new Animal("Gato"),
		new Perro("Kuro"),
		new Animal("Ballena"),
		new Perro("Boss")
	];

	foreach ($animales as $animal){
		echo "Nombre: " . $animal->nombre . "\n";
		//echo "Dice: " . $animal->hablar() . "\n";

		if($animal instanceof Perro){
			echo "Es un perro: " . "\n";
		}
		echo "\n";
	}
?>
