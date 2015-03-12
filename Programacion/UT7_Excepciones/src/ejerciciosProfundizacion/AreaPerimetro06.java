package ejerciciosProfundizacion;

import java.util.*;

public class AreaPerimetro06 {
	
	public static double baseRectangulo () {
		
		Scanner teclado = new Scanner(System.in);
		
		double base = 0;
		
		do {
		try {
			System.out.println("Indica la base del rect�ngulo: ");
			base = teclado.nextDouble();
		}catch (InputMismatchException imex) {
			System.out.println("Error. Debe insertar un n�mero.");
			teclado.next();
		}
		}while(base < 0);
		return base;
	}
	
	public static double alturaRectangulo () {
		
		Scanner teclado = new Scanner(System.in);
		
		double altura = 0;
		
		do {
		try {
			System.out.println("Indica la altura del rect�ngulo: ");
			altura = teclado.nextDouble();
		}catch (InputMismatchException imex) {
			System.out.println("Error. Debe insertar un n�mero.");
			teclado.next();
		}
		}while(altura < 0);
		return altura;
		
	}

	public static void main(String[] args) {
		// Escribe un programa que calcule el �rea y el per�metro de una superficie rectangular. 
		// Para ello, se pedir� el valor de los lados del rect�ngulo. 
		// Valida que los datos que inserta el usuario sean mayores o iguales a 0. 
		// Si no es as�, se pedir� de nuevo el lado indicado incorrectamente. 
		// Tambi�n se validar� que el usuario inserte n�meros y no letras. 
		// Hay que usar un m�todo que se encargue de pedir el valor de uno de los lados.
		
		// Area = Base * Altura.
		// Per�metro = 2 * (Base + Altura).
		
		double base = baseRectangulo();
		double altura = alturaRectangulo();
		
		System.out.println("El �rea del rect�ngulo es " + base*altura);
		System.out.println("El per�metro del rect�ngulo es " + 2*(base+altura));
		
	}

}
