package tema5;

public class ejercicio11 {

	public static void main(String[] args) {
		int[] numero = {11, 23, 45, 56, 78, 98};
		
		int primero = numero[0];
		int ultimo = numero[numero.length -1];
		
		numero [0] = ultimo;
		numero[numero.length - 1] = primero;
		
		for (int num : numero) {
			System.out.println(num);
		}
	}

}
