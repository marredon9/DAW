package Ejercicios;

import java.util.*;

public class ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dame a: ");
		double a = sc.nextDouble();

		System.out.println("Dame b: ");
		double b = sc.nextDouble();

		System.out.println("Dame c: ");
		double c = sc.nextDouble();

		double x1;
		double x2;

		if ((b * b) - 4 * (a * c) >= 0) {
			x1 = (-b + (Math.sqrt((b * b) - 4 * (a * c)))) / 2 * a;
			System.out.println("Es real" + x1);
		} else {
			x2 = (-b - (Math.sqrt((b * b) - 4 * (a * c)))) / 2 * a;
			System.out.println("Es irreal" + x2);
		}
		sc.close();
	}
}
