package Ejercicios;

import java.util.Scanner;

public class areaTriangulo14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Base: ");
		double base = sc.nextDouble();
		
		System.out.println("Altura: ");
		double altura = sc.nextDouble();
		
		double area;
		area = (base * altura) / 2;
		
		System.out.println("El área del triángulo es de: " + area);
		
		sc.close();
	}

}
