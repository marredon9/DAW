 package Ejercicios;

import java.util.Scanner;

public class media_aritmetica03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresar primera nota: ");
		int	n1 = sc.nextInt();
		
		System.out.println("Ingresar segunda nota: ");
		int n2 = sc.nextInt();
		
		double media_aritmetica = (n1 + n2) / 2.0;
		System.out.println("La media aritmética es de: " + media_aritmetica);
		sc.close();
	}

}
