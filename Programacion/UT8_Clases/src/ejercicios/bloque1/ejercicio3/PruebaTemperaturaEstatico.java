package ejercicios.bloque1.ejercicio3;

import java.util.Scanner;

import ejercicios.bloque1.ejercicio1.Temperatura;

public class PruebaTemperaturaEstatico {

	public static void main(String[] args) {
		// A�ade a la clase Temperatura los m�todos est�ticos celsiusToFarenheit farenheitToCelsius, 
		// de forma que puedan usarse sin necesidad de crar ning�n objeto.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame la temperatura (Celsius): ");
		float temp = teclado.nextFloat();
		
		System.out.println("Hacen " + TemperaturaEstatico.celsiusToFarenheit(temp) + " �F");
	
	}

}
