<?php
$n = 12;

if($n %3 == 0 && $n %5 == 0){
    echo "El número es múltiplo de 3 y de 5.";
}else if($n %3 == 0 && $n %5 != 0){
    echo "El número es múltiplo de 3.";
}else if($n %3 != 0 && $n %5 == 0){
    echo "El número es múltiplo de 5";
}else{
    echo "El número no es múltiplo ni de 3 ni de 5.";
}
?>