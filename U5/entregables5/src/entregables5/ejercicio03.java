package entregables5;

import java.util.*;

public class ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temp[] = new double[7];

		boolean valido = false;
		
		for (int i = 0; i < temp.length; i++) {
			valido = false;
			System.out.println("Introduce la temperatura dia " + (i + 1) + ":");
			do {
				if (sc.hasNextInt()) {
					temp [i] = sc.nextDouble();
					valido = true;
				} else{
					System.out.println("El dato introducido no es correcto.");
					sc.nextLine();
				}
			}while (!valido);
		}
		
		double suma = 0;
		
		for (double tempe : temp) {
			suma += tempe;
		}
		
		double promedio = suma / temp.length;
		System.out.println("El promedio es de: " + promedio);
		
		for (double tempe : temp) {
			if (tempe >= promedio)
				System.out.println("Estas son las temperaturas superiores al promedio: " + tempe);
		}
		
		sc.close();
	}

}
