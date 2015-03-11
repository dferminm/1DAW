package ejercicios;

import java.util.Scanner;

public class EP03Par {

	public static void main(String[] args) {
		
		//Escribe un programa que pida un número con el fin de visualizarlo, 
		//siempre que dicho número sea par.

		Scanner teclado = new Scanner (System.in);
		
		int n;
		
		System.out.println("Dime un número y te diré si es par o impar:");
		n = teclado.nextInt();
		
		if(n%2==0){
			System.out.println("El número es par");
		}else{
			System.out.println("El número es impar");
		}
	}

}
