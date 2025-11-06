class Viaje{
    origen;
    destino;
    dias;
    precio;

    constructor(origen, destino, dias, precio){
        this.origen = origen;
        this.destino = destino;
        this.dias = dias;
        this.precio = precio;
    }

    mostrar(){
        console.log(`${this.origen} / ${this.destino}`);
        console.log(`durante ${this.dias} dias: EUR${this.precio}`);
    }
}
let miViaje = new Viaje("Barcelona", "Ibiza", 5, 122);
miViaje.mostrar();

class OfertaViaje extends Viaje{
    descuento;
    constructor(origen, destino, dias, precio, descuento){
        super(origen, destino, dias, precio);
        this.descuento = descuento;
    }

    mostrar(){
        console.log(`Oferta: ${this.origen} -> ${this.destino} | Precio original: ${this.precio}€ | Con descuento: ${this.descuento}€`)
    }
}

let viajeOferta = new OfertaViaje("Barcelona", "Ibiza", 5, 122, 100);
viajeOferta.mostrar();