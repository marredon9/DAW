package tema5;

public class ejercicio20 {

	public static void main(String[] args) {
		double[] numero = {1, 2, 3 ,4, 5, 6, 7 ,8 ,9};

		for (int i = 0; i < numero.length - 1; i++) {
			if (numero[i+1] != 0)
				numero[i] /= numero[i+1];
			
		}
		for (double num : numero) {
			
			System.out.println(num);
		}
	}

}
