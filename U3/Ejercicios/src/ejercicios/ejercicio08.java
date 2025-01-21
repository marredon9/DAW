package ejercicios;

import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double euros;
		final double dolares = 1.1;
		
		
		do {
			System.out.println("Introduce los euros que deseas convertir: ");
			euros = sc.nextDouble();
			
			if (euros >= 0) {
				euros = euros * dolares;
			} else {
				System.out.println("Error");
				break;
			}
			
			System.out.println("La cantidad es de: " + euros);
			
		} while (euros >= 0);
		
		sc.close();
	}

}
