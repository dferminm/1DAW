package ejercicios;

import java.util.Scanner;

public class EP09NumeroOculto {

	public static void main(String[] args) {
		
		//Crea un programa que tiene un numero oculto (del 1 al 10). 
		//El programa pregunta el número al jugador, si la adivina muestra un mensaje de éxito. 
		//Si no, muestra el error.

		Scanner teclado = new Scanner (System.in);
		
		int oculto = 8;
		int n;
		
		System.out.println("Dime el número oculto:");
		n = teclado.nextInt();
		
		if(n == oculto){
			System.out.println("Enhorabuena, has acertado!");
		}else{
			System.out.println("ERROR, el número oculto no es el indicado");
		}
	}

}
