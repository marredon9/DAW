<?php
require 'conexion.php';
require 'Alumno.php';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    try {
		$a = new Alumno(0, $_POST['nombre'], $_POST['email'], $_POST['nota']);
        $a->insert($cn);
        header("Location: index.php");
    } catch (Exception $e) {
        $error = $e->getMessage();
    }
}
?>
<form method="post">
    <p>Nombre: <input name="nombre"></p>
    <p>Email: <input name="email"></p>
    <p>Nota: <input name="nota" type="number" step="0.1" min="0" max="10"></p>
    <button type="submit">Guardar</button>
    <?php if (!empty($error)) echo "<p style='color:red'>$error</p>"; ?>
</form>
