package Ejercicios;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Resultado del dado 1: ");
        int dado1 = scanner.nextInt();
        
        System.out.print("Resultado del dado 2: ");
        int dado2 = scanner.nextInt();
        
        System.out.print("Resultado del dado 3: ");
        int dado3 = scanner.nextInt();

        System.out.println("Resultados de los dados:");
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Dado 3: " + dado3);
        
        int contador = 0;
        
        if (dado1 == 6) contador++;
        if (dado2 == 6) contador++;
        if (dado3 == 6) contador++;

        switch (contador) {
            case 3:
                System.out.println("Excelente");
                break;
            case 2:
                System.out.println("Muy bien");
                break;
            case 1:
                System.out.println("Regular");
                break;
            default:
                System.out.println("Pésimo");
                break;
        }

        scanner.close();
    }
}
