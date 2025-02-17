package Ejercicio2;

import java.io.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		File archivo = new File ("saludos.txt");
		
		if(archivo.exists()) {
			System.out.println("El archivo " + archivo +" ya existe");
		}else {
			try (FileWriter escribir = new FileWriter(archivo)) {
				escribir.write("Hola, mundo!");
				System.out.println("El archivo "  + archivo + " se ha creado correctamente");
				
			}catch(IOException e){
				System.out.println("Error");
			}
		}

	}

}
