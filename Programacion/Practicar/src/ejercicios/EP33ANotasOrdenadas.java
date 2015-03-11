package ejercicios;

import java.util.*;

public class EP33ANotasOrdenadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribe un programa quepida 8 notas. 
		//El programa debe visualizar cuál es la nota más alta, luego la siguiente, y así sucesivamente. 
		//Si hay alguna nota repetida, se visualizará solo una vez.
		
		Scanner teclado = new Scanner(System.in);
		
		int [] notas = new int [8];
		
		for(int i = 0;i < 8;i++){
			System.out.println("Introduzca nota: ");
			notas [i] = teclado.nextInt();
		}

		Arrays.sort(notas);
		System.out.println(notas[7]);
		System.out.println(notas[6]);
		System.out.println(notas[5]);
		System.out.println(notas[4]);
		System.out.println(notas[3]);
		System.out.println(notas[2]);
		System.out.println(notas[1]);
		System.out.println(notas[0]);

	}

}
