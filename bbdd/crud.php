<?php
require 'db.php';
$nombre = trim($_POST['nombre'] ?? '');
$email = trim($_POST['email'] ?? '');
$nota = (float)($_POST['nota'] ?? 0);
$stmt = $cn->prepare('INSERT INTO alumnos (nombre, email, nota) VALUES
(?, ?, ?)');
$stmt->bind_param('ssd', $nombre, $email, $nota);
$stmt->execute();
echo 'Insertado con id: ' . $cn->insert_id;
?>