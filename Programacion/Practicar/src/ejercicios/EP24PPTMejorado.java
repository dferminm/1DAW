package ejercicios;

import java.util.*;

public class EP24PPTMejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Mejora el juego de piedra/papel/tijera haciendo dos cosas:
		//Que se compruebe lo que el usuario escribe, 
		//y si no está {"piedra","papel","tijeras"} vuelva a pedir que introduzca su elección.
		//Al finalizar la partida, deberá preguntarse "¿Otra partida [s/n]?". 
		//Si el usuario contesta que si, deberá volver a dejarnos jugar una nueva partida.
		
		Scanner teclado = new Scanner(System.in);
		
		String nuevaPartidaRespuesta;
		boolean nuevaPartida = true;
		String respuesta;
		String piedra = "piedra";
		String papel = "papel";
		String tijeras = "tijeras";
		int adversario = (int)(Math.random()* 3 + 1);
		
		while(nuevaPartida == true){
			
		System.out.println("---PIEDRA, PAPEL, TIJERAS---");
		
		do {
			System.out.println("ELIGE: ¿piedra, papel o tijeras?");
			respuesta = teclado.nextLine();
		}while(respuesta.equalsIgnoreCase(piedra) == false && respuesta.equalsIgnoreCase(papel) == false
				&& respuesta.equalsIgnoreCase(tijeras) == false);
		
		if(adversario == 1){
			System.out.println("Tu adversario elige piedra");
		}else if(adversario == 2){
			System.out.println("Tu adversario elige papel");
		}else if(adversario == 3){
			System.out.println("Tu adversario elige tijeras");
		}
		
		switch(respuesta){
		case "piedra":
			if(adversario == 1){
				System.out.println("Empate");
			}else if(adversario == 2){
				System.out.println("Gana tu adversario");
			}else if(adversario == 3){
				System.out.println("Tú ganas!");
			}break;
		case "papel":
			if(adversario == 1){
				System.out.println("Tú ganas!");
			}else if(adversario == 2){
				System.out.println("Empate");
			}else if(adversario == 3){
				System.out.println("Gana tu adversario");
			}break;
		case "tijeras":
			if(adversario == 1){
				System.out.println("Gana tu adversario");
			}else if(adversario == 2){
				System.out.println("Tú ganas!");
			}else if(adversario == 3){
				System.out.println("Empate");
			}break;
		default:
			System.out.println("La opción elegida no es válida.");
			break;
		}
		System.out.println("¿Otra partida? [s/n]");
		nuevaPartidaRespuesta = teclado.nextLine();
		if(nuevaPartidaRespuesta.equalsIgnoreCase("s") == true){
			nuevaPartida = true;
		}else if(nuevaPartidaRespuesta.equalsIgnoreCase("n") == true){
			nuevaPartida = false;
		}
		}

	}

}
