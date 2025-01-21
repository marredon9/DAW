package Ejercicios;

import java.util.Scanner;

public class redondeoExceso07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresar numero decimal: ");
		double decimal = sc.nextDouble();

		int redondeo = (int) Math.ceil(decimal);
		System.out.println("El numero redondeado es: " + redondeo);
		sc.close();
	}

}