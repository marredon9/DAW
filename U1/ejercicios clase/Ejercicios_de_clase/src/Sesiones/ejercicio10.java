package Sesiones;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Radio del círculo: ");
		double radio = sc.nextDouble();
		double area = 3.1416 * (radio * radio);
		System.out.println("El área del círculo es de: " + area);
		sc.close();

	}

}
