package ejerciciosBuclesWhileDoWhile;

import java.util.Scanner;

public class E02PedirNumerosMenos0 {

	public static void main(String[] args) {
		/*Pedir números al usuario hasta que se inserte un 0.
		Mostrar la cantidad de números leídos y el resultado de multiplicar todos ellos.*/
		
		Scanner teclado = new Scanner(System.in);
		
		int numero = 1;
		int contador = 0;
		int acumulador = 1;
		
		while (numero != 0){
			System.out.println("Dame números: ");
			numero = teclado.nextInt();
			contador++;
			if(numero!=0){
				acumulador *= numero;
				//acumulador = acumulador*numero
			}
		}
		System.out.println("Has insertado " + contador + "números y el resultado al multiplicar es "+ acumulador);
		
	
			
	}

}
