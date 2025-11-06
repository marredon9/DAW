Regla esencial: cualquier llamada a setcookie() debe hacerse antes de imprimir nada de HTML
(ni espacios). Para borrar una cookie, asigna un tiempo de caducidad en el pasado.

Ejercicio 4 · Idioma preferido del sitio (una cookie con valor por defecto)
Qué vas a construir: una cookie que recuerde el idioma preferido y un texto que cambia según ese
idioma.
Pasos:
1. Crea un selector de idioma con tres opciones (por ejemplo: es , eu , en ).
2. Al guardar el idioma:
Antes de cualquier HTML, setea una cookie lang_pref con ese valor, 30 días de
caducidad y path="/" .
Añade httponly (y secure si procede).
3. Al mostrar la página:
Determina el idioma así: si existe $_COOKIE['lang_pref'] , úsalo; si no, usa es como valor
por defecto.
Muestra un saludo o un párrafo corto en el idioma seleccionado.
4. Añade un botón “Olvidar idioma” que elimine la cookie como en el ejercicio anterior.
Lo que deberías ver: el texto cambia de idioma al elegir otro y persiste cuando vuelves a cargar la
página.