package Ejercicios;

import java.util.Scanner;

public class polinomio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coeficiente de a: ");
		double a = sc.nextDouble();
		
		System.out.println("Coeficiente de b: ");
		double b = sc.nextDouble();
		
		System.out.println("Valor de x: ");
		double x = sc.nextDouble();
		
		final double e = 2.7;
		
		double y;
		y = ((a * (x * x)) + (b * x) + e);
		
		System.out.println("El valor correspondiente de y es: " + y);

		sc.close();
	}

}
