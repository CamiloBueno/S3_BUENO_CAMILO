package ui;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int casos = Integer.parseInt(sc.nextLine());
		
		int i= 0;
				
		double[] edades;
		while(i<casos)	{
		
			
			String[] lineaUno= sc.nextLine().split(" ");
			edades = new double[lineaUno.length];
			
			for (int j = 0; j < lineaUno.length; j++) {
				edades[j] = Double.parseDouble(lineaUno[j]);
				
			}
			System.out.println(bubbleSort(edades));
			
		i++;	
		}
	}

	public static String bubbleSort(double[] edades) {

		int contador =0;
		int cambios=0;
		double cambiosTotales=0;
		
		String msg = "";
		
		for (int i = 1; i < edades.length; i++) {
			cambiosTotales = cambios+cambiosTotales;
			cambios=0;
			for (int j = 0; j < edades.length-i; j++) {
				if(edades[j]> edades[j+1]) {
					
					double auxiliar = edades[j];
					edades[j]= edades[j+1];
					edades[j+1]= auxiliar;
					cambios++;
				}
			}
			contador++;
			
		}
		for (int i = 0; i < edades.length; i++) {
			msg += edades[i]+" ";
		}
		cambiosTotales=cambiosTotales/contador;
		return String.format("%.2f",cambiosTotales)+"-"+msg;

	 }
	
	
}
