<!-- llamada a la base de datos de mysql -->

<?php
// db.php — conexión reutilizable
mysqli_report(MYSQLI_REPORT_ERROR | MYSQLI_REPORT_STRICT); // errores → excepciones

try {
$host = 'localhost';
$user = 'root'; 
$pass = 'root'; 
$db = 'escuela';
$cn = new mysqli($host, $user, $pass, $db);
$cn->set_charset('utf8mb4');
} catch (mysqli_sql_exception $e) {
// En producción: registra $e->getMessage() en un log y muestra un
    exit('Error de conexión a la base de datos.');
}
?>