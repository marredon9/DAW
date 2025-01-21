package entregables5;

import java.util.*;

public class ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int candidatos[] = new int[3];
		String[] candidato = { "Candidato1", "Candidato2", "Candidato3" };

		int voto;

		do {
			System.out.println("Ingresar el candidato que quieres votar:");
			System.out.println("1. Cadidato1");
			System.out.println("2. Candidato2");
			System.out.println("3. Candidato3");
			System.out.println("0. Terminada la votación");

			System.out.println("Voto: ");
			voto = sc.nextInt();
			if (voto != 0) {
				while (voto < 0 || voto > 3) {
					System.out.println("Error, ingresa numero válido");
					voto = sc.nextInt();
				}

				candidatos[voto - 1]++;
			}
		} while (voto != 0);

		int maxVotos = candidatos[0];
		int ganador = 0;

		for (int i = 1; i < candidatos.length; i++) {
			if (candidatos[i] > maxVotos) {
				maxVotos = candidatos[i];
				ganador = i;
			}

		}

		System.out.println("El ganador es " + candidato[ganador]);
		
		sc.close();
	}

}
