Regla esencial: cualquier llamada a setcookie() debe hacerse antes de imprimir nada de HTML
(ni espacios). Para borrar una cookie, asigna un tiempo de caducidad en el pasado.

Ejercicio 3 · Preferencias de accesibilidad (dos cookies)
Qué vas a construir: dos cookies para mejorar la accesibilidad del sitio: tamaño de fuente y alto
contraste. No es un tema oscuro/claro; aquí gestionas dos preferencias distintas.
Pasos:
1. Diseña un formulario con dos selectores:
Tamaño de fuente: normal , grande , extra .
Contraste: normal , alto .
2. Al enviar el formulario (GET o POST):
Antes de pintar HTML, crea/actualiza dos cookies:
font_size (normal/grande/extra)
contrast (normal/alto)
Usa caducidad de 15 días ( time()+86400*15 ) y path="/" .
Añade httponly=true (y, si estás bajo HTTPS, también secure=true ).
3. En la misma página, después de setear las cookies, imprime el HTML que:
Lea $_COOKIE['font_size'] y $_COOKIE['contrast'] .
Aplique clases CSS condicionales (por ejemplo, .fs-grande , .contraste-alto ).
Si vas a mostrar valores que puedan venir del usuario, escápalos con htmlspecialchars .
4. Añade un botón “Restablecer accesibilidad” que borre ambas cookies.
Para borrar, vuelve a llamar a setcookie() con la misma ruta y una fecha en el pasado.
Regla esencial: cualquier llamada a setcookie() debe hacerse antes de imprimir nada de HTML
(ni espacios). Para borrar una cookie, asigna un tiempo de caducidad en el pasado.
5. (Opcional) Crea una test_cookie , recarga y muestra un mensaje si el navegador devuelve
cookies (sirve para diagnosticar si el alumno las tiene bloqueadas).
Lo que debería pasar en pantalla: al cambiar los selectores y recargar, el texto del sitio cambia de
tamaño y/o contraste.
