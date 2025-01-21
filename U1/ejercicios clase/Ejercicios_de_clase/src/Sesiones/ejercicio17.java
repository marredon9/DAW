package Sesiones;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca sus resultados en metros: ");
		
		double metros = sc.nextDouble();
		double centimetros = metros * 100;
		int centimetros_enteros = (int) (centimetros);
		
		System.out.println("Este es el resultado en centimetros " + centimetros_enteros);
		sc.close();
	}

}
