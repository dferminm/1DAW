package ejemplos;

import java.util.Scanner;

public class EjercicioPrimero {

	public static void main(String[] args) {
		//Programa que entre 5 n�meros que introduzca el usuario calcule,
		//M�ximo y m�nimo n�mero introducido.
		//N�mero m�s cercano a la media entre todos los n�meros.
		
		Scanner teclado = new Scanner(System.in);
		
		int [] numeros;
		
		numeros = new int [5];
		
		System.out.println("Introduce 5 n�meros:");
		
		for(int i = 0;i < 5;i++) {
			
			numeros[i] = teclado.nextInt();
			}
		int minimo;
		minimo=numeros[0];
		for(int i = 1;i < 5;i++) {
			
			if(numeros[i] < minimo) minimo = numeros[i];
		}
		System.out.println("El m�nimo es: " + minimo);
		
		int maximo;
		maximo=numeros[0];
		for(int i = 1;i < 5;i++) {
			
			if(numeros[i] > maximo) maximo = numeros[i];
		}
		System.out.println("El m�ximo es: " + maximo);
		
	}

}
