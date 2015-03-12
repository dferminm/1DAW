package ejerciciosCadenas;

import java.util.*;

public class ContarPalabras {

	public static void main(String[] args) {
		// Dada una frase, que puede contener caracteres, espacios en blanco,
		// puntos y comas, contar las palabras que contiene.
		// Por ejemplo "El perro de San Roque. Fin." devuelve 6.

		Scanner teclado = new Scanner(System.in);
 
		String frase;
		int contador = 1;

		System.out.println("Introduzca una frase: ");
		frase = teclado.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				contador++;
			}

		}
		
		System.out.println("Ha introducido " + contador + " palabras");
		//Mal, el bueno en el Git.
	}

}
