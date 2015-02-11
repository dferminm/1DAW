package ejercicios_27_10;

import java.util.Scanner;

public class D2_33 {

	public static void main(String[] args) {
		// Ejercicio Deitel 2.33 - Calculadora IMC.
		
		System.out.println("Calculadora de Indice de Masa Corporal");
		System.out.println("Valores de IMC: ");
		System.out.println("-Bajo peso: menos de 18.5");
		System.out.println("-Normal: entre 18.5 y 24.9");
		System.out.println("-Sobrepeso: entre 25 y 29.9");
		System.out.println("-Obeso: 30 o más");
		
		Scanner teclado=new Scanner (System.in);
		
		float pesoKilos;
		float alturaMetros;
		
		System.out.print("Introduce tu peso en kilogramos: ");
		pesoKilos=teclado.nextFloat();
		
		System.out.print("Introduce tu altura en metros: ");
		alturaMetros=teclado.nextFloat();
		
		System.out.println("Tu IMC es " + pesoKilos / (alturaMetros * alturaMetros));

	}

}
