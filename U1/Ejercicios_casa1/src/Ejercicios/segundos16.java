package Ejercicios;

import java.util.Scanner;

public class segundos16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Segundos: ");
		long segundos = sc.nextLong();
		
		long seg = segundos % 60;
		long min = (segundos % 3600) / 60;
		long horas = segundos / 3600;
		
		System.out.println(horas + " h " + min + " m " + seg + " s");

		sc.close();
	}

}
