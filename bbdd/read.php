<?php
require 'db.php';
$id = (int)($_GET['id'] ?? 0);
$stmt = $cn->prepare('SELECT id, nombre, email, nota FROM alumnos WHERE id
= ?');
$stmt->bind_param('i', $id);
$stmt->execute();
$alumno = $stmt->get_result()->fetch_assoc();
if ($alumno) {
echo json_encode($alumno, JSON_UNESCAPED_UNICODE);
} else {
http_response_code(404);

echo 'No encontrado';
}
?>