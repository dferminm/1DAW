package ejerciciosPracticar;

import java.util.Scanner;

public class E07Oculto1Al100 {

	public static void main(String[] args) {
		//El juego de adivina el número.
		//El programa "pensará" un número del 1 al 100 que el jugador tendrá que adivinar. 
		//El programa va preguntando un número tras otro al jugador. 
		//Si el jugador dice uno mayor, el programa le dice que el número oculto es menor (y al revés si dice uno menor). 
		//El jugador tiene como máximo 10 oportunidades para adivinar el número.
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int numeroOculto = (int)(Math.random()*100+1);
		int intentos = 0;
		
		System.out.println("---Adivina un número entre el 1 y el 100---");
		
		do {
			System.out.println("Dime un número:");
			numero = teclado.nextInt();
			intentos++;
			if(numeroOculto > numero) {
				System.out.println("Más alto.");
			}
			if(numeroOculto < numero) {
				System.out.println("Más bajo.");
			}
			if(intentos > 10) {
				System.out.println("Has sobrepasado los 10 intentos permitidos!");
				break;
			}
		}while(numeroOculto != numero);
		
		if(numeroOculto == numero) {
			System.out.println("Has acertado en " + intentos + " intentos!");
		}
	}

}
