package ejercicios;

import java.util.Scanner;

public class EP06DiaSemana {

	public static void main(String[] args) {
		
		//Pide un n�mero del 1 al 7. Imprime el d�a de la semana equivalente (con letra).
		
		Scanner teclado = new Scanner (System.in);
		
		int n;
		
		System.out.println("Dime un n�mero del 1 al 7 y te dir� el d�a de la semana equivalente:");
		n = teclado.nextInt();
		
		switch(n){
		
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Mi�rcoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("S�bado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("El n�mero escrito no comprende el rango 1-7");
		}

	}

}
