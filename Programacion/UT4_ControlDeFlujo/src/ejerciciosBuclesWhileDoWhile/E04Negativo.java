package ejerciciosBuclesWhileDoWhile;

import java.util.Scanner;

public class E04Negativo {

	public static void main(String[] args) {
		/*Escribir un programa que lea tantos n�meros como el usuario quiera 
		(hasta que se inserte un n�mero negativo). 
		El primer n�mero hay que visualizarlo en la pantalla.*/
		
		Scanner teclado = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Inserte un n�mero: ");
		numero = teclado.nextDouble();
		System.out.println("Has insertado un " + numero);
		
		do{
			System.out.println("Inserte un n�mero: ");
			numero = teclado.nextDouble();
		}while(numero>=0);
			
		}
			

	}


