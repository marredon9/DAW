package Ejercicios;

import java.util.Scanner;

public class ejercicion17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nota A: (3 créditos)");
		double notaA = sc.nextDouble();
		
		System.out.println("Nota B: (4 créditos)");
		double notaB = sc.nextDouble();
		
		System.out.println("Nota C: (2 créditos)");
		double notaC = sc.nextDouble();
		
		double creditos = 3 + 4 + 2;
		double promedio = (notaA * 3 + notaB * 4 + notaC * 2) / creditos;

		if (promedio >= 10.5){
			System.out.println("Aprobado");
		} else {
			System.out.println("Suspenso");
		}
		System.out.printf("Promedio: %.2f%n", promedio);	
		sc.close();
	}

}
