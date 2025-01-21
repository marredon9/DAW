package Ejercicios;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Día: ");
		int dia = sc.nextInt();

		System.out.println("Mes: ");
		int mes = sc.nextInt();

		System.out.println("Año: ");
		int año = sc.nextInt();

		dia = dia + 1;

		switch (mes) {
		case 2:
			if (dia > 28) {
				dia = 1;
				mes = mes + 1;
			}
			break;

		case 1, 3, 5, 7, 8, 10, 12:
			if (dia > 31) {
				dia = 1;
				mes = mes + 1;
			}
			break;

		case 4, 6, 9, 11:
			if (dia > 30) {
				dia = 1;
				mes = mes + 1;
			}
			break;

		default:
			System.out.println("Deja ya de trolear");
		}

		if (mes > 12) {
			mes = 1;
			año = año + 1;
		}

		System.out.println(dia + " / " + mes + " / " + año);
		sc.close();
	}
}
