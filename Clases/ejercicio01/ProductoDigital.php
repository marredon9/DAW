<?php
require_once "Producto.php";
class ProductoDigital extends Producto {
    private int $tamañoMB;

    public function __construct(string $nombre, float $precioBase, int $tamañoMB){
        parent :: __construct($nombre, $precioBase);
        $this -> tamañoMB = max($tamañoMB, 0);
    }

    public function getTamañoMB(){
        return $this -> tamañoMB;
    }

    public function info(): string{
        return  "Producto digital: " . $this->getNombre() . " - " . $this->getTamañoMB() . " - " . $this->precioConIVA(21);
    }
}
?>