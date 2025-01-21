package ejercicios04;

public class ejercicio01 {

	public static void main(String[] args) {

// Ejercicio01
		double radio = 5;
		System.out.println("Área del círculo: " + areaCirculo(radio));

// Ejercicio02
		double celsius = 25;
		System.out.println("Fahrenheit: " + celsiusAFahrenheit(celsius));

// Ejercicio 3
		int numero = 10;
		System.out.println("El número " + numero + " es par: " + esPar(numero));

// Ejercicio 4
		int n = 5;
		System.out.println("Factorial de " + n + " es: " + factorial(n));

// Ejercicio 5
		String texto = "Hola mundo";
		System.out.println("Número de vocales: " + contarVocales(texto));

// Ejercicio 6
		System.out.println("Promedio: " + promedio(8, 7, 9));

// Ejercicio 7
		double base = 4;
		double altura = 3;
		System.out.println("Área del triángulo: " + areaTriangulo(base, altura));

// Ejercicio 8
		int num = 123;
		System.out.println("Suma de dígitos: " + sumaDigitos(num));

// Ejercicio 9
		int año = 2024;
		System.out.println("El año " + año + " es bisiesto: " + esBisiesto(año));

// Ejercicio 10
		num = 456;
		System.out.println("Número invertido: " + invertirNumero(num));

// Ejercicio 11
		double longitud = 5;
		double anchura = 3;
		System.out.println("Perímetro del rectángulo: " + perimetroRectangulo(longitud, anchura));

// Ejercicio 12
		String frase = "Esto es una prueba";
		System.out.println("Número de palabras: " + contarPalabras(frase));

// Ejercicio 13
		int a = 5, b = 10, c = 7;
		System.out.println("Máximo: " + maximo(a, b, c));

// Ejercicio 14
		double cateto1 = 3;
		double cateto2 = 4;
		System.out.println("Hipotenusa: " + calcularHipotenusa(cateto1, cateto2));

// Ejercicio 15
		int numeroPrimo = 11;
		System.out.println("El número " + numeroPrimo + " es primo: " + esPrimo(numeroPrimo));

// Ejercicio 16
		String nombre = "Carlos";
		System.out.println(generarSaludo(nombre));

// Ejercicio 17
		int aSuma = 3, bSuma = 4;
		System.out.println("Suma: " + sumar(aSuma, bSuma));

// Ejercicio 18
		int minutos = 130;
		System.out.println(convertirMinutos(minutos));

// Ejercicio 19
		int numeroDoble = 5;
		System.out.println(dobleTriple(numeroDoble));

// Ejercicio 20
		int numSigno = -3;
		System.out.println(determinarSigno(numSigno));
	}

//Ejercicio01
	public static double areaCirculo(double radio) {
		double pi = 3.1416;
		double area = 0;
		area = pi * (radio * radio);
		return area;
	}

//Ejercicio02
	public static double celsiusAFahrenheit(double celsius) {
		return celsius * 1.8 + 32;
	}

//Ejercicio03
	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}

//Ejercicio04
	public static int factorial(int n) {
		int resultado = 1;
		for (int i = 2; i <= n; i++) {
			resultado *= i;
		}
		return resultado;
	}

//Ejercicio05
	public static int contarVocales(String texto) {
		int contador = 0;
		texto = texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {
			char caracter = texto.charAt(i);
			if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
				contador++;
			}
		}
		return contador;
	}

//Ejercicio06
	public static double promedio(int a, int b, int c) {
		return (a + b + c) / 3;
	}

//Ejercicio07
	public static double areaTriangulo(double base, double altura) {
		return (base / 2) * altura;
	}

//Ejercicio08
	public static int sumaDigitos(int num) {
		int suma = 0;

		while(num > 0) {
			suma += num %10;
			num /= 10;
		}
		return suma;
	}

//Ejercicio09
	public static boolean esBisiesto(int año) {
		if (año %4 == 0) {
			if (año %100 == 0) {
				return año %400 == 0;
			}
			return true;
		}
		return false;
	}

//Ejercicio10
	public static int invertirNumero(int num) {
		int invertido = 0;
		while (num != 0) {
			invertido = invertido * 10 + num %10;
			num /= 10;
		}
		return invertido;
	}
	
//Ejercicio11
	public static double perimetroRectangulo(double longitud, double anchura) {
		return 2*(longitud + anchura);
	}
	
//Ejercicio12
	public static int contarPalabras(String frase) {
		int contador  = 0;
		frase = frase.toLowerCase();
		for (int  i = 0; i < frase.length(); i++) {
			if (Character.isLetter(frase.charAt(i))) {
				int j = i;
				while (j < frase.length() && Character.isLetter(frase.charAt(j))) {
					j++;
				}
				contador++;
				i = j - 1;
			}
		}
		return contador;
	}
	
//Ejercicio13

	public static int maximo(int a, int b, int c) {
		int mayor = a;
		if (b > mayor) {
			mayor = b;
		}
		if (c > mayor) {
			mayor = c;
		}
		return mayor;
	}
	
//Ejercicio14
	public static double calcularHipotenusa(double cateto1, double cateto2) {
		double hipotenusa = 0;
		hipotenusa = (cateto1*cateto1) + (cateto2*cateto2);
		return Math.sqrt(hipotenusa);
	}
	
//Ejercicio15
	public static boolean esPrimo(int numeroPrimo) {
		for (int i = 2; i < numeroPrimo; i++) {
			if(numeroPrimo %i == 0)
				return false;
		}
		return true;
	}
	
//Ejercicio16
	public static String generarSaludo(String nombre) {
		return "Buenos dias " + nombre;
	}
	
//Ejercicio17
	public static int sumar(int aSuma, int bSuma) {
		return aSuma + bSuma;
	}
	
//Ejercicio18
	public static String convertirMinutos(int minutos) {
		int horas = minutos / 60;
		int minutosRestantes = minutos % 60;
		return horas + "h " + minutosRestantes + "min";
	}

//Ejercicio19
	public static String dobleTriple(int numeroDoble) {
		int doble = numeroDoble * 2;
		int triple = numeroDoble * 3;
		return "El doblre de " + numeroDoble + " es " + doble + " y el triple es " + triple;
	}
	
//Ejercicio20
	public static String determinarSigno (int numSigno) {
		if (numSigno > 0) {
			return "El numero " + numSigno + " es positivo";
		} else if (numSigno < 0) {
			return "El numero " + numSigno + " es negativo";
		} else {
			return "El numero " + numSigno + " es cero";
		}
	}
}