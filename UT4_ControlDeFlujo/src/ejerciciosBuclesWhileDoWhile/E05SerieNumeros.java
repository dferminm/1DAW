package ejerciciosBuclesWhileDoWhile;

import java.util.Scanner;

public class E05SerieNumeros {

	public static void main(String[] args) {
		// Escribe un programa que lea una serie de n�meros, muestre el primero,
		// no el segundo, si el tercero y as� sucesivamente.
		// Termina cuando insertamos un n�mero negativo.
		// El n�mero negativo no se imprimir�.

		Scanner teclado = new Scanner(System.in);

		int numero = 1;
		int c = 0;
		
		while(numero>=0){
			System.out.println("Dame un n�mero: ");
			numero = teclado.nextInt();
			c++;
			
			if(c%2!=0 && numero>=0){
				System.out.println("Has introducido" + numero);
				
			}if(numero<0)
				System.out.println("Fin del programa.");
			}
		}
		
		}
