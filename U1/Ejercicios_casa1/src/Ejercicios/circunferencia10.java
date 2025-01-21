package Ejercicios;

import java.util.Scanner;

public class circunferencia10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introducir radio: ");
		double radio = sc.nextDouble();
		
		final  double pi = 3.1415;
		double longitud = 2 * pi * radio;
		double area = pi * (radio * radio);
		System.out.println("La longitud es de: " + longitud + " y el área de: " + area);
		sc.close();
	}

}
