<?php
$arr = [1, 2, 2, 3];

    $limpio = array_unique($arr);
    var_dump($limpio);
for( $i = 0; $i <= count($limpio); $i++){
    echo $limpio[$i];
}
?>