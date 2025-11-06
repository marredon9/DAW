<?php
$den = 5; $nume = 50;
if($den == 0){
    echo "Error, no se puede dividir";
}else{
    $resultado = $nume / $den;
    echo "El resultado de la división " . $nume . " / " . $den . " es " . $resultado;
}
?>