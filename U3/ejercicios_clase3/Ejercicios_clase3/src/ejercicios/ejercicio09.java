package ejercicios;

import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrsa número: ");
		int numero = sc.nextInt();
		
		int suma = 0;
		
		while (numero != 0) {
			suma += numero % 10;
			numero /=10;
		}
		System.out.println("La suma es de: " + suma);
		sc.close();
	}

}
