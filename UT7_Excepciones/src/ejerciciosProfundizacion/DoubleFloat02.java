package ejerciciosProfundizacion;

import java.util.*;

import ejemplos.Teclado;

public class DoubleFloat02 {

	public static void main(String[] args) {
		// Escribe un programa que pida un double y un float. 
		// Si al pedir un n�mero, el usuario inserta letras, se pedir� de nuevo ese dato. 
		// Una vez insertados, se visualizar� el n�mero m�s alto de los dos. 
		// Si son iguales se visualizar� cualquiera de ellos. 
		// Se usar� un m�todo que pida un dato de tipo float. 
		// Dicho m�todo controlar� el error que se podr�a producir si se insertan letras, 
		// visualizando en este caso un mensaje de error. 
		// El main ser� el que se encargue de llamar de nuevo a este m�todo si se insertan letras. 
		// De la misma forma se har� a la hora de pedir un dato de tipo double.

		
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
			System.out.println("Dime un n�mero float: ");
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
			System.out.println("Dime un n�mero double: ");
			n = teclado.nextDouble();
		}
		catch (InputMismatchException imex) {
			System.out.println("Error. Eso no es un dato de tipo double.");
		}
		return n;
	}
}
