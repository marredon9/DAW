package Ejercicios;

import java.util.Scanner;

public class media_modificada04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresar primera nota: ");
		double	n1 = sc.nextDouble();
		
		System.out.println("Ingresar segunda nota: ");
		double n2 = sc.nextDouble();
		
		System.out.println("Ingresar tercera nota: ");
		double	n3 = sc.nextDouble();
		
		double media_aritmetica = (n1 + n2 + n3) / 3.0;
		
		int media = (int) media_aritmetica;
		
		System.out.println("La media aritmética es de: " + media);
		sc.close();
	}

}
