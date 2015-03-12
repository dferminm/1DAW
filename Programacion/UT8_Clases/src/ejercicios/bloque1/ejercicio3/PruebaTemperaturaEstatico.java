package ejercicios.bloque1.ejercicio3;

import java.util.Scanner;

import ejercicios.bloque1.ejercicio1.Temperatura;

public class PruebaTemperaturaEstatico {

	public static void main(String[] args) {
		// Añade a la clase Temperatura los métodos estáticos celsiusToFarenheit farenheitToCelsius, 
		// de forma que puedan usarse sin necesidad de crar ningún objeto.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame la temperatura (Celsius): ");
		float temp = teclado.nextFloat();
		
		System.out.println("Hacen " + TemperaturaEstatico.celsiusToFarenheit(temp) + " ºF");
	
	}

}
