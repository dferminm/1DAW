package ejerciciosIfElse;

import java.util.Scanner;

public class E01Condicional {

	public static void main(String[] args) {
		/* programa que pida una temperatura en Fahrenheit. 
		Pasará esa temperatura a grados Centígrados. 
		Si la temperatura es menor que cero, mostrará un mensaje de aviso de congelación.*/
		
		System.out.println("---Conversor de temperatura---");
		
		Scanner teclado = new Scanner(System.in);
		
		double grados;
		
		System.out.println("Dime la temperatura en Fahrenheit: ");
		
		grados = teclado.nextDouble();
		
		grados = (grados-32)/1.8;
		
		if (grados<0) {
			System.out.println("Aviso --> CONGELACIÓN!");
		} else {
			System.out.println("No hay peligro de congelación");
		}
	}

}
