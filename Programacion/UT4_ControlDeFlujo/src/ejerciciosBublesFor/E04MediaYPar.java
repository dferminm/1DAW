package ejerciciosBublesFor;

import java.util.Scanner;

public class E04MediaYPar {

	public static void main(String[] args) {
		//Escribe un programa que pida tantos n�meros como el usuario del programa indique al principio. 
		//El programa mostrar� al final la media y si se ha insertado un n�mero par.
		
		Scanner teclado = new Scanner(System.in);
		
		int numero = 1;
		int leer = 1;
		int contador = 1;
		int suma = 0;
		int pares = 0;
		
		System.out.println("N�meros que vas a introducir: ");
		leer = teclado.nextInt();
		
		for(numero = 1;contador <= leer;contador++){
			System.out.println("Dime n�mero: ");
			numero = teclado.nextInt();
			suma += numero;
			if(numero%2==0)
			pares++;
		}if(contador > leer){
			System.out.println("La media de los n�meros es " + suma/leer +
					" y has introducido " + pares + " n�meros pares.");
		}

	}

}
