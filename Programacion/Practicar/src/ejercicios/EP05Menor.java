package ejercicios;

import java.util.Scanner;

public class EP05Menor {

	public static void main(String[] args) {
		
		//Escribe un programa que visualice el más pequeño de tres números.
		
		Scanner teclado = new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.println("Dime el primer número:");
		n1 = teclado.nextInt();
		
		System.out.println("Dime el segundo número:");
		n2 = teclado.nextInt();
		
		System.out.println("Dime el tercer número:");
		n3 = teclado.nextInt();
		
		if(n1 < n2 && n1 < n3){
			System.out.println("El número menor es el " + n1);
		}else if(n2 < n1 && n2 < n3){
			System.out.println("El número menor es el " + n2);
		}else if(n3 < n1 && n3 < n2){
			System.out.println("El número menor es el " + n3);
		}else{
			System.out.println("ERROR! - Hay números repetidos");
		}

	}

}
