package Sesiones;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe tu numero de telefono: ");
		int numero = sc.nextInt();
		System.out.println("Tu número es: " + numero);
		sc.close();
	}

}
