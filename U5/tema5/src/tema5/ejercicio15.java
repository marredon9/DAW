package tema5;

import java.util.Arrays;

public class ejercicio15 {

	public static void main(String[] args) {
		int[] numeroOriginal = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] numeroCopiado = new int[numeroOriginal.length];
		
		for (int i = numeroOriginal.length -1; i >= 0; i--) {
			numeroCopiado[numeroOriginal.length - 1 - i] = numeroOriginal[i]; 
		}
		System.out.println(Arrays.toString(numeroCopiado));
	}

}
