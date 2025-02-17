package Ejercicio1;

import java.io.*;

public class Ejercicio1 {


	public static void main(String[] args) {
		

		try{
			File archivo = new File ("datos.txt");
			if(archivo.createNewFile()) {
				System.out.println("Archivo " + archivo.getName() + " se ha creado correctamente.");
			}else {
				System.out.println("El archivo " + archivo.getName() + " ya existe.");
			}
			
		}catch (IOException e) {
			System.out.println("Error");
		}
	}

}
