package ejercicios;

import java.util.Scanner;

public class EP05Menor {

	public static void main(String[] args) {
		
		//Escribe un programa que visualice el m�s peque�o de tres n�meros.
		
		Scanner teclado = new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.println("Dime el primer n�mero:");
		n1 = teclado.nextInt();
		
		System.out.println("Dime el segundo n�mero:");
		n2 = teclado.nextInt();
		
		System.out.println("Dime el tercer n�mero:");
		n3 = teclado.nextInt();
		
		if(n1 < n2 && n1 < n3){
			System.out.println("El n�mero menor es el " + n1);
		}else if(n2 < n1 && n2 < n3){
			System.out.println("El n�mero menor es el " + n2);
		}else if(n3 < n1 && n3 < n2){
			System.out.println("El n�mero menor es el " + n3);
		}else{
			System.out.println("ERROR! - Hay n�meros repetidos");
		}

	}

}
