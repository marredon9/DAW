package ejercicios;

public class ejercicio12 {

	public static void main(String[] args) {
		
		int coche1 = 0;
		int coche2 = 0;
		int coche3 = 0;
		int coche4 = 0;
		int turno = 1;
		
		while (coche1 < 100 && coche2 < 100 && coche3 < 100 && coche4 < 100) {
			
			System.out.println("Turno " + turno);
			turno++;
			
			coche1 +=  (int)(Math.random() *10);
			System.out.println("El coche 1 ha hecho: " + coche1 + " m.");
			
			coche2 +=  (int)(Math.random() *10);
			System.out.println("El coche 2 ha hecho: " + coche2 + " m.");

			coche3 += (int)(Math.random() *10);
			System.out.println("El coche 3 ha hecho: " + coche3 + " m.");

			coche4 += (int)(Math.random() *10);
			System.out.println("El coche 4 ha hecho: " + coche4 + " m.");

			
			if (coche1 >= 100) {
				System.out.println("¡El ganador es coche 1 con " + coche1 + " m!");
				break;
			}
			if (coche2 >= 100) {
				System.out.println("¡El ganador es coche 2 con " + coche2 + " m!");
				break;
			}
			if (coche3 >= 100) {
				System.out.println("¡El ganador es coche 3 con " + coche3 + " m!");
				break;
			}
			if (coche4 >= 100) {
				System.out.println("¡El ganador es coche 4 con " + coche4 + " m!");
				break;
			}
		}
		
	}

}


/*
 * 1. ver que no sea superior a 100 y que no sea negativo
 * 2. y sumar
 * 3.  si es > 100 --> gana x coche
 */
