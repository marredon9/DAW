package Sesiones;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el radio de la circunferencia: ");
		double radio_circunferencia = sc.nextDouble();
		double longitud = 2* 3.1416 * radio_circunferencia;
		System.out.println("La longitud es de: " + longitud);
		sc.close();
	}

}
