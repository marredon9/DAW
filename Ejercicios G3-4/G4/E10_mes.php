<?php
$n = 4;

if($n == 12 || $n <= 2){
    echo "invierno";
}else if($n >= 3 && $n <= 6){
    echo "primavera";
}else if($n >= 7&& $n < 9){
    echo "verano";
}else if($n >= 9 && $n < 12){
    echo "otoño";
}
?>