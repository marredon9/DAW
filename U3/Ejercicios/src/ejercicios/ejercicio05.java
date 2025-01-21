package ejercicios;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final double propina = 0.1;
		double costo_comida;
		double total_propina = 0.0;

		do {
			System.out.println("Ingresar el costo de la comida: ");
			costo_comida = sc.nextDouble();
			if (costo_comida > 0.0) {
				total_propina = costo_comida * propina;
			} else {
				System.out.println("Error");
				break;
			}

			System.out.println("El total de propinas es de: " + total_propina);

		} while (costo_comida != 0.0);

		sc.close();
	}

}

