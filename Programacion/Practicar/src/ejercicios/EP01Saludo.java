package ejercicios;

import java.util.Scanner;

public class EP01Saludo {

	public static void main(String[] args) {
		
		// Escribir un programa que pregunte al usuario
		//su nombre, y luego lo salude.
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Hola, �c�mo te llamas?");
		
		String nombre = teclado.next();
		
		System.out.println("Buenos d�as " + nombre + ", encntado de saludarte.");

	}

}
