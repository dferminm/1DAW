package ejerciciosBublesFor;

import java.util.Scanner;

public class E03Suma6Numeros {

	public static void main(String[] args) {
		//Escribe un programa que calcule la suma de 6 n�meros 
		//que inserte el usuario a trav�s del teclado.
		
		Scanner teclado = new Scanner(System.in);
		
		int n = 1;
		int c = 1;
		int s = 0;
		
		for(;c<=6;c++){
			System.out.println("Dime n�mero: ");
			n = teclado.nextInt();
			s += n;
		}if(c>6){
			System.out.println("La suma de los n�meros es " + s);
		}

	}

}
