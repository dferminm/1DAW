package ejemplos;

import java.util.Scanner;

public class PedirDatos {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		/*Scanner teclado=new Scanner(System.in); declara una variable
		nueva para la introducci�n de texto*/
		long numeroLeido;
		
		System.out.println("Dame un n�mero: ");
		numeroLeido=teclado.nextLong();
		//nextLong hace que lea un n�mero
		System.out.println("Has escrito: " + numeroLeido);

		
	}

}
