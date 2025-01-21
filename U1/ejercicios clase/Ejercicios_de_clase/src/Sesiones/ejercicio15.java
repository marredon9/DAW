package Sesiones;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuál es la nota de tu primer examen? ");
		double primer_examen = sc.nextDouble();
		
		System.out.println("¿Cuál es tu nota media que deseas tener al final? ");
		double nota_media = sc.nextDouble();
		
		double segundo_examen = (( nota_media) - (primer_examen * 0.4)) / 0.6;
		System.out.println("La nota del segundo examen será: " + segundo_examen);
		
		sc.close();
	}
}
