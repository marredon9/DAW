package entregables5;

import java.util.Arrays;

public class ejercicio14 {

	public static int[] duplicarArray(int[] arrayOriginal) {
		int[] resultado = new int [arrayOriginal.length];
		for (int i = 0; i < arrayOriginal.length; i++) {
			resultado[i] = arrayOriginal[i] * 2;
		}
		return resultado;
	}
	
	
	public static void main(String[] args) {
		int[] arrayOriginal = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] arrayDuplicado = duplicarArray(arrayOriginal);

		System.out.println("Array original: " + Arrays.toString(arrayOriginal));
		System.out.println("Array duplicado: " + Arrays.toString(arrayDuplicado));
	}

}
