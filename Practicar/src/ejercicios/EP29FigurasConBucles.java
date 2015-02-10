package ejercicios;

import java.util.*;

public class EP29FigurasConBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Escribe un programa que cree estas figuras:
		 
		 *
		 **
		 ***
		 ****

		    *
		   **
		  ***
		 ****

		 	   *
		 	  ***
			 *****
	   		******* 
		 */
		
		Scanner teclado = new Scanner(System.in);
		int tamaño;
		char caracter='*';
		
		System.out.print("Dame el tamaño de las figuras: ");
		tamaño = teclado.nextInt();
		
		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(caracter);
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 0; i < tamaño; i++) {
			for (int j = tamaño - i; j > 0; j--) {
				System.out.print(caracter);
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			for (int j = 0; j < tamaño - i; j++) {
				System.out.print(caracter);
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 0; i < tamaño; i++) {
			for (int j = 1; j < (tamaño - i) ; j++)
				System.out.print(" ");
			for (int j = 0; j < (i + 1); j++) {
				System.out.print(caracter);
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 0; i < tamaño; i++) {
			for (int j = 1; j < (tamaño - i) ; j++)
				System.out.print(" ");
			for (int j = 0; j < (i*2 + 1); j++) {
				if (Math.random()>0.9)
				  System.out.print('O');
				else
				  System.out.print(caracter);
			}
			System.out.println();
		}
		System.out.println();
		
		int blancos=tamaño-1;
		int negros=1;
		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j < blancos ; j++)
				System.out.print(" ");
			for (int j = 0; j < negros; j++) {
				if (Math.random()>0.9)
				  System.out.print('O');
				else
				  System.out.print(caracter);
			}
			System.out.println();
			blancos=blancos-1;
			negros=negros+2;
		}
		System.out.println();

	}

}
