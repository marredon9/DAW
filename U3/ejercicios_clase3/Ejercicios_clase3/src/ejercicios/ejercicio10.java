package ejercicios;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = 0;

		do {
			System.out.println("Número: ");
			numero = sc.nextInt();
		} while (numero % 5 != 0);
		System.out.println(numero + " Es múltiplo de 5");
		sc.close();
	}

}
