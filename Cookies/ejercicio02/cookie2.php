<?php
// 1. Guardar idioma si se envía el formulario
if (isset($_POST['idioma'])) {
    $idioma = $_POST['idioma'];
    setcookie('lang_pref', $idioma, time() + (30 * 24 * 60 * 60), '/', '', isset($_SERVER['HTTPS']), true);
    header("Location: " . $_SERVER['PHP_SELF']);
    exit;
}

// 2. Eliminar cookie si se pulsa "Olvidar idioma"
if (isset($_POST['olvidar'])) {
    setcookie('lang_pref', '', time() - 3600, '/', '', isset($_SERVER['HTTPS']), true);
    header("Location: " . $_SERVER['PHP_SELF']);
    exit;
}

// 3. Determinar idioma
$idioma = isset($_COOKIE['lang_pref']) ? $_COOKIE['lang_pref'] : 'es';

// 4. Saludos en diferentes idiomas
$saludos = [
    'es' => '¡Hola! Bienvenido a nuestra página.',
    'eu' => 'Kaixo! Ongi etorri gure orrira.',
    'en' => 'Hello! Welcome to our page.'
];
?>

<!DOCTYPE html>
<html lang="<?= htmlspecialchars($idioma) ?>">
<head>
    <meta charset="UTF-8">
    <title>Selector de idioma</title>
</head>
<body>
    <h1><?= $saludos[$idioma] ?? $saludos['es'] ?></h1>

    <form method="post">
        <label for="idioma">Selecciona tu idioma:</label>
        <select name="idioma" id="idioma">
            <option value="es" <?= $idioma == 'es' ? 'selected' : '' ?>>Español</option>
            <option value="eu" <?= $idioma == 'eu' ? 'selected' : '' ?>>Euskera</option>
            <option value="en" <?= $idioma == 'en' ? 'selected' : '' ?>>English</option>
        </select>
        <button type="submit">Guardar idioma</button>
    </form>

    <form method="post">
        <button type="submit" name="olvidar">Olvidar idioma</button>
    </form>
</body>
</html>
