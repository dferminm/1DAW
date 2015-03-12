package ejercicios.bloque2.pruebas;

import java.util.Scanner;

import ejercicios.bloque2.clases.MillasMarinasAKilometros;
import ejercicios.bloque2.clases.MillasMarinasAMetros;

public class PruebaEjercicio1_2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime la distancia en millas marinas: ");
		double millasparam = teclado.nextDouble();
		
		System.out.println(millasparam + " millas marinas son " + MillasMarinasAMetros.millasAMetros(millasparam) + " metros.");
		
		System.out.println("Dime la distancia en millas marinas: ");
		double millasparakm = teclado.nextDouble();
		
		System.out.println(millasparakm + " millas marinas son " + MillasMarinasAKilometros.millasAKilometros(millasparakm) + "kilometros.");

	}

}
