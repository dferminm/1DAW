package ejemplos;

import java.util.Scanner;

public class PedirDatos {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		/*Scanner teclado=new Scanner(System.in); declara una variable
		nueva para la introducción de texto*/
		long numeroLeido;
		
		System.out.println("Dame un número: ");
		numeroLeido=teclado.nextLong();
		//nextLong hace que lea un número
		System.out.println("Has escrito: " + numeroLeido);

		
	}

}
