package ejerciciosCadenas;

import java.util.*;

public class CifradoCesar2 {

	public static void main(String[] args) {
		//Haz una segunda versi�n en que se pida un n�mero por teclado 
		//y la codificaci�n se haga incrementando cada car�cter por esa cantidad, 
		//por ejemplo si introducimos 3, "Hola" pasa a ser "Kr�d".

		Scanner teclado = new Scanner(System.in);
		
		String palabra;
		int incrementar;
		
		System.out.println("Escribe una palabra: ");
		palabra = teclado.nextLine();
		System.out.println("Indique el n�mero de caracteres para la codificaci�n: ");
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
