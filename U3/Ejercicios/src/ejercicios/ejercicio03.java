package ejercicios;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int edad;
		int media = 0;
		int i = 0;
		int total_edades = 0;

		do {

			System.out.println("Ingresa edad: ");
			edad = sc.nextInt();

			if (edad >= 0) {
				i++;
				total_edades += edad;
			} else {
				System.out.println("Edad incorrecta");
				break;
			}

		} while (edad >= 0);

		media = total_edades / i; 
		System.out.println("La media es de: " + media);

		sc.close();
	}

}
