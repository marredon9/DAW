package Ejercicio3;

import java.io.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File archivo = new File ("multilinea.txt");
		
		if(archivo.exists()) {
			System.out.println("El archivo " + archivo +" ya existe");
		}else {
			try (FileWriter escribir = new FileWriter(archivo)) {
				escribir.write("Hola");
				escribir.write("\n" + "Pepsi");
				escribir.write("\n" + "Cola");
				System.out.println("El archivo "  + archivo + " se ha creado correctamente");
				
			}catch(IOException e){
				System.out.println("Error");
			}
		}

	}

}
