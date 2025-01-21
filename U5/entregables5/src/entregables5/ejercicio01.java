package entregables5;

import java.util.*;

public class ejercicio01 {

	
	public static double[] pedirCalificaciones(double[] calificaciones){
		Scanner sc = new Scanner(System.in);
		boolean valido = false;
		System.out.println("----Ingrese calificaciones----");

		for (int i = 0; i < calificaciones.length; i++) {
			valido = false;
			System.out.println("Estudiante " + (i + 1) + ": ");
			do {
				if (sc.hasNextDouble()) {
					calificaciones[i] = sc.nextDouble();
					valido = true;
					
					if (calificaciones[i] < 0 || calificaciones[i] > 10) {
						while (calificaciones[i] < 0 || calificaciones[i] > 10) {
							System.out.println("Error, ingrese número válido");
							calificaciones[i] = sc.nextDouble();
						}
					}
				} else {
					System.out.println("El dato introducido no es correcto.");
					sc.next();
				}
			} while (!valido);
		}
		sc.close();
		return calificaciones;
	}
	

	public static double calculoPromedio (double[] calificaciones) {
		double suma = 0;
		for (double cali : calificaciones) {
			suma += cali;
		}
		double promedio = suma / calificaciones.length;
		return promedio;
	}

	
	public static int calculoEncima(double[] calificaciones, double promedio) {
		int encimaPromedio = 0;
		for (double cali : calificaciones) {
			if (cali > promedio)
				encimaPromedio++;
		}
		return encimaPromedio;
	}
	
	
	public static void main(String[] args) {
		
		double[] calificaciones = new double[10];

		calificaciones = pedirCalificaciones(calificaciones);

		System.out.println("El promedio es de " + calculoPromedio(calificaciones)
				+ " y el numero de estudiantes por encima del promedio es de " 
				+ calculoEncima(calificaciones, calculoPromedio(calificaciones)) + " estudiantes.");
		
	}

}
