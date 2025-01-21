package ejercicios;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cantidad de segundos: ");
		int total_segundos = sc.nextInt();
		
		int horas = 0;
		int minutos = 0;
		int segundos = total_segundos;
		
		while (segundos >= 3600) {
			horas ++;
			segundos -= 3600;
		}
		
		while (segundos >= 60)
		{
			minutos ++;
			segundos -= 60;
		}
		
		System.out.println("El tiempo es de: " + horas + "h " + minutos + "m " +
		segundos + "s");
		sc.close();
	}

}
