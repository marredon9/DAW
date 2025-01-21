package entregables5;

import java.util.*;

public class ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
boolean valido = false;
			String palabra = "";
		
		do {
			
			System.out.println("Ingresa una palabra: ");
			
			if (sc.hasNext()) {
				
				palabra = sc.next();
				valido = true;
				
			} else {
				
				System.out.println("El dato introducido no es correcto.");
				
				sc.nextLine();
			}
			
		}while (!valido);
		char [] caracter = palabra.toCharArray();
		
		for (int i = 0; i < caracter.length; i++) {
			caracter[i] = (char)(caracter[i] + 2);
		}
		String cifrado = new String(caracter);
		System.out.println("El texto cifrado es: " + cifrado);
		
		sc.close();
	}

}
