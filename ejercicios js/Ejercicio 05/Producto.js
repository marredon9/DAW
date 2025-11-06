class Producto {
    nombre;
    precio;
    stock;

    constructor(nombre, precio, stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    mostrarInfo() {
        console.log("entro");

    }
    mostrarPropiedades(productito) {

    }
}

let productito = new Producto("Lays", 1, 5);
for (let propiedad in productito) {
    if (propiedad == "precio") {
        delete productito.precio;
    }
}

for (let propiedad in productito) {
    console.log(propiedad);

}