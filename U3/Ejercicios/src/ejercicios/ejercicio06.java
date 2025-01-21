package ejercicios;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final double precio_boleto = 12.50;
		double total_pagar = 0;
		boolean salir = false;
		double cantidad = 0;

		while (!salir) {
			System.out.println("Introduce la cantidad de boletos que deseas comprar: ");
			cantidad = sc.nextDouble();

			if (cantidad < 0) {
				System.out.println("Error, no hay numeros negativos");
				salir = true;
			} else {
				total_pagar = cantidad * precio_boleto;
				System.out.println("Has pedido " + cantidad + " boletos.");
				System.out.println("El total es de " + total_pagar);
			}
			System.out.println("¿Deseas continuar? 1.Si 2.No");
			int respuesta = sc.nextInt();

			switch (respuesta) {
			case 1:
				System.out.println("Introduce la cantidad de boletos que deseas comprar: ");
				cantidad = sc.nextDouble();
				System.out.println("¿Deseas continuar? 1.Si 2.No");
				respuesta = sc.nextInt();
				break;
			case 2:
				salir = true;
				break;
			default:
				System.out.println("Error");
				break;
			}
		}
		total_pagar = cantidad * precio_boleto;
		System.out.println("El total a pagar es de " + total_pagar + "€");

		sc.close();
	}
}

