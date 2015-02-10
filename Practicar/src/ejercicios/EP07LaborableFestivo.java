package ejercicios;

import java.util.Scanner;

public class EP07LaborableFestivo {

	public static void main(String[] args) {
		
		//Pide un número del 1 al 7. 
		//Imprime si es laborable o festivo. 
		//Puedes realizar el ejercicio con sentencias if y otra versión con switch.

		Scanner teclado = new Scanner (System.in);
		
		int n;
		
		System.out.println("Dime un número del 1 al 7:");
		n = teclado.nextInt();
		
		if(n >= 1 && n <= 5){
			System.out.println("Laborable");
		}else if(n >= 6 && n <= 7){
			System.out.println("Festivo");
		}else{
			System.out.println("ERROR! - Debe introducir un valor entre 1 - 7");
		}
	}

}
