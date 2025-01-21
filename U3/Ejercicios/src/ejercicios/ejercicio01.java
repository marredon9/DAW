package ejercicios;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String pin_correcto = "1234";
		int saldo = 1000;
		int intentos = 0;
		int max_intentos = 3;
		int opcion = 0;
		String pin = "";

		do {
			System.out.println("Introduce el pin: ");
			pin = sc.nextLine();
			if (pin.equals(pin_correcto)) {
				System.out.println("Bienvenido :)");
				break;
			} else {
				intentos++;
				System.out.println("Pin incorrecto. Tienes " + (max_intentos - intentos));
			}
			if (intentos == max_intentos) {
				System.out.println("Error, demasiados intentos");
			}
		} while (intentos < max_intentos);

		if (intentos < max_intentos) {
			do {
				System.out.println("\t Seleccione la opción: ");
				System.out.println("\n");
				System.out.println("\t 1. Depositar dinero");
				System.out.println("\t 2. Retirar dinero");
				System.out.println("\t 3. Consultar saldo");
				System.out.println("\t 4. Salir");
				opcion = sc.nextInt();

				switch (opcion) {
				case 1:
					System.out.print("Dinero a depositar: ");
					int depositar = sc.nextInt();
					if (depositar > 0) {
						saldo = depositar + saldo;
						System.out.print("El saldo actualizado es de: " + saldo + "\n");
					}
					break;
					
				case 2:
					System.out.print("Dinero a retitar: ");
					int retirar = sc.nextInt();
					if (retirar > saldo) {
						System.out.println("El saldo actualizado es insuficiente");
					} else if (retirar <= 0) {
						System.out.println("Error, tiene que ser superior a 0");
					} else {
						saldo = saldo - retirar;
						System.out.println("Saldo actualizado: " + saldo);
					}
					break;
					
				case 3:
					System.out.println("El saldo es de: " + saldo);
					break;

				case 4:
					System.out.println("Salir ");
					break;
				}

			} while (opcion != 4);
		}
		sc.close();
	}
}


