package ejercicios;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa la cantidad de numeros que quieres sumar: ");
		int cantidad = sc.nextInt();
		
		int suma = 0;
		for (int i = 1; i <= cantidad; i ++) {
			System.out.println("Ingresa el numero para sumarlo: ");
			int numero = sc.nextInt();
			suma += numero;
		}
		
		double promedio = (double) suma / cantidad;
		
		System.out.println("El promedio es: " + promedio);
		sc.close();
	}

}
