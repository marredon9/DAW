package ejercicios;

public class ejercicio15 {

	public static void main(String[] args) {

		int tamaño = 5;

		for (int linea = 0; linea < tamaño; linea++) {
			for (int columna = 0; columna < tamaño; columna++) {
				System.out.print((linea * tamaño + columna) + 1);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
