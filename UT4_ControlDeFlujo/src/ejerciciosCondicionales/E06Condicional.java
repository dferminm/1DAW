package ejerciciosCondicionales;

import java.util.Scanner;

public class E06Condicional {

	public static void main(String[] args) {
		/*programa que pida el ph de una solución y muestre el mensaje
		de si la solución es ácida (ph < 7.0) o peligrósamente ácida: ph < 3.0).*/
		
		Scanner teclado = new Scanner(System.in);
		
		double ph;
		
		System.out.println("Dime el nivel de ph: ");
		ph = teclado.nextDouble();
		
		if (ph < 7.0){
			System.out.println("Solución ácida.");
		}
		if (ph < 3.0){
			System.out.println("Solución peligrosamente ácida.");
		}
		if (ph > 7.0){
			System.out.println("Solución sin preligro de acidez.");
		}
	}

}
