package ejerciciosCadenas;

import java.util.*;

public class CadenaPalindromo {

	public static void main(String[] args) {
		// Saber si una cadena es un pal�ndromo o no (capic�a).
		
		Scanner teclado = new Scanner(System.in);
		
		boolean palindromo = true;
		String palabra;
		System.out.println("Introduce una palabra: ");
		palabra = teclado.nextLine();
		
		for(int i = 0;i < palabra.length();i++){
			if(palabra.charAt(i) != palabra.charAt(palabra.length()-i-1)){
				palindromo = false;
				break;
			}
		}
		
		if(palindromo)
			System.out.println("Es pal�ndromo");
		else
			System.out.println("No es pal�ndromo");
		
	}

}
