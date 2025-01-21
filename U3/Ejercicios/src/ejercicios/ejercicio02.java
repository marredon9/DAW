package ejercicios;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horas_totales = 0;

		double salario_total = 0;

		System.out.println("Ingresa salario por hora: ");
		double salario_hora = sc.nextDouble();
		

		for (int i = 1; i <= 7; i++) {
			System.out.println("\n");
			System.out.println("Ingrese las horas trabajadas el " + i);
			int horas = sc.nextInt();

			horas_totales += horas;
			
			while (horas > 24) {
				System.out.println("Error");
				System.out.println("Vuelve a introducir las horas trabajadas: ");
				horas = sc.nextInt();
			}

		}

		if (horas_totales <= 40) {
			salario_total = salario_hora * (double) horas_totales;
		} else {
			salario_total = (salario_hora * 40) + ((horas_totales - 40) * (1.5 * salario_hora));
		}

		System.out.println("El salario total es de " + salario_total + " por " + horas_totales + " h trabajadas");
		sc.close();
	}

}
