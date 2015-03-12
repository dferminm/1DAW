package ejemplos;

import java.util.Scanner;

public class EjemploFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int contador;
		String leido;
		
		for(contador = 0;contador < 5;contador++){
			leido = teclado.nextLine();
			System.out.println(leido);
		}

	}

}
