package ejercicios;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresar número: ");
		int numero = sc.nextInt();

		long factorial = 1;

		if (numero < 0) {
			System.out.println("Es número negativo, no se puede");
		} else {
			for (int i = 1; i <= numero; i++) {
				factorial *= i;
			}
			System.out.println("El factorial es de: " + factorial);
		}
		sc.close();
	}
}
