<?php
$nombre = isset($_GET['nombre']) ? $_GET['nombre'] : 'invitado';
echo "Hola, $nombre!";
?>