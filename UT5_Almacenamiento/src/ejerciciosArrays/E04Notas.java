package ejerciciosArrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class E04Notas {

	public static void main(String[] args) {
		//Escribe un programa que pida 8 notas. 
		//El programa debe visualizar cu�l es la nota m�s alta, luego la siguiente, y as� sucesivamente. 
		//Si hay alguna nota repetida, se visualizar� solo una vez.
		
		Scanner teclado = new Scanner(System.in);
		
		int [] nota = new int [8];
		
		System.out.println("---NOTAS---");
		
		for(int i = 0;i < 8;i++) {
			System.out.println("Introduce una nota:");
			nota [i] = teclado.nextInt();
			}
		
		for(int j = 0;j < 8;j++) {
			for(int z = 0;z < 8;z++) {
			if(nota[j] > nota[z]) {
				
			}

			
		}
		

		}

	}
		
}
