package ejerciciosProfundizacion;

import java.util.*;

import javax.swing.text.MaskFormatter;

public class DiezNumDecimales04 {

	public static void main(String[] args) {
		// Escribe un programa que pida diez números con decimales. 
		// Si insertan letras, se pedirá de nuevo dicho número. 
		// El programa debe visualizar el número más alto de todos los insertados. 
		// Si se produce alguna excepción se mostrará el mensaje correspondiente. 
		// Además, al final del programa se visualizará un mensaje que indica 
		// cuántas veces se ha producido dicho error.

		Scanner teclado = new Scanner(System.in);
		
		int n, masAlto = 0, numeroErrores = 0;
		
		for(int i = 1;i <= 10;i++) {
			
			try {
			System.out.println("Introduce número: ");
			n = teclado.nextInt();
			if(n > masAlto) {
				masAlto = n;
			}
			
			}catch (InputMismatchException imex) {
				i--;
				numeroErrores++;
				System.out.println("Se ha producido el siguiente error: " + imex.toString());
				System.out.println("Vuelva a insertar el número...");
				teclado.next();
			}
		}
		
		System.out.println("El número más alto de los insertados es el " + masAlto);
		
	}

}
