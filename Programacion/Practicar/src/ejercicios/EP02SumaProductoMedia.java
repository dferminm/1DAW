package ejercicios;

import java.util.Scanner;

public class EP02SumaProductoMedia {

	public static void main(String[] args) {
		
		//Escribir un programa que pregunte al usuario
		//dos n�meros y luego muestre la suma, el producto
		//y la media de los dos n�meros.
		
		Scanner teclado = new Scanner (System.in);
		
		int n1, n2;
		
		System.out.println("Dime el primer n�mero:");
		n1 = teclado.nextInt();
		
		System.out.println("Dime el segundo n�mero:");
		n2 = teclado.nextInt();
		
		System.out.println("La suma de los n�meros es " + (n1+n2));
		System.out.println("El producto de los n�meros es " + (n1*n2));
		System.out.println("La media de los n�meros es " + (n1+n2)/2);

	}

}
