package ejerciciosCondicionales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class E07Condicional {

	public static void main(String[] args) {
		/*El juego de piedra/papel/tijera. Haz un programa para jugar
		a piedra/papel/tijera con el ordenador. Solo una ronda por ejecución.*/
		
		Scanner teclado = new Scanner(System.in);
		
		int pregunta;
		int resultado;
		
		System.out.println("Piedra(1) Papel(2) Tijeras(3) ");
		
		System.out.println("¿Piedra, Papel o Tijeras?");
		pregunta = teclado.nextInt();
		
		resultado = (int )(Math.random() * 3 + 1);
		System.out.println("Tu oponente elige: " + resultado);
		
		switch(pregunta){
		case 1:
			System.out.println("PIEDRA");
			break;
		case 2:
			System.out.println("PAPEL");
			break;
		case 3:
			System.out.println("TIJERAS");
			break;
		default:
			System.out.println("La opción elegida no es válida.");
			break;
			
		}
		

	}

}
