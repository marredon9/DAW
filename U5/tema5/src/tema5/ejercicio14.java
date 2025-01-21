package tema5;

public class ejercicio14 {

	public static void main(String[] args) {
		int[] numero = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		boolean ordenado = true;
		for (int i = 0; i < numero.length - 1; i++) {
			if (numero[i] > numero[i + 1]) {
				ordenado = false;
				break;
			}
		}
		if (ordenado) {
			System.out.println("Está ordenado");
		} else {
			System.out.println("No está ordenado");
		}
	}

}
