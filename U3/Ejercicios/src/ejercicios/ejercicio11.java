package ejercicios;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura;
		double peso;
		double imc = 0;
		boolean salir = false;
		int respuesta;

		while (!salir) {

			do {

				System.out.println("Introduce altura: ");
				altura = sc.nextDouble();
				if (altura <= 0) {
					System.out.println("Altura no válida");
				}

			} while (altura <= 0);

			do {

				System.out.println("Introduce peso: ");
				peso = sc.nextDouble();
				if (peso <= 0) {
					System.out.println("Peso no válido");
				}

			} while (peso <= 0);

			imc = peso / (altura * altura);
			System.out.println("Tu imc es de: " + imc);

			do {
				System.out.println("¿Desea salir? 1.Si 2.No");
				respuesta = sc.nextInt();

				switch (respuesta) {
				case 1:
					salir = true;
					break;
				case 2:
					salir = false;
					break;
				default:
					System.out.println("Numero introducido no válido.");
					break;
				}
			} while (respuesta != 1 && respuesta != 2);
		}
		sc.close();
	}
}
