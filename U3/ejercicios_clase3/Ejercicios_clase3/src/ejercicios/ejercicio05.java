package ejercicios;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa numero: ");
		int i = sc.nextInt();

		while (i >= 0)
		{
			System.out.println("El número es: " + i);
			System.out.println("Ingresa numero: ");
			i = sc.nextInt();
		}
		System.out.println("Es negativo");
		sc.close();
	}

}
