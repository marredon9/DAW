package ejercicios;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int mes = 0;
		int deuda;
		
		System.out.println("Ingresar monto total de la deuda: ");
		deuda = sc.nextInt();
		System.out.println("Ingresar el pago mensual: ");
		int pago_mensual = sc.nextInt();

		do {

			if (deuda < 0) {
				System.out.println("Error, ingresar monto total de la deuda: ");
				deuda = sc.nextInt();
			}

			if (pago_mensual < 0) {
				System.out.println("Error, ingresar el pago mensual: ");
				pago_mensual = sc.nextInt();
			}

			mes++;
			deuda = deuda - pago_mensual;
			System.out.println("El mes " + mes + " tiene una deuda de " + deuda);

		} while (deuda > 0);

		sc.close();
	}
}