package tema5;

public class ejercicio04 {

	public static void main(String[] args) {
		int[] numeros = {1, 2, 3, 4, 5, 6};
		int max = numeros [0];
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > max) {
				max = numeros[i];
			}
		}
		System.out.println(max);
	}
}
