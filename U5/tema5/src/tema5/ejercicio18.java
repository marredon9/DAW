package tema5;

import java.util.Arrays;

public class ejercicio18 {

	public static void main(String[] args) {
		
		int[] fibonacci = new int[10];

		int a = 0;
		int b = 1;
		
		for (int i = 0; i < fibonacci.length; i++) {
			if (i < 2) {
				fibonacci[0] = a;
				fibonacci[1] = b;
			}else {
				int c = a + b;
				a = b;
				b = c;
				fibonacci[i] = b;
			}
		}
		System.out.println(Arrays.toString(fibonacci));
	}

}
