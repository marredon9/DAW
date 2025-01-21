package tema5;

public class ejercicio10 {

	public static void main(String[] args) {
		
		int[] numero = {4, -8, 45, -66, 55, 5478, -555, -91};
		
		int positivos = 0;

		for(int num : numero) {
			if(num > 0)
			positivos++;
		}
		System.out.println(positivos);
	}

}
