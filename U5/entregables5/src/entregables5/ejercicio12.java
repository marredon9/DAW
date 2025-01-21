package entregables5;

import java.util.*;

public class ejercicio12 {

	public static String[] pedirProductos(String[] productos) {
		Scanner sc = new Scanner(System.in);
		boolean valido = false;
		System.out.println("------Ingrese el producto------");

		for (int i = 0; i < productos.length; i++) {
			valido = false;
			System.out.println("Producto nº " + (i + 1) + ":");
			do {
				if (sc.hasNext()) {
					productos[i] = sc.next().toLowerCase();
					valido = true;
				} else {
					System.out.println("Dato introducido no válido.");
					sc.next();
				}
			} while (!valido);
		}
		return productos;
	}

	public static void anadirProducto(String[] productos) {

		Scanner sc = new Scanner(System.in);
		boolean anadido = false;
		System.out.println("Introduce el producto que quiere añadir");
		boolean valido = false;
		String nuevo = "";

		do {
			if (sc.hasNext()) {
				nuevo = sc.next().toLowerCase();
				valido = true;
			} else {
				System.out.println("Dato introducido erroneo.");
				sc.next();
			}
		} while (!valido);

		for (int i = 0; i < productos.length; i++) {
			if (productos[i] == null) {
				productos[i] = nuevo;
				anadido = true;
				break;
			}
		}
		if (!anadido) {
			System.out.println("No se puede añadir más productos, el inventario está lleno.");
		}
	}

	public static void eliminarProducto(String[] productos) {
		Scanner sc = new Scanner(System.in);
		boolean encontrado = false;
		System.out.println("Introduce el producto que desea eliminar.");
		boolean valido = false;
		String eliminar = "";

		valido = false;
		do {
			if (sc.hasNext()) {
				eliminar = sc.next().toLowerCase();
				valido = true;

			} else {
				System.out.println("Dato introducido erroneo");
				sc.next();
			}
		} while (!valido);
		for (int i = 0; i < productos.length; i++) {

			if (productos[i].equalsIgnoreCase(eliminar)) {
				encontrado = true;
				for (int j = i; j < productos.length - 1; j++) {
					productos[j] = productos[j + 1];
				}
				productos[productos.length - 1] = null;
				System.out.println("Producto eliminado");
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Producto no encontrado.");
			encontrado = false;
		}
	}

	public static void imprimirArray(String[] productos) {
		System.out.println();
		System.out.println("------Lista de productos actualizada------");
		System.out.println(Arrays.toString(productos) + "\n");
	}

	public static void main(String[] args) {
		String[] productos = new String[10];
		productos = pedirProductos(productos);

		int opcion = 0;
		boolean valido = false;
		Scanner sc = new Scanner(System.in);
		do {
			valido = false;
			imprimirArray(productos);
			System.out.println("------1. Añadir producto------");
			System.out.println("------2. Eliminar producto----");
			System.out.println("------3. Salir----------------");
			do {
				if (sc.hasNextInt()) {
					opcion = sc.nextInt();
					valido = true;
				} else {
					System.out.println("Dato introducido erroneo.");
					sc.next();
				}
			} while (!valido);

			switch (opcion) {
			case 1:
				anadirProducto(productos);
				break;
			case 2:
				eliminarProducto(productos);
				break;
			case 3:
				break;
			default:
				System.out.println("Error, valor incorrecto.");
			}

		} while (opcion != 3);
		sc.close();
	}
}