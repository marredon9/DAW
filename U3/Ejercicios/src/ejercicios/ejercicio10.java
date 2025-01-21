package ejercicios;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int total = 0;

		do {
			System.out.println("Dame numero: ");
			numero = sc.nextInt();

			if (numero < 0) {
				System.out.println("Error");
				break;
			} else {
				total += numero;
				System.out.println("La suma es de " + total);
			}
		} while (numero > 0);

		sc.close();
	}

}
