package ejercicios;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cadena de texto: ");
		String frase = sc.nextLine();

		String frase_reves = "";

		for (int i = frase.length() - 1; i >= 0; i--) {
			frase_reves += frase.charAt(i);
		}
		System.out.println(frase_reves);

		sc.close();
	}

}
