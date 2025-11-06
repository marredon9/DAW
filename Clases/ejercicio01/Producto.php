<?php
class Producto{
    private string $nombre;
    private float $precioBase;

    public function __construct(string $nombre, float $precioBase){
        $this -> nombre = $nombre;
        $this -> precioBase = $precioBase;
    }

    public function getNombre(){
        return $this -> nombre;
    }

    public function getPrecioBase(){
        return $this -> precioBase;
    }

    public function precioConIva(float $tipoIVA) : float{
        $precioFinal = $this -> getPrecioBase() * (1 + ($tipoIVA/100));
        return $precioFinal;
    }
}
?>