<?php
 class Producto{
	public string $nombre;
	public float $precio;

	public function __construct($nombre, $precio){
		$this -> nombre = $nombre;
		$this -> precio = $precio;
	}

	public function getNombre(){
		return $this -> nombre;
	}

	public function getPrecio(){
		return $this -> precio;
	}

	public function mostrar(){
		echo "Nombre: " . $this -> getNombre() . " || Precio: " . number_format($this -> getPrecio(), 2, "," , ".") . "€";
	}
 }
?>