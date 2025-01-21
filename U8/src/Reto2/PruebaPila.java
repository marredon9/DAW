package Reto2;

public class PruebaPila{
	
	public void rellenar(ColeccionInterfaz coleccion) {
		for (int i = 0; i <= 10; i++) {
			coleccion.añadir(i);
		}
	}
	
	public void imprimirYVaciar(ColeccionInterfaz coleccion) {
		while(!coleccion.estaVacia()) {
			System.out.println(coleccion.extraer());
		}
	}


	public static void main(String[] args) {
		Pila pila = new Pila(10);
		
		PruebaPila prueba = new PruebaPila();
		
		prueba.rellenar(pila);
		
		System.out.println("Elementos de la pila: ");
		prueba.imprimirYVaciar(pila);
	}
	
}
