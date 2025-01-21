package Sesiones;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su peso en Kg: ");
		double peso = sc.nextDouble();
		System.out.println("Introduzca su altura en M: ");
		double altura = sc.nextDouble();
		double IMC = peso / (altura * altura);
		System.out.println("Tu indice de masa corporal es de: " + IMC);
		if (IMC >= 18 && IMC <= 25) {
			System.out.println("Estás saludable" );
		}
		sc.close();
	}
}
