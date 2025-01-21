package entregables5;

import java.util.*;

public class ejercicio02 {

	
	public static double[] pedirUsuario(double[] precios) {
		Scanner sc = new Scanner(System.in);
		boolean valido = false;
		for (int i = 0; i < precios.length; i++) {
			valido = false;
			System.out.println("Ingrese precio producto" + (i + 1) + ":");
			do {
				
				if (sc.hasNextInt()) {
					precios[i] = sc.nextDouble();
					valido = true;
				} else {
					System.out.println("El dato introducido no es correcto.");
					sc.next();
				}
			} while (!valido);
		}
		sc.close();
		return precios;
	}
	
	public static double buscarBarato(double[] precios) {
		double barato = precios[0];
		for (double precio : precios) {
			
			if (precio < barato)
				barato = precio;
		}
		return barato;
	}
	
	
	public static double buscarCaro(double[] precios) {
		
		double caro = 0;
		for (double precio : precios) {
			if (precio > caro)
				caro = precio;
		}
		return caro;
	}
	
	
	public static double diferenciaPrecios (double caro, double barato) {
		double dif = caro - barato;
		return dif;
	}
	
	public static void main(String[] args) {
		
		double[] precios = new double[20];
		precios = pedirUsuario(precios);
		
		System.out.println("Producto más caro: " + buscarCaro(precios));
		System.out.println("Producto más barato: " + buscarBarato(precios));
		System.out.println("Diferencia: " + diferenciaPrecios(buscarCaro(precios), buscarBarato(precios)));

	}
}
