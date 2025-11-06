<?php
require_once "Producto.php";
require_once "ProductoDigital.php";

$productos = [
    new Producto("Estrella Galicia", 0.89),
    new Producto("Helicoptero Apache AH-64D Block III", 69999999.99),
    new Producto("Unaxa", 5),
    new ProductoDigital("DeltaRune", 24.99, 2000),
    new ProductoDigital("Beto", 0.99, 1047)
];

foreach($productos as $p){
    if($p instanceof ProductoDigital){
        echo "DIGITAL " . $p -> info();
        echo "<br>";
    }
}
$arrayCaros = filtrarCaros($productos, 4.0);
echo "<br>";
var_dump($arrayCaros);


function filtrarCaros(array $productos, float $umbral): array{
    $arrayCaros = [];
    foreach($productos as $p){
        if(($p-> precioConIVA(21.0)) > $umbral){
            array_push($arrayCaros, $p);
        }
    
    }
    return $arrayCaros;
}
?>