package ejerciciosIfElse;

import java.util.Scanner;

public class E01Condicional {

	public static void main(String[] args) {
		/* programa que pida una temperatura en Fahrenheit. 
		Pasar� esa temperatura a grados Cent�grados. 
		Si la temperatura es menor que cero, mostrar� un mensaje de aviso de congelaci�n.*/
		
		System.out.println("---Conversor de temperatura---");
		
		Scanner teclado = new Scanner(System.in);
		
		double grados;
		
		System.out.println("Dime la temperatura en Fahrenheit: ");
		
		grados = teclado.nextDouble();
		
		grados = (grados-32)/1.8;
		
		if (grados<0) {
			System.out.println("Aviso --> CONGELACI�N!");
		} else {
			System.out.println("No hay peligro de congelaci�n");
		}
	}

}
