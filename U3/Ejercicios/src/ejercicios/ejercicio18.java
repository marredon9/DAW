package ejercicios;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean valida;
		boolean numeros;
		boolean letras;

		do {
			valida = true;
			numeros = false;
			letras = false;
			System.out.print("Introduce contraseña: ");
			String contraseña = sc.next();

			if (contraseña.length() < 8) {
				System.out.println("Su contraseña es demasiado corta, mínimo 8 carácteres.");
				valida = false;
			}

			for (int i = 0; i < contraseña.length(); i++) {
				if (contraseña.charAt(i) >= 'A' && contraseña.charAt(i) <= 'z') {
					letras = true;
				}
				if (contraseña.charAt(i) >= '0' && contraseña.charAt(i) <= '9') {
					numeros = true;
				}
			}
			if (valida == true && letras == true && numeros == true) {
				System.out.print("La contraseña es correcta");
			} else if (letras == false) {
				System.out.print("La contraseña no contiene ninguna letra");
			} else if (numeros == false) {
				System.out.println("La contraseña no contiene numeros");
			}
		} while (valida == false || letras == false || numeros == false);
		sc.close();
	}

}
