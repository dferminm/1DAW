package ejercicios;

import java.util.*;

public class EP15PedirNumerosHasta0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pedir n�meros al usuario hasta que se inserte un 0. 
		//Mostrar la cantidad de n�meros le�dos y el resultado de multiplicar todos ellos.
		
		Scanner teclado = new Scanner (System.in);
		
		int numero = 1;
		int contador = -1;
		int multiplicador = 1;
		
		while(numero != 0){
			System.out.println("Dame un n�mero: ");
			numero = teclado.nextInt();
			contador++;
			if(numero != 0){
				multiplicador *= numero;
			}
		}
		
		System.out.println("Cantidad de n�meros le�dos: " + contador);
		System.out.println("Resultado al multiplicar los n�meros: " + multiplicador);

	}

}
