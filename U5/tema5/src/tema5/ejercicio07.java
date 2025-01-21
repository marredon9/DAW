package tema5;

public class ejercicio07 {

	public static void main(String[] args) {
		
		int buscar = 36;
		boolean encontrar = false;
		int [] numeros = {42, 6, 33, 12, 36, 25};
		
		for (int num : numeros) {
			if (num == buscar) {
				encontrar = true;
				break;
			}
		}
		System.out.println(encontrar ? "Elemento encontrado" : "Elemento no encontrado");
	}

}
