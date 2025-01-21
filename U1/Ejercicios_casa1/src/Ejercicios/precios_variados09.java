package Ejercicios;

import java.util.Scanner;

public class precios_variados09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresar precio manzanas kg: ");
		double manzanas = sc.nextDouble();
		
		System.out.println("Ingresar precio peras kg: ");
		double peras = sc.nextDouble();
			
		System.out.println("Ingresar venta kg manzanas 1 trimestre: ");
		double kg_1t_manzanas = sc.nextDouble();
		
		System.out.println("Ingresar venta kg manzanas 2 trimestre: ");
		double kg_2t_manzanas = sc.nextDouble();
		
		System.out.println("Ingresas venta kg manzanas 3 trimestre: ");
		double kg_3t_manzanas = sc.nextDouble();
		
		System.out.println("Ingresar venta kg manzanas 4 trimestre: ");
		double kg_4t_manzanas = sc.nextDouble();
		
		double total_manzanas = (kg_1t_manzanas + kg_2t_manzanas + kg_3t_manzanas 
				+ kg_4t_manzanas) * manzanas;
		
		System.out.println("Ingresar venta kg peras 1 trimestre: ");
		double kg_1t_peras = sc.nextDouble();
		
		System.out.println("Ingresar venta kg peras 2 trimestre: ");
		double kg_2t_peras = sc.nextDouble();
		
		System.out.println("Ingresas venta kg peras 3 trimestre: ");
		double kg_3t_peras = sc.nextDouble();
		
		System.out.println("Ingresar venta kg peras 4 trimestre: ");
		double kg_4t_peras = sc.nextDouble();
		
		double total_peras = (kg_1t_peras + kg_2t_peras + kg_3t_peras 
				+ kg_4t_peras) * peras;
		
		double total = total_manzanas + total_peras;
		System.out.println("EL beneficio anual es de: " + total);
		sc.close();
		}

	}