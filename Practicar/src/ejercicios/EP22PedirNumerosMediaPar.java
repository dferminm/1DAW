package ejercicios;

import java.util.*;

public class EP22PedirNumerosMediaPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribe un programa que pida tantos n�meros como el usuario del programa indique al principio. 
		//El programa mostrar� al final la media y si se ha insertado un n�mero par.
		
		Scanner teclado = new Scanner(System.in);
		
		int contadorN;
		int numero;
		int contadorPar = 0;
		int suma = 0;
		
		System.out.println("N�meros a introducir: ");
		contadorN = teclado.nextInt();
		
		for(int i = 0;i < contadorN;i++){
			System.out.println("Inserte n�mero: ");
			numero = teclado.nextInt();
			suma += numero;
			if(numero % 2 == 0){
				contadorPar++;
			}
		}
		
		System.out.println("La media de los n�meros introducidos es " + suma/contadorN);
		System.out.println("Has introducido " + contadorPar + " n�meros pares");

	}

}
