<?php
$nombre = "Marina";
$edad = "26";
$ciudad = "Bilbao";

if (is_numeric($edad)) {
    echo $edad ." Edad válida<br>" ;
    echo $nombre . " " . $edad . " " . $ciudad;
} else {
    echo $edad . "Edad no válida";
    echo $nombre . " " . $ciudad;
}
?>