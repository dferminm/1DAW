package ejerciciosBuclesWhileDoWhile;

import java.util.Scanner;

public class E04Negativo {

	public static void main(String[] args) {
		/*Escribir un programa que lea tantos números como el usuario quiera 
		(hasta que se inserte un número negativo). 
		El primer número hay que visualizarlo en la pantalla.*/
		
		Scanner teclado = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Inserte un número: ");
		numero = teclado.nextDouble();
		System.out.println("Has insertado un " + numero);
		
		do{
			System.out.println("Inserte un número: ");
			numero = teclado.nextDouble();
		}while(numero>=0);
			
		}
			

	}


