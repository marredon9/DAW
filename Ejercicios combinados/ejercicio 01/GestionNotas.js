class Alumno {
    nombre;
    notas;

    constructor(nombre, notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    calcularMedia() {
        const suma = this.notas.reduce((acc, n) => acc + n, 0);
        return (suma / this.notas.length).toFixed(2);
    }

    toString() {
        console.log(`Alumno: ${this.nombre} | Notas: ${this.notas.join(", ")} | Media: ${this.calcularMedia()}`);
    }
}

// Pedir número de alumnos
const numeroAlumnos = parseInt(prompt("¿Cuántos alumnos hay?"));
let alumnos = [];

for (let i = 0; i < numeroAlumnos; i++) {
    const nombre = prompt(`Nombre del alumno ${i + 1}:`);
    const notas = [];

    for (let j = 0; j < 3; j++) {
        const nota = parseFloat(prompt(`Nota ${j + 1} de ${nombre}:`));
        notas.push(nota);
    }

    alumnos.push(new Alumno(nombre, notas));
}

// Mostrar datos de cada alumno
console.log("----Datos de Alumnos----");
for (let alumno of alumnos) {
    alumno.toString();
}

// Calcular alumno con mejor media
let mejorAlumno = alumnos[0];
for (let alumno of alumnos) {
    if (parseFloat(alumno.calcularMedia()) > parseFloat(mejorAlumno.calcularMedia())) {
        mejorAlumno = alumno;
    }
}

// Calcular media general del grupo
let sumaMedias = alumnos.reduce((acc, alumno) => acc + parseFloat(alumno.calcularMedia()), 0);
let mediaGrupo = (sumaMedias / alumnos.length).toFixed(2);

console.log("\n----Resumen----");
console.log(`Mejor alumno: ${mejorAlumno.nombre} con media de ${mejorAlumno.calcularMedia()}`);
console.log(`Media general del grupo: ${mediaGrupo}`);
