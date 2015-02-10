package ejerciciosArrays;

import java.util.Scanner;

public class E02MesesDelAño {

	public static void main(String[] args) {
		// Crea un programa que almacene los meses del año (los nombres de cada mes). 
		//Se pedirá al usuario el número de mes y se visualizará su nombre.

		Scanner teclado = new Scanner(System.in);
		
		String [] meses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
					"Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		for(int i = 0;i < 13;i++) {
			
			System.out.println("Dime el número de un mes:");
			i = teclado.nextInt();
			System.out.println("El mes correspondiente al número introducido es " + meses[i]);
		}
		
	}

}
