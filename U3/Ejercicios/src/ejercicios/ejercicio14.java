package ejercicios;

public class ejercicio14 {

	public static void main(String[] args) {
		
		int dado = 0;
		int lanzamientos = 0;
		
		while (dado != 6) {
			lanzamientos++;
			System.out.println("Lanzamiento número " + lanzamientos);
			dado = (int)(Math.random() * 6) + 1;
			System.out.println(dado);
		}
		System.out.println("Son " + lanzamientos + " lanzamientos totales.");
	}

}
