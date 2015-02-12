package ejerciciosProfundizacion;

import java.util.*;

public class AreaPerimetro06 {
	
	public static double baseRectangulo () {
		
		Scanner teclado = new Scanner(System.in);
		
		double base = 0;
		
		do {
		try {
			System.out.println("Indica la base del rectángulo: ");
			base = teclado.nextDouble();
		}catch (InputMismatchException imex) {
			System.out.println("Error. Debe insertar un número.");
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
			System.out.println("Indica la altura del rectángulo: ");
			altura = teclado.nextDouble();
		}catch (InputMismatchException imex) {
			System.out.println("Error. Debe insertar un número.");
			teclado.next();
		}
		}while(altura < 0);
		return altura;
		
	}

	public static void main(String[] args) {
		// Escribe un programa que calcule el área y el perímetro de una superficie rectangular. 
		// Para ello, se pedirá el valor de los lados del rectángulo. 
		// Valida que los datos que inserta el usuario sean mayores o iguales a 0. 
		// Si no es así, se pedirá de nuevo el lado indicado incorrectamente. 
		// También se validará que el usuario inserte números y no letras. 
		// Hay que usar un método que se encargue de pedir el valor de uno de los lados.
		
		// Area = Base * Altura.
		// Perímetro = 2 * (Base + Altura).
		
		double base = baseRectangulo();
		double altura = alturaRectangulo();
		
		System.out.println("El área del rectángulo es " + base*altura);
		System.out.println("El perímetro del rectángulo es " + 2*(base+altura));
		
	}

}
