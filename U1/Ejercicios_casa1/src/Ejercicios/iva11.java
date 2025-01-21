package Ejercicios;

import java.util.Scanner;

public class iva11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el IVA deseado: ");
		double iva = sc.nextDouble();
		
		System.out.println("Introduce la base imponible: ");
		double base = sc.nextDouble();
		
		double total_iva = base * (iva / 100);
		double total = base + total_iva;
		System.out.println("El IVA es de : " + total_iva + " y el total es de: " + total);
		
		sc.close();
	}

}
