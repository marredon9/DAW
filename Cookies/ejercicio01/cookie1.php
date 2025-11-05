<?php
// Procesar borrado de cookies
if (isset($_GET['reset'])) {
    setcookie('font_size', '', time() - 3600, '/', '', true, true);
    setcookie('contrast', '', time() - 3600, '/', '', true, true);
    setcookie('test_cookie', '', time() - 3600, '/', '', true, true);
    header('Location: ' . $_SERVER['PHP_SELF']);
    exit;
}

// Procesar formulario
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $font_size = $_POST['font_size'] ?? 'normal';
    $contrast = $_POST['contrast'] ?? 'normal';
    
    // Validar valores permitidos
    $font_size = in_array($font_size, ['normal', 'grande', 'extra']) ? $font_size : 'normal';
    $contrast = in_array($contrast, ['normal', 'alto']) ? $contrast : 'normal';
    
    // Establecer cookies
    setcookie('font_size', $font_size, time() + 86400 * 15, '/', '', true, true);
    setcookie('contrast', $contrast, time() + 86400 * 15, '/', '', true, true);
    
    // Cookie de prueba
    setcookie('test_cookie', '1', time() + 86400 * 15, '/', '', true, true);
    
    // Redireccionar para ver cambios
    header('Location: ' . $_SERVER['PHP_SELF']);
    exit;
}

// Obtener valores actuales
$current_font = $_COOKIE['font_size'] ?? 'normal';
$current_contrast = $_COOKIE['contrast'] ?? 'normal';
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Configuración de Accesibilidad</title>
    <style>
        /* Estilos base */
        body {
            font-family: system-ui, -apple-system, sans-serif;
            line-height: 1.5;
            margin: 2rem;
        }
        
        /* Tamaños de fuente */
        .fs-normal { font-size: 16px; }
        .fs-grande { font-size: 20px; }
        .fs-extra { font-size: 24px; }
        
        /* Contraste */
        .contraste-normal { 
            background-color: white;
            color: #333;
        }
        .contraste-alto { 
            background-color: white;
            color: black;
            font-weight: 500;
        }
    </style>
</head>
<body class="fs-<?= htmlspecialchars($current_font) ?> contraste-<?= htmlspecialchars($current_contrast) ?>">
    <h1>Configuración de Accesibilidad</h1>
    
    <?php if (isset($_COOKIE['test_cookie'])): ?>
        <p style="color: green;">✓ Las cookies están habilitadas</p>
    <?php else: ?>
        <p style="color: red;">⚠ Las cookies están deshabilitadas</p>
    <?php endif; ?>

    <form method="post">
        <p>
            <label for="font_size">Tamaño de fuente:</label>
            <select name="font_size" id="font_size">
                <option value="normal" <?= $current_font === 'normal' ? 'selected' : '' ?>>Normal</option>
                <option value="grande" <?= $current_font === 'grande' ? 'selected' : '' ?>>Grande</option>
                <option value="extra" <?= $current_font === 'extra' ? 'selected' : '' ?>>Extra</option>
            </select>
        </p>
        
        <p>
            <label for="contrast">Contraste:</label>
            <select name="contrast" id="contrast">
                <option value="normal" <?= $current_contrast === 'normal' ? 'selected' : '' ?>>Normal</option>
                <option value="alto" <?= $current_contrast === 'alto' ? 'selected' : '' ?>>Alto</option>
            </select>
        </p>
        
        <button type="submit">Guardar preferencias</button>
    </form>

    <p>
        <a href="?reset=1">Restablecer accesibilidad</a>
    </p>

    <div style="margin-top: 2rem;">
        <h2>Contenido de ejemplo</h2>
        <p>Este es un texto de ejemplo para ver los cambios de tamaño y contraste.</p>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
    </div>
</body>
</html>