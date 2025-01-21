package Ejercicios;

import java.util.Scanner;

public class distancias17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Milimetros: ");
		double milimetros = sc.nextDouble();
		
		System.out.println("Centimetros: ");
		double centimetros = sc.nextDouble();
		
		System.out.println("Metros: ");
		double metros = sc.nextDouble();
		
		double suma = ( metros *100) + (milimetros / 10) + centimetros;
		System.out.println(" La suma de las tres lonngitudes en centimetros "
				+ "es de: " + suma + "cm");
		
		sc.close();
	}

}
