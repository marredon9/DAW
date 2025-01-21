package ejercicios;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String carne1 = "carne de wagyu";
		String carne2 = "carne kobe";
		String carne3 = "carne buey";
		double wagyu = 0.0;
		double kobe = 0.0;
		double buey = 0.0;
		int cantidad = 0;
		boolean salir = false;


		while (!salir) {
			System.out.println("Qué te parece, del 1 al 5 " + carne1);
			int respuesta1 = sc.nextInt();

			if (respuesta1 <= 0 || respuesta1 > 5) {
				while (respuesta1 <= 0 || respuesta1 > 5) {
					System.out.println("Los valores introducidos son incorrectos, pruebe otra vez.");
					respuesta1 = sc.nextInt();
				}

			}
			wagyu += (double) respuesta1;

			System.out.println("Qué te parece, del 1 al 5 " + carne2);
			int respuesta2 = sc.nextInt();

			if (respuesta2 <= 0 || respuesta2 > 5) {
				while (respuesta2 <= 0 || respuesta2 > 5) {
					System.out.println("Los valores introducidos son incorrectos, pruebe otra vez.");
					respuesta2 = sc.nextInt();
				}

			}
			kobe += (double) respuesta2;

			System.out.println("Qué te parece, del 1 al 5 " + carne3);
			int respuesta3 = sc.nextInt();

			if (respuesta3 <= 0 || respuesta3 > 5) {
				while (respuesta3 <= 0 || respuesta3 > 5) {
					System.out.println("Los valores introducidos son incorrectos, pruebe otra vez.");
					respuesta3 = sc.nextInt();
				}
			}
			buey += (double) respuesta3;
			
			cantidad++;
			
			System.out.println("¿Desea continuar? 1.Si 2.No");
			int respuesta = sc.nextInt();
			
			switch (respuesta){
			case 1:
				break;
			case 2:
				salir = true;
				break;
			default:
				System.out.println("Error");
				break;
			}
		}
		
		//promedios
		
		wagyu = wagyu / cantidad;
		kobe = kobe / cantidad;
		buey = buey / cantidad;
		
		System.out.println("El promedio de " + carne1 + " es de " + wagyu);
		System.out.println("El promedio de " + carne2 + " es de " + kobe);
		System.out.println("El promedio de " + carne3 + " es de " + buey);

		sc.close();
	}

}
