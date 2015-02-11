package ejerciciosProfundizacion;

import java.util.*;

public class PedirNumeros03 {

	public static void main(String[] args) {
		// Escribe un programa que se encargue de pedir n�meros 
		// hasta que se indique un n�mero comprendido entre 1 y 5 (ambos inclusive), 
		// visualizando al final del programa un mensaje como este: "N�mero encontrado". 
		// Hay que validar que el usuario no inserte letras.

		Scanner teclado = new Scanner(System.in);
		
		int n = 0;
		
		while(n < 1 || n > 5) {
		try {
			System.out.println("Introduzca un n�mero: ");
			n = teclado.nextInt();
			if(n >= 1 && n <= 5) {
				System.out.println("N�mero encontrado.");
				System.exit(0);
			}
		}catch (InputMismatchException imex) {
			System.out.println("Eso no es un n�mero.");
			teclado.next();
		}
		}
	}

}
