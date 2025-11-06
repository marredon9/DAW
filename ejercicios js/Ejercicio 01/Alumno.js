class Alumno{
    nombre;
    apellido;
    notas = [];

    constructor(nombre, apellido, notas){
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas;
    }

    calcularMedia(){
        let suma = 0;
        for(let i = 0; i < this.notas.length; i++){
            suma += this.notas[i];
        }
        suma /= this.notas.length;
        return suma;
    }

    mostrarInfo(){
        console.log(`${this.nombre} ${this.apellido} con una media de  ${this.calcularMedia()}`);
    }
}

console.log("patata");
let alumnos = [
    new Alumno("Marina", "Redondo", [6, 8, 5, 8, 9]),
    new Alumno("Patata", "Patatero", [2, 8, 6, 9, 1]),
    new Alumno("Eneritz", "Kareaga", [5, 8, 6, 9, 4])
];

let mejorAlumno = alumnos[0];
for(let i = 1; i < alumnos.length; i++) {
    if(alumnos[i].calcularMedia() > mejorAlumno.calcularMedia()) {
        mejorAlumno = alumnos[i];
    }
}

console.log("El alumno con mejor media es:");
mejorAlumno.mostrarInfo();


