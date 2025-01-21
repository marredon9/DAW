package Ejercicios;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Pon numero: ");
		double decimal = sc.nextDouble();

		if (decimal < 1.0 && decimal > -1.0 && decimal != 0.0) {
			System.out.println(decimal + " se acerca a 0");
		} else {
			System.out.println(decimal + " no ce acerca a 0");
		}
		sc.close();
	}

}
