package Ejercicios;

import java.util.Scanner;

public class multiplos12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introducir num entero: ");
		int num = sc.nextInt();
		
		int resto = num % 7;
		int suma = (resto == 0) ? 0 : (7 - resto);
		int resultado = num + suma;
		
		System.out.println("A " + num + " hay que sumarle " + suma + 
				" para que el resultado " + resultado + " sea multiplo de 7");
		
		sc.close();
	}

}
