package ejerciciosBuclesWhileDoWhile;

import java.util.Scanner;

public class E03Par {

	public static void main(String[] args) {
		/*Escribir un programa que pida varios n�meros hasta que el usuario inserte un n�mero par. 
		Hay que ir mostrando cada uno de los n�meros insertados (excepto el par).*/
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		boolean seguir=true;
		
		do{
			System.out.println("Inserte un n�mero: ");
			numero = teclado.nextInt();
			seguir = numero %2 !=0;
			if(seguir)
				System.out.println("Has insertado un " + numero);
			else
				System.out.println("Has insertado un n�mero par");
		}while(seguir);
		System.out.println("Fin del programa.");
		
	}

}
