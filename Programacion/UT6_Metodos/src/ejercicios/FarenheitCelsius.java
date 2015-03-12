package ejercicios;

import java.util.*;

public class FarenheitCelsius {

	public static double farenheitCelsius(double numConvertir){
		numConvertir = (numConvertir - 32)/1.8;
		return numConvertir;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*Escriba un programa que lea temperaturas expresadas en grados Fahrenheit y las convierta a grados 
		 * Celsius mostrándola. El programa finalizará cuando lea un valor de temperatura igual a 999. La conversión 
		 * de grados Farenheit (F) a Celsius (C) la realizará un método llamado farenheitCelsius donde incluirás el 
		 * código que hace la conversión (C = 5/9(F - 32)).
		 */

		double F;
		System.out.println("Indique la temperatura en Farenheit");
		F = teclado.nextDouble();
		if(F==999){
			System.out.println("Fin del programa");
		}else{
			F = farenheitCelsius(F);
			System.out.println("La temperatura en Celsius es " + F);
		}
		
	}
	
}