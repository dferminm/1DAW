package ejercicios;

import java.util.*;

public class EP13PPT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//El juego de piedra/papel/tijera. 
		//Haz un programa para jugar a piedra/papel/tijera con el ordenador. 
		//Solo una ronda por ejecución.
		//para obtener un número aleatorio en Java entre 1 y 3
		//resultado = (int )(Math.random() * 3 + 1);
		
		Scanner teclado = new Scanner(System.in);
		
		int resultado;
		int respuesta;
		int piedra = 1;
		int papel = 2;
		int tijeras = 3;
		
		System.out.println("piedra[1], papel[2] o tijeras[3]: ");
		respuesta = teclado.nextInt();
		
		resultado = (int) (Math.random() * 3 + 1);
		if(resultado == 1){
			System.out.println("Tu adversario elige piedra");
		}else if(resultado == 2){
			System.out.println("Tu adversario elige papel");
		}else if(resultado == 3){
			System.out.println("Tu adversario elige tijeras");
		}
		
		switch(respuesta){
			case 1:
				if(resultado == piedra){
					System.out.println("Empate");
				}else if(resultado == papel){
					System.out.println("Gana tu adversario");
				}else if(resultado == tijeras){
					System.out.println("Tú ganas!");
				}break;
			case 2:
				if(resultado == piedra){
					System.out.println("Tú ganas!");
				}else if(resultado == papel){
					System.out.println("Empate");
				}else if(resultado == tijeras){
					System.out.println("Gana tu adversario");
				}break;
			case 3:
				if(resultado == piedra){
					System.out.println("Gana tu adversario");
				}else if(resultado == papel){
					System.out.println("Tú ganas!");
				}else if(resultado == tijeras){
					System.out.println("Empate");
				}break;
			default:
				System.out.println("La opción elegida no es válida.");
				break;
		}

	}

}
