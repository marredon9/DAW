<?php
// Nombre de la cookie
$cookie_name = "idioma";

// 1. Verificar si se ha enviado el formulario
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // 2. Obtener el idioma seleccionado
    $idioma = $_POST["idioma"];

    // 3. Validar el idioma (opcional, pero recomendable)
    if ($idioma == "es" || $idioma == "en") {
        // 4. Establecer la cookie con el idioma seleccionado
        setcookie($cookie_name, $idioma, time() + (86400 * 30), "/");
    }
}

// 5. Determinar el saludo y el nombre (si existe)
$saludo = "";
$nombre = isset($_COOKIE["nombre"]) ? $_COOKIE["nombre"] : "usuario"; 
$name = isset($_COOKIE["name"]) ? $_COOKIE["name"] : "user";

if (isset($_COOKIE[$cookie_name])) {
    // Si la cookie de idioma existe
    $idioma_seleccionado = $_COOKIE[$cookie_name];
    if ($idioma_seleccionado == "es") {
        $saludo = "Hola " . $nombre;
    } elseif ($idioma_seleccionado == "en") {
        $saludo = "Hello " . $name;
    }
} else {
    // Si es la primera visita
    $saludo = "Bienvenido, primera visita. Recarga la página.";
    // Opcional: Establecer una cookie para el nombre

}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Cambio de Idioma</title>
</head>
<body>
    <p><?php echo $saludo; ?></p>

    <form method="post">
        <button type="submit" name="idioma" value="es">Español</button>
        <button type="submit" name="idioma" value="en">Inglés</button>
    </form>
</body>
</html>
