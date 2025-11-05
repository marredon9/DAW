<?php
    if(isset($_GET['set'])){
        $theme = $_GET['set'] === 'dark' ? 'dark' : 'light';
        setcookie('theme', $theme, time() + 86400*7, '/');
        header('Location: cookie.php');
        exit;
    }
    if(isset($_GET['del'])){
        setcookie('theme', '', time() - 3600, '/');
        header(('Location: cookie.php'));
    exit;
    }
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cookies</title>
</head>
<body>
    <h1>Preferencia de tema con cookies</h1>
<?php if(isset($_COOKIE['theme'])): ?>
    <p>Tema actual: <span><?php echo htmlspecialchars($_COOKIE['theme'], ENT_QUOTES, 'UTF-8');?></span></p>
<?php endif;?>
    <br>
    <a href="?set=light">Cambiar a claro</a>
    <a href="?set=dark">Cambiar a oscuro</a>
    <a href="?del=1">Eliminar</a>
</body>
</html>