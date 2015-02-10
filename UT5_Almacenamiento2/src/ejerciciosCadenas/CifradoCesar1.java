package ejerciciosCadenas;

import java.util.*;

public class CifradoCesar1 {

	public static void main(String[] args) {
		//Escribe un programa que codifique usando cifrado César. 
		//Haz una primera versión en que cada letra se sustituya por el caracter siguiente. 
		//Por ejemplo “Hola" pasa a ser "Ipmb".

		Scanner teclado = new Scanner(System.in);
		
		String palabra;
		
		System.out.println("Introduce una palabra: ");
		palabra = teclado.nextLine();
		
		for(int i = 0;i < palabra.length();i++) {
			char a = palabra.charAt(i);
			a++;
			System.out.print(a);
		}
	}

}
