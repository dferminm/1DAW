package ejerciciosPracticar;

import java.util.Scanner;

public class E07Oculto1Al100 {

	public static void main(String[] args) {
		//El juego de adivina el n�mero.
		//El programa "pensar�" un n�mero del 1 al 100 que el jugador tendr� que adivinar. 
		//El programa va preguntando un n�mero tras otro al jugador. 
		//Si el jugador dice uno mayor, el programa le dice que el n�mero oculto es menor (y al rev�s si dice uno menor). 
		//El jugador tiene como m�ximo 10 oportunidades para adivinar el n�mero.
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int numeroOculto = (int)(Math.random()*100+1);
		int intentos = 0;
		
		System.out.println("---Adivina un n�mero entre el 1 y el 100---");
		
		do {
			System.out.println("Dime un n�mero:");
			numero = teclado.nextInt();
			intentos++;
			if(numeroOculto > numero) {
				System.out.println("M�s alto.");
			}
			if(numeroOculto < numero) {
				System.out.println("M�s bajo.");
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
