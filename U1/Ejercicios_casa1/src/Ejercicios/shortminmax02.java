package Ejercicios;

public class shortminmax02 {

	public static void main(String[] args) {
		short	maximo = 32767;
		short	minimo = -32768;
		
		System.out.println("El minimo vale: " + minimo);
		System.out.println("El maximo vale: " + maximo);
		
		boolean	ciclo = (short)(minimo - 1) == maximo && (short)(maximo + 1) == minimo;
		System.out.println("¿Es ciclico? " + ciclo);
	}

}
