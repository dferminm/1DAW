package ejerciciosProfundizacion;

import java.util.*;

import ejemplos.Teclado;

public class DoubleFloat02 {

	public static void main(String[] args) {
		// Escribe un programa que pida un double y un float. 
		// Si al pedir un número, el usuario inserta letras, se pedirá de nuevo ese dato. 
		// Una vez insertados, se visualizará el número más alto de los dos. 
		// Si son iguales se visualizará cualquiera de ellos. 
		// Se usará un método que pida un dato de tipo float. 
		// Dicho método controlará el error que se podría producir si se insertan letras, 
		// visualizando en este caso un mensaje de error. 
		// El main será el que se encargue de llamar de nuevo a este método si se insertan letras. 
		// De la misma forma se hará a la hora de pedir un dato de tipo double.

		
		//Incompleto
		
		
		boolean fallo = false;
		
		do {
		if(numeroDouble() > 0 && numeroDouble() < 10000) {
			fallo = false;
		}else if (numeroDouble() < 0){
		}
		}while(fallo = true);
		
	}

	public static float numeroFloat () {
		Scanner teclado = new Scanner(System.in);
		
		float n = 0;
		
		try {
			System.out.println("Dime un número float: ");
			n = teclado.nextFloat();
			}
			catch (InputMismatchException imex) {
				System.out.println("Error. Eso no es un dato de tipo float.");
			}
		return n;
	}
	
	public static double numeroDouble () {
		Scanner teclado = new Scanner(System.in);
		
		double n = 0;
		
		try {
			System.out.println("Dime un número double: ");
			n = teclado.nextDouble();
		}
		catch (InputMismatchException imex) {
			System.out.println("Error. Eso no es un dato de tipo double.");
		}
		return n;
	}
}
