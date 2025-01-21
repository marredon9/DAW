package Ejercicios;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime hora: ");
		int hora = sc.nextInt();

		System.out.println("Dime minutos: ");
		int minutos = sc.nextInt();

		System.out.println("Dime segundos: ");
		int segundos = sc.nextInt();

		segundos++;

		if (segundos == 60) {
			segundos = 00;
			minutos++;
		}
		if (minutos == 60) {
			minutos = 00;
			hora++;
		}
		if (hora == 24) {
			hora = 00;
		}
		String numeroFormateado = String.format("[%02d:%02d:%02d]", hora, minutos, segundos);
		System.out.println(numeroFormateado);

		sc.close();
	}
}
