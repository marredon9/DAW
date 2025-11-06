<?php
session_start(); // Iniciar la sesión

// Verificar si la sesión existe
if (!isset($_SESSION['user'])) {
    header("Location: index.php"); // Redirigir a la página de acceso
    exit();
}

// Leer cookies
$font_size = isset($_COOKIE['font_size']) ? $_COOKIE['font_size'] : '16px'; // Tamaño de fuente por defecto
$contrast = isset($_COOKIE['contrast']) ? $_COOKIE['contrast'] : 'normal'; // Contraste por defecto
$idioma = isset($_COOKIE['idioma']) ? $_COOKIE['idioma'] : 'es'; // Idioma por defecto

// Mensaje de saludo
$saludo = ($idioma == 'es') ? "Hola " . $_SESSION['user'] . " 👋" : "Hello " . $_SESSION['user'];

// Procesar el formulario de preferencias
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    if (isset($_POST['font_size'])) {
        setcookie('font_size', $_POST['font_size'], time() + (86400 * 30), "/"); // 30 días
    }
    if (isset($_POST['contrast'])) {
        setcookie('contrast', $_POST['contrast'], time() + (86400 * 30), "/"); // 30 días
    }
    if (isset($_POST['idioma'])) {
        setcookie('idioma', $_POST['idioma'], time() + (86400 * 30), "/"); // 30 días
    }
    header("Refresh:0"); // Refrescar la página para aplicar cambios
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Panel Personal</title>
    <style>
        body {
            font-size: <?php echo $font_size; ?>;
            background-color: <?php echo ($contrast == 'high') ? '#000' : '#fff'; ?>;
            color: <?php echo ($contrast == 'high') ? '#fff' : '#000'; ?>;
        }
    </style>
</head>
<body>
    <h1><?php echo $saludo; ?></h1>

    <form method="post">
        <label for="font_size">Tamaño de fuente:</label>
        <select name="font_size">
            <option value="16px" <?php if ($font_size == '16px') echo 'selected'; ?>>Normal</option>
            <option value="20px" <?php if ($font_size == '20px') echo 'selected'; ?>>Grande</option>
        </select>

        <label for="contrast">Contraste:</label>
        <select name="contrast">
            <option value="normal" <?php if ($contrast == 'normal') echo 'selected'; ?>>Normal</option>
            <option value="high" <?php if ($contrast == 'high') echo 'selected'; ?>>Alto</option>
        </select>

        <label for="idioma">Idioma:</label>
        <select name="idioma">
            <option value="es" <?php if ($idioma == 'es') echo 'selected'; ?>>Español</option>
            <option value="en" <?php if ($idioma == 'en') echo 'selected'; ?>>Inglés</option>
        </select>

        <input type="submit" value="Actualizar Preferencias">
    </form>

    <form method="post" action="logout.php">
        <input type="submit" value="Salir">
    </form>
</body>
</html>
