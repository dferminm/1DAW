package ejercicios;

import java.util.*;

public class EP30AdivinaNumero1_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//El juego de adivina el n�mero.
		//El programa "pensar�" un n�mero del 1 al 100 que el jugador tendr� que adivinar. 
		//El programa va preguntando un n�mero tras otro al jugador. 
		//Si el jugador dice uno mayor, el programa le dice que el n�mero oculto es menor 
		//(y al rev�s si dice uno menor). 
		//El jugador tiene como m�ximo 10 oportunidades para adivinar el n�mero.
		
		Scanner teclado = new Scanner (System.in);
		
		int nOculto = (int)(Math.random() * 100 + 1);
		int oportunidades = 0;
		int nRespuesta;
		
		System.out.println("Dime un n�mero entre 1 y 100: ");
		
		do {
			nRespuesta = teclado.nextInt();
			
			oportunidades ++;
			
			if(nOculto > nRespuesta){
				System.out.println("M�s alto");
			}else if(nOculto < nRespuesta){
				System.out.println("M�s bajo");
			}else{
				System.out.println("Has acertado, enhorabuena!");
			}
			if(oportunidades >= 10){
				System.out.println("Ha sobrepasado el l�mite de intentos, has perdido :( ");
				break;
			}
		}while(nOculto != nRespuesta);

	}

}
