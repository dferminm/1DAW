package ejercicios;

import java.util.*;

//Escribir un método que convierta de euros a dólares. 
//Recibirá un número decimal correspondiente a la cantidad en euros y 
//devolverá la cantidad correspondiente en dolares. 
//Escribir el código en el main necesario para probarlo.

public class EurosDolares {
	
	public static double conversorED (double numConvertir) {
		
		numConvertir = numConvertir * 1.13;
		
		return numConvertir;
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double euros;
		
		System.out.println("Introduce una cantidad en euros: ");
		euros = teclado.nextDouble();
		euros = conversorED(euros);
		System.out.println("La cantidad introducida son " + euros + " dólares.");

	}

}
