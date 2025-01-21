package tema5;

import java.util.Arrays;

public class ejercicio16 {

	public static void main(String[] args) {
		int[] numero = {1, 2, 3, 4 ,5 ,6 ,7 ,8, 9};

		int eliminar = 5;
		int [] nuevo = new int[numero.length -1];
		int j = 0;
		
		for (int num : numero) {
			if (num != eliminar)
				nuevo[j++] = num;
		}
		System.out.println(Arrays.toString(nuevo));
	}

}
