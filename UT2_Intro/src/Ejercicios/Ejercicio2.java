package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Programa que pidiendo 2 n�meros devuelva la suma, el producto y la media del mismo.
		Scanner teclado=new Scanner(System.in);
		long numero1;
		long numero2;
		
		System.out.println("Con 2 n�meros te dir� la suma, el producto y la media de los mismos");
		
		System.out.println("Dime el primer n�mero ");
		numero1=teclado.nextLong();
		
		System.out.println("Dime el segundo n�mero ");
		numero2=teclado.nextLong();
		
		System.out.println("La suma de los dos n�meros es " + (numero1+numero2));
		System.out.println("El producto de los dos n�meros es " + numero1*numero2);
		System.out.println("La media de los dos n�meros es " + numero1/numero2);
	}

}
