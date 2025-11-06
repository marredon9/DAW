class Empleado {
    nombre;
    salarioBase;
    añosServicio;

    constructor(nombre, salarioBase, añosServicio) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.añosServicio = Math.max(añosServicio, 0);
    }

    calcularSueldo() {
        let incremento = this.salarioBase * 0.03 * this.añosServicio;
        return this.salarioBase + incremento;
    }

    subirSueldo(cantidad) {
        if (cantidad <= 0) {
            console.log(`No hay subida de salario.`);
        }else{
            this.salarioBase += cantidad;
        }
    }

    toString(){
        console.log(`Empleado: ${this.nombre} | Base: ${this.salarioBase} | Años: ${this.añosServicio}`);
    }
}

let empleados = [
    new Empleado("Unax", 500, 4),
    new Empleado("Iker", 400, 5),
    new Empleado("Eneritz", 600, 3)
];

console.log("----Sueldo Final----");
for (let empleado of empleados) {
    console.log(`${empleado.nombre}: ${empleado.calcularSueldo()}€`);
}

console.log("\n----Subida de Sueldo----");
empleados[1].subirSueldo(100);
console.log(`${empleados[1].toString()}`);

console.log("\n----Datos de Empleados----");
for (let empleado of empleados) {
    console.log(empleado.toString());
}