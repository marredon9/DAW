package Sesiones;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Edad suya: ");
		int edad = sc.nextInt();
		System.out.println("Su edad es: " + edad);
		System.out.println("Su edad el año que viene es: " + (edad + 1));
		sc.close();
	}

}
