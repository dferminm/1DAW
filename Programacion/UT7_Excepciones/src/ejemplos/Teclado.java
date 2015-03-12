package ejemplos;

import java.util.*;

public class Teclado {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		//cerramos teclado para que vaya a la variable isex
		/*teclado.close();*/
		int numero = 2;
		boolean esNumero = false;
	while(!esNumero) {
		try {
			System.out.println("Dame un n�mero: ");
			numero = teclado.nextInt();
			esNumero = true;
		}catch (InputMismatchException imex) {
			System.out.println("Eso no era un n�mero.");
			teclado.next();
		}catch (IllegalStateException isex) {
			System.out.println("No se puede leer.");
			System.exit(-1);		
		}finally {
			System.out.println("Finalizada la lectura de n�mero.");
		}
	}	
		
		System.out.println(numero);
	}

}
