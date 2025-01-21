package ejercicios;

import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Dame un número");
			numero = sc.nextInt();
			if (numero < 0) {
				break;
			}
			while (numero >= 0) {
				System.out.println(numero);
				numero--;
			}
			
		}while (numero == -1);

		sc.close();
	}

}