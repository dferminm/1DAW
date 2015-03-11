package ejercicios;

import java.util.*;

public class EP19Visualizar5Frases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribe un programa que pida cinco frases y las visualice.
		
		Scanner teclado = new Scanner(System.in);
		
		String frase;
		
		for(int i = 0;i < 5;i++){
			System.out.println("Dime una frase: ");
			frase = teclado.nextLine();
			System.out.println(frase);
		}

	}

}
