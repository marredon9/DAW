package Ejercicios;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double palmera = 1.40;
		final double donut = 1.00;
		final double pitufoAceite = 1.20;
		final double pitufoTortilla = 1.60;
		final double zumo = 1.50;
		final double cafe = 1.20;
		
		System.out.println("¿Qué ha tomado de comer?");
		String comer = sc.next().toLowerCase();
		
		double precio = 0.0;
		
		switch (comer) {
			case "palmera":
				precio += palmera;
			break;
			case "donut":
				precio += donut;
			break;
			case "pitufo":
				System.out.println("¿Con aceite o tortilla?");
				String tipoPitufo = sc.next().toLowerCase();
				
				if (tipoPitufo.equalsIgnoreCase("aceite")) {
					precio += pitufoAceite;
				} else if (tipoPitufo.equalsIgnoreCase("tortilla")) {
					precio += pitufoTortilla;
				}else {
					System.out.println("Error");
				}
			break;
			default:
				System.out.println("Error");
		}
		
		System.out.println("¿Qué ha tomado de beber?");
		String beber = sc.next().toLowerCase();
		
		switch (beber) {
			case "zumo":
				precio += zumo;
			break;
			case "café":
				precio += cafe;
			break;
			default:
				System.out.println("Error");
		}
		System.out.println("El precio total es de: " + precio);
		sc.close();
	}

}
