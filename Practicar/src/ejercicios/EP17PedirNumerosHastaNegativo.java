package ejercicios;

import java.util.*;

public class EP17PedirNumerosHastaNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribir un programa que lea tantos n�meros como el usuario quiera (hasta que se inserte un n�mero negativo). 
		//El primer n�mero hay que visualizarlo en la pantalla.
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Dime un n�mero: ");
		numero = teclado.nextInt();
		System.out.println("Has insertado " + numero + " como primer n�mero");
		
		do{
			System.out.println("Dime un n�mero: ");
			numero = teclado.nextInt();
		}while(numero >= 0);

	}

}
