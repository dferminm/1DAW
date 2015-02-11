package ejerciciosProfundizacion;

import java.util.*;

import javax.swing.text.MaskFormatter;

public class DiezNumDecimales04 {

	public static void main(String[] args) {
		// Escribe un programa que pida diez n�meros con decimales. 
		// Si insertan letras, se pedir� de nuevo dicho n�mero. 
		// El programa debe visualizar el n�mero m�s alto de todos los insertados. 
		// Si se produce alguna excepci�n se mostrar� el mensaje correspondiente. 
		// Adem�s, al final del programa se visualizar� un mensaje que indica 
		// cu�ntas veces se ha producido dicho error.

		Scanner teclado = new Scanner(System.in);
		
		int n, masAlto = 0, numeroErrores = 0;
		
		for(int i = 1;i <= 10;i++) {
			
			try {
			System.out.println("Introduce n�mero: ");
			n = teclado.nextInt();
			if(n > masAlto) {
				masAlto = n;
			}
			
			}catch (InputMismatchException imex) {
				i--;
				numeroErrores++;
				System.out.println("Se ha producido el siguiente error: " + imex.toString());
				System.out.println("Vuelva a insertar el n�mero...");
				teclado.next();
			}
		}
		
		System.out.println("El n�mero m�s alto de los insertados es el " + masAlto);
		
	}

}
