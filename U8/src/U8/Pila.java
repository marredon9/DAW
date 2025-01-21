package U8;

import java.util.*;

public class Pila implements ColeccionInterfaz {
	
	private Object[] elementos;
	private int contador;
	
	public Pila(Object[] elementos, int contador){
		elementos = new Object[10];
		this.contador = contador;
	}
	
	@Override
	public boolean estaVacia() {
		if (contador == -1)
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
		if (contador == elementos.length) {
			return true;
		}
		return false;
	}
	
	@Override
	public Object añadir(Object obj) {
		if (!estaLleno()) {
			elementos[contador] = obj;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Pila [elementos=" + Arrays.toString(elementos) + ", contador=" + contador + "]";
	}

	
}
