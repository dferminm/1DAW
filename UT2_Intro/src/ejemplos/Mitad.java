package ejemplos;

import java.util.Scanner;

public class Mitad {

	public static void main(String[] args) {
		//Voy a hacer un programa que recoja un n�mero y me de la mitad
		Scanner teclado=new Scanner(System.in);
		long numero;
		
		System.out.println("Dime el n�mero ");
		numero=teclado.nextLong();
		
		System.out.println("La mitad de " + numero + " es " + numero/2.0);
		// La / divide el numero
		//Si pongo un numero (2.0) al ponerlo en decimal me lo devolver� con decimales
	}

}
