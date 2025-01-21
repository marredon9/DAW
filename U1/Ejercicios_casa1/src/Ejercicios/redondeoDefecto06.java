package Ejercicios;

import java.util.Scanner;

public class redondeoDefecto06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresar numero decimal: ");
		double decimal = sc.nextDouble();

		int redondeo = (int) Math.floor(decimal);
		System.out.println("El numero redondeado es: " + redondeo);
		sc.close();
	}

}