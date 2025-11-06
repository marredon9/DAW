<?php
session_start(); // Iniciar la sesión

// Verificar si ya existe una sesión
if (isset($_SESSION['user'])) {
    header("Location: panel.php"); // Redirigir al panel
    exit();
}

// Procesar el formulario de acceso
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $nombre = htmlspecialchars($_POST['nombre']); // Obtener el nombre
    $_SESSION['user'] = $nombre; // Guardar en la sesión
    header("Location: panel.php"); // Redirigir al panel
    exit();
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Página de Acceso</title>
</head>
<body>
    <form method="post">
        <label for="nombre">Introduce tu nombre:</label>
        <input type="text" name="nombre" required>
        <input type="submit" value="Acceder">
    </form>
</body>
</html>
