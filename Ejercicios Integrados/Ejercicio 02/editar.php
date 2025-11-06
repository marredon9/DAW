<?php
require 'conexion.php';
require 'Alumno.php';

$a = Alumno::find($cn, $_GET['id']);
if (!$a) die("Alumno no encontrado");

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    try {
        $a = new Alumno($_GET['id'], $_POST['nombre'], $_POST['email'], $_POST['nota']);
        $a->update($cn);
        header("Location: index.php");
    } catch (Exception $e) {
        $error = $e->getMessage();
    }
}
?>
<form method="post">
    <p>Nombre: <input name="nombre" value="<?= htmlspecialchars($a->nombre) ?>"></p>
    <p>Email: <input name="email" value="<?= htmlspecialchars($a->email) ?>"></p>
    <p>Nota: <input name="nota" type="number" step="0.1" min="0" max="10" value="<?= htmlspecialchars($a->nota) ?>"></p>
    <button type="submit">Actualizar</button>
    <?php if (!empty($error)) echo "<p style='color:red'>$error</p>"; ?>
</form>
