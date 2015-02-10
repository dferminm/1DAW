package ejemplos;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		//if y else
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		System.out.println("Dime un número: ");
		
		n = teclado.nextInt();
		
		if (n<0) {
			System.out.println("Número negativo");
		} else {
			System.out.println("Número positivo");
		}
		System.out.println("Fin.");

	}

}
