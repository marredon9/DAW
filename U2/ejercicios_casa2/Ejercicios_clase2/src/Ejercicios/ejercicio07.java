package Ejercicios;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("introduce numer1: ");
		int num1 = sc.nextInt();

		System.out.println("Introduce numero2: ");
		int num2 = sc.nextInt();

		System.out.println("Introducew numero3: ");
		int num3 = sc.nextInt();

		int mayor;
		int mediano;
		int menor;

		if (num1 >= num2 && num1 >= num3) {
			mayor = num1;
			if (num2 >= num3) {
				mediano = num2;
				menor = num3;
				System.out.println(mayor + ", " + mediano + ", " + menor);
			} else {
				mediano = num3;
				menor = num2;
				System.out.println(mayor + ", " + mediano + ", " + menor);
			}
		} else if (num2 >= num1 && num2 >= num2) {
			mayor = num2;
			if (num1 >= num3) {
				mediano = num1;
				menor = num3;
				System.out.println(mayor + ", " + mediano + ", " + menor);
			} else {
				mediano = num3;
				menor = num1;
				System.out.println(mayor + ", " + mediano + ", " + menor);
			}
		} else {
			mayor = num3;
			if (num1 >= num2) {
				mediano = num1;
				menor = num2;
				System.out.println(mayor + ", " + mediano + ", " + menor);
			} else {
				mediano = num2;
				menor = num1;
				System.out.println(mayor + ", " + mediano + ", " + menor);
			}
		}
		sc.close();
	}
}
