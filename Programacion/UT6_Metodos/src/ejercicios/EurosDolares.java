package ejercicios;

import java.util.*;

//Escribir un m�todo que convierta de euros a d�lares. 
//Recibir� un n�mero decimal correspondiente a la cantidad en euros y 
//devolver� la cantidad correspondiente en dolares. 
//Escribir el c�digo en el main necesario para probarlo.

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
		System.out.println("La cantidad introducida son " + euros + " d�lares.");

	}

}
