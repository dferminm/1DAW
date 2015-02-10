package ejercicios;

import java.util.Scanner;

public class EP08Operacion2Numeros {

	public static void main(String[] args) {
		
		//Escribe un programa que pida dos números enteros. 
		//El usuario después indicará una operación: *, +, -, /. 
		//El programa visulizará el resultado de esa operación, o error si no se corresponde con ninguna.

		Scanner teclado = new Scanner (System.in);
		
		int n1, n2;
		int operacion;
		
		System.out.println("Dime el primer número:");
		n1 = teclado.nextInt();
		
		System.out.println("Dime el segundo número:");
		n2 = teclado.nextInt();
		
		System.out.println("Indique la operación a realizar [1:*, 2:+, 3:-, 4:/]");
		operacion = teclado.nextInt();
		
		switch(operacion){
		
		case 1:
			System.out.println("Resultado: " + (n1*n2));
			break;
		case 2:
			System.out.println("Resultado: " + (n1+n2));
			break;
		case 3:
			System.out.println("Resultado: " + (n1-n2));
			break;
		case 4:
			System.out.println("Resultado: " + (n1/n2));
			break;
		default:
			System.out.println("ERROR! - Debe eligir una opción válida");
		}
	}

}
