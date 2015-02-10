package ejercicios;

import java.util.*;

public class EP30AdivinaNumero1_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//El juego de adivina el número.
		//El programa "pensará" un número del 1 al 100 que el jugador tendrá que adivinar. 
		//El programa va preguntando un número tras otro al jugador. 
		//Si el jugador dice uno mayor, el programa le dice que el número oculto es menor 
		//(y al revés si dice uno menor). 
		//El jugador tiene como máximo 10 oportunidades para adivinar el número.
		
		Scanner teclado = new Scanner (System.in);
		
		int nOculto = (int)(Math.random() * 100 + 1);
		int oportunidades = 0;
		int nRespuesta;
		
		System.out.println("Dime un número entre 1 y 100: ");
		
		do {
			nRespuesta = teclado.nextInt();
			
			oportunidades ++;
			
			if(nOculto > nRespuesta){
				System.out.println("Más alto");
			}else if(nOculto < nRespuesta){
				System.out.println("Más bajo");
			}else{
				System.out.println("Has acertado, enhorabuena!");
			}
			if(oportunidades >= 10){
				System.out.println("Ha sobrepasado el límite de intentos, has perdido :( ");
				break;
			}
		}while(nOculto != nRespuesta);

	}

}
