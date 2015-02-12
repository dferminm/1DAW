package ejerciciosProfundizacion;

import java.util.*;

public class PedirNumeros05 {
	
	public static int introducirNumero () {
		
		Scanner teclado = new Scanner(System.in);
		
		int n = 0;
		
		try {
		System.out.println("Introduzca un número: ");
		n = teclado.nextInt();
		}catch (InputMismatchException imex) {
			System.out.println("Error. Debe introducir un número.");
			teclado.next();
		}
		
		return n;
	}

	public static void main(String[] args) {
		// Escribe un programa que lea una secuencia de números hasta que el usuario inserte un '*'. 
		// Al final del programa, se debe visualizar el número más alto entre todos los leídos. 
		// Puede suceder que el usuario no haya llegado a insertar ningún número, 
		// y habrá que visualizar el mensaje que corresponda. 
		// Hay que usar un método que pida un número 
		// y que controle el posible error que pudiera producirse si el usuario inserta letras. 
		// El método visualizará un mensaje informando del error.
		
		int n = 0, masAlto = 0;
		
		try {
			n = introducirNumero();
			if(n > masAlto) {
				masAlto = n;
			}
		}catch (NullPointerException npex) {
			System.out.println("No puede introducir un valor nulo.");
		}
		
		
		System.out.println("El número más alto de los introducidos es el " + masAlto);
		
	}

}
