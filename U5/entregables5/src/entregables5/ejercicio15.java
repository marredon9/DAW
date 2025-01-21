package entregables5;

import java.util.*;

public class ejercicio15 {

	public static void main(String[] args) {
		int[] numeros = new int [10];
		Random random = new Random();
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(50) + 1;
		}
		Arrays.sort(numeros);
		
		System.out.println("Numeros aleatorios ordenados: " + Arrays.toString(numeros));
	}

}
