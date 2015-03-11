package ejercicios;

import java.util.Scanner;

public class EP08Operacion2Numeros {

	public static void main(String[] args) {
		
		//Escribe un programa que pida dos n�meros enteros. 
		//El usuario despu�s indicar� una operaci�n: *, +, -, /. 
		//El programa visulizar� el resultado de esa operaci�n, o error si no se corresponde con ninguna.

		Scanner teclado = new Scanner (System.in);
		
		int n1, n2;
		int operacion;
		
		System.out.println("Dime el primer n�mero:");
		n1 = teclado.nextInt();
		
		System.out.println("Dime el segundo n�mero:");
		n2 = teclado.nextInt();
		
		System.out.println("Indique la operaci�n a realizar [1:*, 2:+, 3:-, 4:/]");
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
			System.out.println("ERROR! - Debe eligir una opci�n v�lida");
		}
	}

}
