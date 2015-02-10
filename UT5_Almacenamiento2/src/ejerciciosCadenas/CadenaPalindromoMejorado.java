package ejerciciosCadenas;

import java.util.*;

public class CadenaPalindromoMejorado {

	public static void main(String[] args) {
		//Mejorar el ejercicio 1.
		//Teniendo en cuenta que los espacios en blanco no cuentan, ni las mayúsculas o minúsculas.
		
		Scanner teclado = new Scanner(System.in);
		
		boolean palindromo = true;
		String palabra;
		System.out.println("Introduce una palabra: ");
		palabra = teclado.nextLine();
		
		//Excepciones
		palabra = palabra.toLowerCase();
		palabra = palabra.replace(" ", "");
		palabra = palabra.replace(".", "");
		palabra = palabra.replace(",", "");
		
		//Se puede usar:
		//palabra = palabra.replaceAll("[., ]","");
		
		for(int i = 0;i < palabra.length();i++){
			if(palabra.charAt(i) != palabra.charAt(palabra.length()-i-1)){
				palindromo = false;
				break;
				}
		}
		
		if(palindromo)
			System.out.println("Es palíndromo");
		else
			System.out.println("No es palíndromo");

	}

}
