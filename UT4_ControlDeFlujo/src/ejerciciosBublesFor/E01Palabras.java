package ejerciciosBublesFor;

import java.util.Scanner;

public class E01Palabras {

	public static void main(String[] args) {
		//Escribe un programa que pida cinco frases y las visualice.
		
		Scanner teclado = new Scanner(System.in);
		
		int contador;
		String leido;
			
		for(contador = 0;contador < 5;contador++){
			leido = teclado.nextLine();
			System.out.println(leido);
		}


	}

}
