package tema5;

public class ejercicio06 {

	public static void main(String[] args) {
		
		int suma = 0;
		int promedio = 0;
		int [] numeros = {1, 2, 3, 4, 5};
		
		for (int num : numeros) {
			suma += num;
		}
		
		promedio = suma / 5;
		System.out.println(promedio);
	}

}
