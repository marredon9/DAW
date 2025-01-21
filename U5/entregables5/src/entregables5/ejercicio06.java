package entregables5;

import java.util.*;

public class ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int paquetesRepartidos = 0;
		int total = 50;
		int paquete[] = new int[50];
		int dia = 0;
		int paqueteHoy = 0;
		
		boolean valido = false;

		while (paquetesRepartidos < total) {
			dia++;
			valido = false;
			do {
				System.out.println("Introducir paquetes repartidos dia " + (dia));
				if (sc.hasNextInt()) {
					paqueteHoy = sc.nextInt();
					valido = true;
				} else {
					System.out.println("El dato introducido no es correcto.");
					sc.next();
				}
			}while (!valido);

			if (paqueteHoy < 0 || paqueteHoy > (total - paquetesRepartidos)) {
				System.out.println("Error, numero no válido, introduce un numero válido");
				paqueteHoy = sc.nextInt();
			}
			paquete[dia - 1] = paqueteHoy;
			
			paquetesRepartidos += paqueteHoy;
			
			
		}
		for (int i = 0; i < dia; i++) {
			if(paquete[i] > 10)
				System.out.println("Se ha repartido más de 10 paquetes el día " + (i + 1));
			
		}
		sc.close();
	}

}
