Ejercicio 1 · Inventario con clases, herencia y arrays
Qué vas a construir: un mini‑inventario con productos normales y digitales. Practicarás: clase base,
subclase con propiedades extra, constructor con validación, instanceof y recorrido de arrays de
objetos.
Pasos:
1. Crea una clase base Producto .
Propiedades: $nombre y $precioBase .
Añade getters para consultar nombre y precio base desde fuera.
Crea el método precioConIVA(float $tipoIVA): float que devuelva el precio final
multiplicando por 1 + ($tipoIVA/100) . Si te pasan 21, se multiplica por 1.21 .
Dentro de los métodos usa $this para referirte a las propiedades del objeto.
2. Crea una subclase ProductoDigital que extienda Producto .
Propiedad extra: $tamanoMB (tamaño en megas, número ≥ 0) y valídalo en el constructor.
Añade el método info(): string que devuelva un texto tipo: "Producto digital:
NOMBRE — TAMAÑO MB — Precio con IVA: XX,XX" .
3. Crea varios objetos y guárdalos en un array.
Por ejemplo: 3 productos normales y 2 digitales.
Recorre el array con foreach . Si el elemento es ProductoDigital (compruébalo
con instanceof ), añade “(DIGITAL)” al imprimirlo y enseña su info() .
Muestra el precio con IVA 21% para todos, formateado a dos decimales.
4. Escribe una función filtrarCaros(array $productos, float $umbral): array .
Debe devolver solo los productos cuyo precio con IVA supere $umbral .
Llama a la función y muestra la lista filtrada para comprobar que funciona.
Qué debes fijarte mientras lo haces:
Cómo instancias una clase con new .
Cómo usas la herencia ( extends ) y instanceof con seguridad.
Cómo recorres arrays de objetos y diseñas métodos útiles.