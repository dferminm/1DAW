package ejemplos;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		//if y else
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		System.out.println("Dime un n�mero: ");
		
		n = teclado.nextInt();
		
		if (n<0) {
			System.out.println("N�mero negativo");
		} else {
			System.out.println("N�mero positivo");
		}
		System.out.println("Fin.");

	}

}
