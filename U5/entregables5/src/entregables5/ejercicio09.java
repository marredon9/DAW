package entregables5;

import java.util.*;

public class ejercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String palabras[] = new String[5];

		for (int i = 0; i < palabras.length; i++) {

			System.out.println("Introduce una palabra: ");
			palabras[i] = sc.next();
		}

		String resultado = "";

		for (String palabra : palabras) {
			resultado += palabra;
		}

		System.out.println(resultado);
		sc.close();
	}

}
