package Ejercicios;

import java.util.Scanner;

public class nacimiento_usuario01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu año de nacimiento: ");
		int	año_nacimiento = sc.nextInt();
		System.out.println("Introduce año actual: ");
		int	año_actual = sc.nextInt();
		System.out.println("Tienes : " + (año_actual - año_nacimiento));
		
		sc.close();
	}

}
