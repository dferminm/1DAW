package ejerciciosCondicionales;

import java.util.Scanner;

public class E06Condicional {

	public static void main(String[] args) {
		/*programa que pida el ph de una soluci�n y muestre el mensaje
		de si la soluci�n es �cida (ph < 7.0) o peligr�samente �cida: ph < 3.0).*/
		
		Scanner teclado = new Scanner(System.in);
		
		double ph;
		
		System.out.println("Dime el nivel de ph: ");
		ph = teclado.nextDouble();
		
		if (ph < 7.0){
			System.out.println("Soluci�n �cida.");
		}
		if (ph < 3.0){
			System.out.println("Soluci�n peligrosamente �cida.");
		}
		if (ph > 7.0){
			System.out.println("Soluci�n sin preligro de acidez.");
		}
	}

}
