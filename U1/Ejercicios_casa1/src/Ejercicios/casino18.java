package Ejercicios;

import java.util.Scanner;

public class casino18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Resultado del dado 1: ");
		int dado1 = sc.nextInt();

		System.out.println("Resultado del dado 2: ");
		int dado2 = sc.nextInt();

		System.out.println("Resultado del dado 3: ");
		int dado3 = sc.nextInt();

		if (dado1 == 6 && dado2 == 6 && dado3 == 6) {
			System.out.println("Excelente");
		} else if (dado1 == 6 && dado2 == 6 || dado1 == 6 && dado3 == 6 || dado2 == 6 && dado3 == 6) {
			System.out.println("Muy bien");
		} else if (dado1 == 6 || dado2 == 6 || dado3 == 6) {
			System.out.println("Regular");
		} else {
			System.out.println("Pésimo");
		}
		sc.close();
	}
}
