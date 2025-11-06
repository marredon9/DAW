<?php
session_start(); // Iniciar la sesión
session_unset(); // Limpiar la sesión
session_destroy(); // Destruir la sesión

// Borrar cookies
setcookie('font_size', '', time() - 3600, "/");
setcookie('contrast', '', time() - 3600, "/");
setcookie('idioma', '', time() - 3600, "/");

header("Location: index.php"); // Redirigir a la página de acceso
exit();
?>
