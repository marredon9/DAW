package Ejercicios;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int puntos = 0;

		// 1
		System.out.println("1. Qué es un índice en una BBDD?");
		System.out.println("a) Un conjunto de datos que se utiliza para mejoar la " + "velocidad de búsqueda");
		System.out.println("b) Un tipo de relación entre tablas");
		System.out.println("c) Un tipo de clave primaria");
		System.out.println("Respuesta: ");
		String respuesta1 = sc.nextLine().toLowerCase();
		if (respuesta1.equalsIgnoreCase("a"))
			puntos++;

		// 2
		System.out.println("2. Qué es la normalización en BBDD?");
		System.out.println("a) Un proceso para reducir la cantidad de datos en una tabla");
		System.out.println("b) Un proceso para mejorar la velocidad de búsqueda en una tabla");
		System.out.println("c) Un proceso para organizar y estructurar los datos en una BBDD");
		String respuesta2 = sc.nextLine().toLowerCase();
		if (respuesta2.equalsIgnoreCase("c"))
			puntos++;

		// 3
		System.out.println("3. Qué es una vista en una BBDD?");
		System.out.println("a) Un tipo de tabla que se utiliza para almacenar datos temporales");
		System.out.println("b) Un tipo de consulta que se utiliza para mostrar datos de manera personalizada");
		System.out.println("c) Un tipo de índice que se utiliza para mejorar la velocidad de búsqueda");
		String respuesta3 = sc.nextLine().toLowerCase();
		if (respuesta3.equalsIgnoreCase("b"))
			puntos++;

		// 4
		System.out.println("4. Qué es un trigger en una BBDD?");
		System.out
				.println("a) Un programa que se ejecuta automáticamente cuando se " + "produce un cambio en los datos");
		System.out.println("b) Un tipo de índice que se utiliza para mejorar la velocidad de búsqueda");
		System.out.println("c) Un tipo de consulta que se utiliza para mostrar datos de " + "manera personalizada");
		String respuesta4 = sc.nextLine().toLowerCase();
		if (respuesta4.equalsIgnoreCase("a"))
			puntos++;
		// 5
		System.out.println("5. Qué es un stored procedure en una BBDD?");
		System.out
				.println("a)Un programa que se ejecuta automáticamente cuando " + "se produce un cambio en los datos");
		System.out.println("b) Un tipo de consulta que se utiliza para mostrar datos de manera personalizada");
		System.out.println("c) Un bloque de código que se puede ejecutar varias veces con parámetros variable");
		String respuesta5 = sc.nextLine().toLowerCase();
		if (respuesta5.equalsIgnoreCase("c"))
			puntos++;

		// 6
		System.out.println("6. Qué es la teoría de la consistencia en BBDD?");
		System.out.println("a) Un conjunto de reglas para garantizar la integridad de los datos");
		System.out.println("b) Un método para mejorar la velocidad de búsqueda en una BBDD");
		System.out.println("c) Un proceso para normalizar los datos en una BBDD d) Un tipo de relación entre tablas");
		String respuesta6 = sc.nextLine().toLowerCase();
		if (respuesta6.equalsIgnoreCase("a"))
			puntos++;

		// 7
		System.out.println("7. Qué es la recuperación de datos en BBDD?");
		System.out.println("a) El proceso de recuperar los datos de una BBDD después de una falla");
		System.out.println("b) El proceso de crear una BBDD desde cero");
		System.out.println("c) El proceso de normalizar los datos en una BBDD");
		String respuesta7 = sc.nextLine().toLowerCase();
		if (respuesta7.equalsIgnoreCase("a"))
			puntos++;

		// 8
		System.out.println("8. Qué es la escalabilidad en BBDD?");
		System.out.println("a) La capacidad de una BBDD para manejar un aumento en el tráfico y la carga");
		System.out.println("b) La capacidad de una BBDD para manejar un decremento en el tráfico y la carga");
		System.out.println("c) La capacidad de una BBDD para mejorar la velocidad de búsqueda");
		String respuesta8 = sc.nextLine().toLowerCase();
		if (respuesta8.equalsIgnoreCase("a"))
			puntos++;

		// 9
		System.out.println("9. Qué es la seguridad en BBDD?");
		System.out.println("a) El proceso de proteger los datos de una BBDD contra acceso no autorizado");
		System.out.println("b) El proceso de mejorar la velocidad de búsqueda en una BBDD");
		System.out.println("c) El proceso de normalizar los datos en una BBDD");
		String respuesta9 = sc.nextLine().toLowerCase();
		if (respuesta9.equalsIgnoreCase("a"))
			puntos++;

		// 10
		System.out.println("10. Qué es la integración de datos en BBDD?");
		System.out.println("a) El proceso de combinar datos de varias fuentes en una BBDD");
		System.out.println("b) El proceso de crear una BBDD desde cero");
		System.out.println("c) El proceso de normalizar los datos en una BBDD");
		String respuesta10 = sc.nextLine().toLowerCase();
		if (respuesta10.equalsIgnoreCase("a"))
			puntos++;

		System.out.println("Tu nota es de : " + puntos + "/10");
		sc.close();
	}

}
