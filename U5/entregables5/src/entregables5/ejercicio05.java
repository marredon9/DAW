package entregables5;

import java.util.*;

public class ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero [] = new int [8];
		boolean valido = false;
		
		for (int i = 0; i < numero.length; i++) {
			valido = false;
			System.out.println("Introduce un número: ");
			do {
				if (sc.hasNextInt()) {
					numero[i] = sc.nextInt();
					valido = true;
				}else{
					System.out.println("El dato introducido no es correcto.");
					sc.nextLine();
				}
			} while (!valido);
		}
		
		int ultimo = numero[numero.length - 1];
		
		for (int i = numero.length -1; i > 0; i--) {
			numero[i] = numero [i - 1];
		}
		
		numero[0] = ultimo;
		
		System.out.println("Array rotado: ");
		for(int num : numero) {
			System.out.println(num + " ");
		}
		
		
		sc.close();
	}

}
