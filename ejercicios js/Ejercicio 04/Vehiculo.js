class Vehiculo{
    marca;
    modelo;
    año;

    constructor (marca, modelo, año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }


    mostrarInfo(){
        console.log(`Marca: ${this.marca} | Modelo: ${this.modelo} | Año: ${this.año}`);
    }
}

class Coche extends Vehiculo{
    puertas;

    constructor(marca, modelo, año, puertas){
        super(marca, modelo, año);
        this.puertas = puertas;
    }

    mostrarInfo(){
        console.log(`Marca: ${this.marca} | Modelo: ${this.modelo} | Año: ${this.año} | Puertas: ${this.puertas}`);
    }

}

class Moto extends Vehiculo{
    cilindrada;

    constructor(marca, modelo, año, cilindrada){
        super(marca, modelo, año);
        this.cilindrada = cilindrada;
    }

    mostrarInfo(){
        console.log(`Marca: ${this.marca} | Modelo: ${this.modelo} | Año: ${this.año} | Cilindrada: ${this.cilindrada}`);
    }
}

let coches = [
    new Coche("Audi", "A4", 2013, 4),
    new Coche("Nissan", "XTRAIL", 2025, 5),
    new Coche("Ford", "Focus", 2019, 5)
];

let motos = [
    new Moto("Yamaha", "R7", 2025, "700cc"),
    new Moto("Harley-Davidson", "Nightster Special", 2025, "975cc"),
    new Moto("Honda", "CBR500R", 2024, 471)
];

console.log(`-----Coches-----`);
for(let i = 0; i < coches.length; i++){
    coches[i].mostrarInfo();
}

console.log(`-----Motos-----`);
for(let i = 0; i < motos.length; i++){
    coches[i].mostrarInfo();
}