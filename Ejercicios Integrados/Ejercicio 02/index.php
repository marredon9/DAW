<?php
require 'conexion.php';
require 'Alumno.php';

$alumnos = Alumno::all($cn);
?>
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8"><title>Listado de alumnos</title></head>
<body>
<h1>Alumnos</h1>
<a href="nuevo.php">Nuevo alumno</a><br><br>
<table border="1">
<tr><th>ID</th><th>Nombre</th><th>Email</th><th>Nota</th><th>Acciones</th></tr>
<?php foreach ($alumnos as $a): ?>
<tr>
    <td><?= htmlspecialchars($a->id) ?></td>
    <td><?= htmlspecialchars($a->nombre) ?></td>
    <td><?= htmlspecialchars($a->email) ?></td>
    <td><?= htmlspecialchars($a->nota) ?></td>
    <td>
        <a href="editar.php?id=<?= $a->id ?>">Editar</a> |
        <a href="borrar.php?id=<?= $a->id ?>">Borrar</a>
    </td>
</tr>
<?php endforeach; ?>
</table>
</body>
</html>
