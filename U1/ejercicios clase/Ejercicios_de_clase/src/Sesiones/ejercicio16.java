package Sesiones;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero para a: ");
		double a = sc.nextDouble();
		
		System.out.println("Introduzca un numero para b: ");
		double b = sc.nextDouble();
		
		boolean iguales;
		iguales = a == b;
		System.out.println("Es: " + iguales);
		sc.close();
	}

}
