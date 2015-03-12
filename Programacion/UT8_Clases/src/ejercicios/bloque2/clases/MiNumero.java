package ejercicios.bloque2.clases;

import java.util.Scanner;

public class MiNumero {
	
	private int numero = 0;
	
	public static int doble(int numero) {
		
		return numero*2;
	}
	
	public static int triple (int numero) {
		
		return numero*3;
	}
	
	public static int cuadruple (int numero) {
		
		return numero*4;
	}

	public static void main(String[] args) {
		// Realiza una clase MiNumero que proporcione el doble, triple y cu�druple de un n�mero proporcionado en su constructor 
		// (realiza un m�todo para doble, otro para triple y otro para cu�druple). 
		// En este caso haz que la clase tenga un m�todo main y comprueba los distintos m�todos, 
		// sin necesidad de crear un m�todo de prueba.
		
		Scanner teclado = new Scanner(System.in);
		
		MiNumero numero = new MiNumero();
		
		System.out.println("Indique un n�mero: ");
		int n = teclado.nextInt();
		
		System.out.println("El doble de " + n + " es " + numero.doble(n));
		System.out.println("El triple de " + n + " es " + numero.triple(n));
		System.out.println("El cuadruple de " + n + " es " + numero.cuadruple(n));

	}

}
