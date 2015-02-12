package ejerciciosProfundizacion;

import java.util.*;

public class PedirNumeros05 {
	
	public static int introducirNumero () {
		
		Scanner teclado = new Scanner(System.in);
		
		int n = 0;
		
		try {
		System.out.println("Introduzca un n�mero: ");
		n = teclado.nextInt();
		}catch (InputMismatchException imex) {
			System.out.println("Error. Debe introducir un n�mero.");
			teclado.next();
		}
		
		return n;
	}

	public static void main(String[] args) {
		// Escribe un programa que lea una secuencia de n�meros hasta que el usuario inserte un '*'. 
		// Al final del programa, se debe visualizar el n�mero m�s alto entre todos los le�dos. 
		// Puede suceder que el usuario no haya llegado a insertar ning�n n�mero, 
		// y habr� que visualizar el mensaje que corresponda. 
		// Hay que usar un m�todo que pida un n�mero 
		// y que controle el posible error que pudiera producirse si el usuario inserta letras. 
		// El m�todo visualizar� un mensaje informando del error.
		
		int n = 0, masAlto = 0;
		
		try {
			n = introducirNumero();
			if(n > masAlto) {
				masAlto = n;
			}
		}catch (NullPointerException npex) {
			System.out.println("No puede introducir un valor nulo.");
		}
		
		
		System.out.println("El n�mero m�s alto de los introducidos es el " + masAlto);
		
	}

}
