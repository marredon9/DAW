package Ejercicios;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el primer numero: ");
		int numero1 = sc.nextInt();

		System.out.println("Introduce el segundo número: ");
		int numero2 = sc.nextInt();

		boolean multiplo = (numero1 % numero2 == 0);
		System.out.println("¿El primero es multiplo del segundo?: " + multiplo);

		sc.close();
	}

}
