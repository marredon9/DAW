package Ejercicios;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Numero entero: ");
		int numero = sc.nextInt();

		if (numero >= 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		sc.close();
	}
}
