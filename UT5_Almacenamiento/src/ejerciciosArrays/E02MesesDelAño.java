package ejerciciosArrays;

import java.util.Scanner;

public class E02MesesDelA�o {

	public static void main(String[] args) {
		// Crea un programa que almacene los meses del a�o (los nombres de cada mes). 
		//Se pedir� al usuario el n�mero de mes y se visualizar� su nombre.

		Scanner teclado = new Scanner(System.in);
		
		String [] meses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
					"Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		for(int i = 0;i < 13;i++) {
			
			System.out.println("Dime el n�mero de un mes:");
			i = teclado.nextInt();
			System.out.println("El mes correspondiente al n�mero introducido es " + meses[i]);
		}
		
	}

}
