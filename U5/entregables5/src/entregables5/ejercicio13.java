package entregables5;

import java.util.*;

public class ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] calificaciones = new int [10];
		int contador = 0;
		boolean valido = false;
		
		System.out.println("------Ingresa la calificacion de satisfacción------");
		System.out.println("-------------------Del 1 al 5----------------------");
		
		for (int i = 0; i < calificaciones.length ; i++) {
			valido = false;
			System.out.println("Calificación del cliente nº " + (i + 1) + " :");
			do {
				if (sc.hasNextInt()) {
					calificaciones[i] = sc.nextInt();
					valido = true;
					if(calificaciones[i] >= 4) {
						contador++;
					}
				}else {
					System.out.println("Dato introducido no válido");
					sc.next();
				}
			}while(!valido);
		}
		
		double porcentaje = (double) contador / 10*100;
		System.out.println("El porcentajje de calificaciones iguales o superiores a 4 es de: " + porcentaje + "%");
		
		sc.close();
	}

}
