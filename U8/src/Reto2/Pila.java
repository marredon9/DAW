package Reto2;

import java.util.*;

public class Pila implements ColeccionInterfaz {
	
	private Object[] elementos;
	private int contador;
	
	public Pila(int capacidad){
		this.elementos = new Object[capacidad];
		this.contador = 0;
	}
	
	@Override
	public boolean estaVacia() {
		if (contador == 0)
			return true;
		return false;
	}
	
	@Override
	public Object extraer() {
		if (estaVacia()) {
			throw new NoSuchElementException("No se puede extraer, la pila está vacía.");
		} else {
			contador--;
			return elementos[contador];
		}
	}
	
	@Override
	public Object primero() {
		if (estaVacia()) {
			throw new NoSuchElementException("No se puede extraer, la pila está vacía.");
		}else {
			return elementos[contador -1];
		}
	}
	
	private boolean estaLleno() {
		return contador == elementos.length;
	}
	
	@Override
	public Object añadir(Object obj) {
		if (!estaLleno()) {
			elementos[contador] = obj;
			contador++;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Pila [elementos=" + Arrays.toString(elementos) + ", contador=" + contador + "]";
	}

	
}
