<?php
// Nombre de la cookie
$cookie_name = "contador";

// 1. Verificar si la cookie existe
if (isset($_COOKIE[$cookie_name])) {
    // 2. Si existe, aumentar el contador
    $contador = $_COOKIE[$cookie_name] + 1;
} else {
    // 3. Si no existe, inicializar el contador en 1
    $contador = 0;
}

// 4. Establecer o actualizar la cookie
setcookie($cookie_name, $contador, time() + (86400 * 30), "/"); // La cookie expira en 30 días

$mensaje = "";
// 5. Mensajes
if ($contador == 5) {
    $mensaje = "¡Has entrado 5 veces! Gracias 😊";
} 

// 6. Manejo del botón "Reiniciar contador"
if (isset($_POST["reiniciar"])) {
    // Borrar la cookie estableciendo su tiempo de expiración en el pasado
    setcookie($cookie_name, "", time() - 3600, "/");
    header("Refresh:0"); // Refrescar la página para que el contador se reinicie
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Contador de Visitas</title>
</head>
<body>
    <p><?php echo $mensaje; ?></p>

    <form method="post">
        <input type="submit" name="reiniciar" value="Reiniciar contador">
    </form>
</body>
</html>
