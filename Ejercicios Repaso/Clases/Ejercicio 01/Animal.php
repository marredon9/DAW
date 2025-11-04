<?php
class Animal{
	public string $nombre;
	public function __construct($nombre) {
		$this->nombre = $nombre;
	}

	public function hablar(){
		echo "Hago ruidos";
	}
}

?>