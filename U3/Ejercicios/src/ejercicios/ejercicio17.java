package ejercicios;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double saldo_final = 0;
		double porcentaje = 0;

		System.out.println("Ingresa el saldo inicial: ");
		double saldo = sc.nextDouble();

		System.out.println("Ingresa la tasa de interés anual: ");
		double tasa = sc.nextDouble();

		System.out.println("Ingresa numero de años: ");
		int años = sc.nextInt();

		porcentaje = tasa / 100;

		for (int i = 1; i <= años; i++) {

			saldo_final = (saldo + (saldo * porcentaje));
			saldo = saldo_final;
			System.out.println("El saldo en el año " + i + " es de " + saldo_final);

		}

		System.out.println("El saldo final es de: " + saldo_final);
		
		sc.close();
	}

}
