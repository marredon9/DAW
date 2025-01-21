package ejercicios;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double millas;
		final double kilometros = 1.60934;
		double kilometros_totales = 0;

		do {

			System.out.println("Ingresa las millas que deseas convertir: ");
			millas = sc.nextDouble();

			if (millas >= 0) {
				kilometros_totales = millas * kilometros;
			} else {
				System.out.println("Error, es negativo");
				break;
			}
			System.out.println("Los km son de: " + kilometros_totales + "Km");
		} while (millas >= 0);

		sc.close();
	}

}

