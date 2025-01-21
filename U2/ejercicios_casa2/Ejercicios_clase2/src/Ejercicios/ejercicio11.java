package Ejercicios;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Día: ");
		int dia = sc.nextInt();

		System.out.println("Mes: ");
		int mes = sc.nextInt();

		System.out.println("Año: ");
		int año = sc.nextInt();

		if (dia > 31 || mes > 13 || año < 0) {
			System.out.println("No trolees");
		} else {
			switch (mes) {
			case 2:
				if (dia > 28) {
					System.out.println("No trolees");
				}
				break;

			case 1, 3, 5, 7, 8, 10, 12:
				if (dia > 31) {
					System.out.println("No trolees");
				}
				break;

			case 4, 6, 9, 11:
				if (dia > 30) {
					System.out.println("No trolees");
				}
				break;

			default:
				System.out.println("Deja ya de trolear");
			}
		}
		sc.close();
	}

}
