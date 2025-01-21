package ejercicios;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean numPrimo;
		int col = 1;

		System.out.print("Introduce un número: ");
		int numero_usuario = sc.nextInt();
		
		System.out.println("Los numeros primos hasta " + numero_usuario + " son:");

		for (int numero = 1; numero <= numero_usuario; numero++) {
			numPrimo = true;

			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
					numPrimo = false;
				}
			}
			if (col == 10) {
				System.out.println();
				col = 1;
			}
			if (numPrimo == true) {
				System.out.print("\t" + numero);
				col++;
			}
		}
		
		sc.close();
	}

}
