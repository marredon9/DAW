package Ejercicios;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Letra: ");
		char letra = sc.next().charAt(0);
		
		if (Character.isUpperCase(letra)) {
			System.out.println("La letra " + letra + " es mayúscula");
			
		}else if (Character.isLowerCase(letra)) {
			System.out.println("La letra " + letra + " es minúscula");
		}else {
			System.out.println("Error");
		}
		sc.close();
	}

}
