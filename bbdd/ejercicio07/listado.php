<?php
require 'db.php'; //recuperación de datos.

// Búsqueda opcional del nombre (?q=texto)
$q = trim($_GET['q'] ?? ''); //obtener el parámetro q de la URL y eliminar espacios en planco al principio y al final

$like = "%{$q}%"; //crear un patrón para usar en una cláusula LIKE de SQL

//preparar una consulta SQL que busca alumnos por nombre.
$stmt = $cn->prepare("SELECT id, nombre, email, nota, created_at 
                                    FROM alumnos 
                                    WHERE (? = '' OR nombre LIKE ?) 
                                    ORDER BY id");

//se encarga de vincular las variables PHP a los marcadores de posición (?) que se usaron en la consulta 
// SQL preparada. El primer argumento, 'ss', indica que se están pasando dos parámetros de tipo string (cadena de texto)
// . La función bind_param se asegura de que los valores de $q y $like se inserten correctamente en la consulta, y también
//  los escapa automáticamente para proteger contra inyecciones SQL.
$stmt->bind_param('ss', $q, $like);

//se ejecuta la consulta ya preparada y con los parámetros vinculados. En este punto, el servidor MySQL recibe la consulta
//  completa y la procesa. Si todo está bien, se ejecuta y se generan los resultados correspondientes. Si hay algún error, 
// como un fallo de conexión o un problema de sintaxis, este paso lo provocaría.
$stmt->execute();

//obtiene el conjunto de resultados que devuelve la consulta. Esta función devuelve un objeto de tipo mysqli_result, que 
// luego puede usarse para recorrer los resultados fila por fila, por ejemplo con un bucle while. Es importante saber que
//  get_result() solo está disponible si PHP está usando el driver MySQLnd (MySQL Native Driver), que es común en la mayoría
//  de instalaciones modernas.
$res = $stmt->get_result();
?>

<!-- Presentación de la lista -->

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listado</title>
</head>

<body>
    <h1>Búsqueda de alumnos</h1>
    <form method="get">
        <!-- busca el nombre con el htmlspecialchars  -->
        <input type="text" name="q" id="p" placeholder="Buscar por nombre" value="<?=htmlspecialchars($q, ENT_QUOTES, 'UTF-8')?>">
        <button>Filtrar</button>
    </form>

    <!-- crear una tabla y mostrar los resultados-->
    <table border="1" cellpadding="6"">
        <tr><th>ID</th><th>Nombre</th><th>Email</th><th>Nota</th><th>Alta</th></tr>
        <!-- Busca en la consulta SQL -->
        <?php while ($r = $res->fetch_assoc()): ?> 
        <tr>
            <td><?= (int)$r['id'] ?></td>
            <td><?= htmlspecialchars($r ['nombre'], ENT_QUOTES, 'UTF-8') ?></td>
            <td><?= htmlspecialchars($r ['email'], ENT_QUOTES, 'UTF-8') ?></td>
            <td><?= number_format((float)$r['nota'], 2, ',', '.') ?></td>
            <td><?= htmlspecialchars($r ['created_at'], ENT_QUOTES, 'UTF-8') ?></td>
        </tr>
        <?php endwhile; ?>
    </table>
</body>

</html>