package Sesiones;

import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe los Mb que quieres convertir: ");
		double MB = sc.nextDouble();
		double KB = MB * 1000;
		System.out.println("Son :" + KB + "Kb");
		sc.close();
	}

}
