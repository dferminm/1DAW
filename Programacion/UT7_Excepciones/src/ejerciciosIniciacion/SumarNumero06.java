package ejerciciosIniciacion;

import java.util.*;

public class SumarNumero06 {

	public static void main(String[] args) {
		// Haciendo uso de un método que pida un número entero, hacer un programa 
		// que pida números enteros y visualice el resultado de sumar dichos número. 
		// Se pedirás números hasta que se inserte una letra o se inserten seis números.

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
		
		System.out.println("Introduce un número entero: ");
		numero = teclado.nextInt();
		
		return numero;
	}
}
