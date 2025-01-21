package Sesiones;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe nombre y apellido ");
		
		String nombre = sc.nextLine();
		nombre = nombre.replaceAll("[aeiouáéíóúAEIOUÁÉÍÓÚ]", "");
		System.out.println(nombre);
		sc.close();
	}

}
