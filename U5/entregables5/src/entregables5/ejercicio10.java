package entregables5;

import java.util.*;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero1[] = new int[5];
		int numero2[] = new int[5];
		int suma[] = new int[5];

		System.out.println("Intoduce 5 numeros para numero1");
		for (int i = 0; i < numero1.length; i++) {
			numero1[i] = sc.nextInt();
		}

		System.out.println("Intoduce 5 numeros para numero2");
		for (int i = 0; i < numero2.length; i++) {
			numero2[i] = sc.nextInt();
		}

		for (int i = 0; i < suma.length; i++) {
			suma[i] = numero1[i] + numero2[i];
		}

		System.out.println("La suma de los dos arrays es de: " + Arrays.toString(suma));
		sc.close();
	}
}
