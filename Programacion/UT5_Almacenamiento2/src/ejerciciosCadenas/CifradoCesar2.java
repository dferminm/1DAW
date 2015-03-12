package ejerciciosCadenas;

import java.util.*;

public class CifradoCesar2 {

	public static void main(String[] args) {
		//Haz una segunda versión en que se pida un número por teclado 
		//y la codificación se haga incrementando cada carácter por esa cantidad, 
		//por ejemplo si introducimos 3, "Hola" pasa a ser "Krñd".

		Scanner teclado = new Scanner(System.in);
		
		String palabra;
		int incrementar;
		
		System.out.println("Escribe una palabra: ");
		palabra = teclado.nextLine();
		System.out.println("Indique el número de caracteres para la codificación: ");
		incrementar = teclado.nextInt();
		
		for(int i = 0;i < palabra.length();i++) {
			char a = palabra.charAt(i);
			a = (char) (a + incrementar);
			if(a > 'z')
				a = (char) (a - 26);
			System.out.print(a);
		}
	}

}
