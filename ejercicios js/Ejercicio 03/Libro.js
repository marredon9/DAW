class Libro {
    titulo;
    autor;
    paginas;
    
    constructor (titulo, autor, paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    getAutor(){
        return this.autor;
    }

    mostrarInfo(){
        console.log(`Título: ${this.titulo} | Autor: ${this.autor} | Página: ${this.paginas}`);
    }
}

class Biblioteca{
    libros;

    constructor (Libros){
        this.libros = Libros;
    }

    buscarPorAutor(nombreAutor){
        if(this.libros instanceof Array){
            for(let i = 0; i < this.libros.length; i++){
                if(this.libros[i].getAutor() == nombreAutor){
                    this.libros[i].mostrarInfo();
                }
            }
        }else{
            console.log("Envía un array de libros, porfis.");
        }
    }
}

const Libros = new Biblioteca([
    new Libro("La pequeña habitación de los misterios", "Masateru Konishi", 304),
    new Libro("Los tres mundos", "Santiago Posteguillo", 1040),
    new Libro("My grandfather The master detective", "Masateru Konishi", 300)
]);

Libros.buscarPorAutor("Masateru Konishi");