package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Programa que pidiendo 2 números devuelva la suma, el producto y la media del mismo.
		Scanner teclado=new Scanner(System.in);
		long numero1;
		long numero2;
		
		System.out.println("Con 2 números te diré la suma, el producto y la media de los mismos");
		
		System.out.println("Dime el primer número ");
		numero1=teclado.nextLong();
		
		System.out.println("Dime el segundo número ");
		numero2=teclado.nextLong();
		
		System.out.println("La suma de los dos números es " + (numero1+numero2));
		System.out.println("El producto de los dos números es " + numero1*numero2);
		System.out.println("La media de los dos números es " + numero1/numero2);
	}

}
