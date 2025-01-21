package entregables5;

import java.util.*;

public class ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeros[] = new int [15];
		
		System.out.println("Introduce 15 números: ");
		for (int i = 0; i < numeros.length;i++) {
			
			numeros[i] = sc.nextInt();
		}
		
		int [] pares = numeros.clone();
		for (int par : pares) {
			if (par %2 == 0)
				System.out.println(par);
		}
		
		sc.close();
	}

}
