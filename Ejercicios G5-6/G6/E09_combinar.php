<?php
$array1 = [1,2];
$array2 = [3,4];
$array3 = array_merge($array1, $array2);
var_dump($array3);
echo "<br>";
for( $i = 0; $i < count($array3); $i++ ){
    echo $array3[$i] ." ";
}
?>