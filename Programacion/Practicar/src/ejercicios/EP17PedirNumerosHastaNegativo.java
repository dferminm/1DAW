package ejercicios;

import java.util.*;

public class EP17PedirNumerosHastaNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribir un programa que lea tantos números como el usuario quiera (hasta que se inserte un número negativo). 
		//El primer número hay que visualizarlo en la pantalla.
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Dime un número: ");
		numero = teclado.nextInt();
		System.out.println("Has insertado " + numero + " como primer número");
		
		do{
			System.out.println("Dime un número: ");
			numero = teclado.nextInt();
		}while(numero >= 0);

	}

}
