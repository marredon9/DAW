package Ejercicios;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Numero 1: ");
		int num1 = sc.nextInt();

		System.out.println("Numero 2: ");
		int num2 = sc.nextInt();

		if (num1 < num2) {
			System.out.println(num2 + " es mayor que " + num1);
		} else if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else {
			System.out.println(num1 + " es igual que " + num2);
		}
		sc.close();
	}

}
