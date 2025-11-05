<?php
require 'db.php';
// Búsqueda opcional por nombre (?q=texto)
$q = trim($_GET['q'] ?? '');
$like = "%{$q}%";
$stmt = $cn->prepare("SELECT id, nombre, email, nota, created_at
 FROM alumnos
 WHERE (? = '' OR nombre LIKE ?) ORDER BY id");
 // Truco: si q está vacío, la condición (?='') es TRUE y no filtra; si no,

$stmt->bind_param('ss', $q, $like);
$stmt->execute();
$res = $stmt->get_result();
// Presentación en tabla
?>
<!doctype html>
<html lang="es">
<meta charset="utf-8">
<title>Listado de alumnos</title>
<body style="font-family:system-ui,Arial,sans-serif; margin:1.5rem">
 <h1>Alumnos</h1>
 <form method="get" style="margin-bottom:1rem">
 <label>Buscar por nombre: <input name="q" value="<?= htmlspecialchars($q,
ENT_QUOTES,'UTF-8') ?>"></label>
 <button>Filtrar</button>
 </form>
 <table border="1" cellpadding="6">
 <tr><th>ID</th><th>Nombre</th><th>Email</th><th>Nota</th><th>Alta</th></tr>
<?php while ($r = $res->fetch_assoc()): ?>
 <tr>
 <td><?= (int)$r['id'] ?></td>
 <td><?= htmlspecialchars($r['nombre'], ENT_QUOTES,'UTF-8') ?></td>
 <td><?= htmlspecialchars($r['email'], ENT_QUOTES,'UTF-8') ?></td>
 <td><?= number_format((float)$r['nota'], 2, ',', '.') ?></td>

 <td><?= htmlspecialchars($r['created_at'], ENT_QUOTES,'UTF-8') ?></td>
 </tr>
<?php endwhile; ?>
 </table>
</body>
</html>