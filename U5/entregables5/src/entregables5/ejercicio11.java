package entregables5;

import java.util.*;

public class ejercicio11 {

	public static String[] pedirUsuario(String[] palabraUsuario) {
		Scanner sc = new Scanner (System.in);
		
		boolean valido = false;
		
		System.out.println("---Introduce 10 palabras---");
		for (int i = 0; i < palabraUsuario.length; i++) {
			valido = false;
			System.out.println("Palabra " + (i + 1) + ": ");
			do {
				if (sc.hasNext()) {
					palabraUsuario[i] = sc.next();
					valido = true;
					
				} else {
					System.out.println("El dato introducido no es válido.");
					sc.next();
				}
			}while (!valido);
		}
		sc.close();
		return palabraUsuario;
	}
	
	
	
	public static void comprobar(String[] palabraUsuario, String[] palabraProhibida) {
		for (int i = 0; i < palabraUsuario.length; i++) {
			
			for (int j = 0; j < palabraProhibida.length; j++) {
				if (palabraUsuario[i].equalsIgnoreCase(palabraProhibida[j])) {
					
					System.out.println(palabraUsuario[i] + " es igual a " + palabraProhibida[j]);
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {

		String[] palabraProhibida = {"Chocolate", "arisco", "magnifico", "caracol", "dormir", "cacahuete", "esperpento", "perro"} ;
		String [] palabraUsuario = new String [10];
		
		palabraUsuario = pedirUsuario(palabraUsuario);
		comprobar(palabraUsuario, palabraProhibida);
		System.out.println();
		
		//------------PEDIR AL USUARIO Y VERIFICAR QUE EL DATO ES CORRECTO
		
		//------------COMPROBAR
		
		
	}

}
