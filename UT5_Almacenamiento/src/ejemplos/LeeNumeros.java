package ejemplos;

import java.util.Scanner;

public class LeeNumeros {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int [] numeros;
		
		numeros = new int [10];
		
		for(int i = 0;i < 10;i++) {
			
			numeros[i] = teclado.nextInt();
			
		}
		System.out.println("N�meros le�dos:");
		for(int i = 0;i < 10;i++) {
			System.out.println(numeros[i]);
		}
		System.out.println("�ltimo elemento:");
		System.out.println(numeros[numeros.length-1]);
		//(variable[variable.length-1]); imprime el �ltimo elemento.

	}

}
