package tema5;

public class ejercicio05 {

	public static void main(String[] args) {
		int [] originalNum = {1, 2, 3, 4, 5};
		int [] copiaNum = originalNum.clone();
		
		copiaNum[3] = 86;
		System.out.println("+++++++ORIGINAL+++++++");
		System.out.println("+                     +");
		for (int numero : originalNum) {
			System.out.println("\t"+ numero);
			System.out.println();
		}
		System.out.println("+++++++COPIA++++++");
		System.out.println("+                +");
		for (int num : copiaNum) {
			System.out.println("\t"+ num);
			System.out.println();
		}
		
	}

}
