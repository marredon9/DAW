package ejercicios;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int asistencia = 0;
		int si = 0;
		int no = 0;

		for (int i = 1; i <= 10; i++) {

			System.out.println("Nombre del estudiante: ");
			String nombre = sc.next();
			asistencia = 0;
			while (asistencia != 1 && asistencia != 2) {
				System.out.println("¿Ha asistido hoy? 1.Sí 2.No");
				asistencia = sc.nextInt();

				switch (asistencia) {
				case 1:
					si++;
					break;
				case 2:
					no++;
					break;
				default:
					System.out.println("Número introducido no es correcto");
					break;
				}
			}
		}
		System.out.println("Han asistido " + si + " alumnos.");
		System.out.println("Han faltado " + no + " alumnos.");
		
		sc.close();
	}

}
