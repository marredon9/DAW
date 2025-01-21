 package Ejercicios;

import java.util.Scanner;

public class entero_proximo05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresar numero decimal: ");
		double decimal = sc.nextDouble();

		int redondeo = (int) Math.round(decimal);
		System.out.println("El numero redondeado es: " + redondeo);
		sc.close();
	}

}
