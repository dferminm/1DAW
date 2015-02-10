package ejercicios;

import java.util.*;

public class EP18PedirYMostrarSalteados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribe un programa que lea una serie de números, muestre el primero, no el segundo, si el tercero y así. 
		//Termina cuando insertamos un número negativo. 
		//El número negativo no se imprimirá.
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int contador = 0;
		
		do {
			System.out.println("Dame un número: ");
			numero = teclado.nextInt();
			contador++;
			if(contador % 2 != 0){
				System.out.println("Has introducido un: " + numero);
			}
		}while(numero >= 0);
		

	}

}
