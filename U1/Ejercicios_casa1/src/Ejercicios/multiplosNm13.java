package Ejercicios;

import java.util.Scanner;

public class multiplosNm13 {

		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Introducir n: ");
			int n = sc.nextInt();
			System.out.println("Introducir m: ");
			int m = sc.nextInt();
			
			int resto = n % m;
			int suma = (resto == 0) ? 0 : (m - resto);
			int resultado = n + suma;
			
			System.out.println("A " + n + " hay que sumarle " + suma + 
					" para que el resultado " + resultado + " sea multiplo de " + m);
			
			sc.close();
		}
	}