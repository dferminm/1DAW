package ejercicios;

import java.util.*;

public class EP21Suma6Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribe un programa que calcule la suma de 6 n�meros que inserte el usuario a trav�s del teclado.
		
		Scanner teclado = new Scanner(System.in);
		
		int numero = 1;
		int contador = 1;
		int suma = 0;
		
		for(;contador<=6;contador++){
			System.out.println("Dime un n�mero: ");
			numero = teclado.nextInt();
			suma += numero;
		}if(contador>6){
			System.out.println("La suma de los n�meros es " + suma);
		}

	}

}
