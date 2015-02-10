package ejerciciosIniciacion;

import java.util.*;

public class SumarNumero06 {

	public static void main(String[] args) {
		// Haciendo uso de un m�todo que pida un n�mero entero, hacer un programa 
		// que pida n�meros enteros y visualice el resultado de sumar dichos n�mero. 
		// Se pedir�s n�meros hasta que se inserte una letra o se inserten seis n�meros.

		int n1 = 0,n2 = 0;
		int suma = 0;
		int numerosIntroducidos = 0;
		
		while(true) {
		try {
		n1 = nEntero();
		numerosIntroducidos++;
		n1 = n2 + n1;
		n2 = nEntero();
		numerosIntroducidos++;
		n2 = n2 + n1;
		}catch (InputMismatchException imex) {
			System.out.println("Has insertado una letra, fin del programa.");
			System.exit(-1);
		}finally {
			if(numerosIntroducidos >= 6) {
				System.out.println("La suma es " + n2);
				System.exit(-1);
			}
		}
		}
		
	}

	public static int nEntero () {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un n�mero entero: ");
		numero = teclado.nextInt();
		
		return numero;
	}
}
