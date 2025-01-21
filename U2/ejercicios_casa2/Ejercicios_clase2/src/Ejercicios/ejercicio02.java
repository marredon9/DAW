package Ejercicios;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Pon un numero para a: ");
		double a = sc.nextDouble();

		System.out.println("Pon numero para b: ");
		double b = sc.nextDouble();

		if ((a != b) && ((a == 0) || b == 0)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		sc.close();
	}
}
