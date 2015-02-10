package ejercicios;

import java.util.Scanner;

public class EP06DiaSemana {

	public static void main(String[] args) {
		
		//Pide un número del 1 al 7. Imprime el día de la semana equivalente (con letra).
		
		Scanner teclado = new Scanner (System.in);
		
		int n;
		
		System.out.println("Dime un número del 1 al 7 y te diré el día de la semana equivalente:");
		n = teclado.nextInt();
		
		switch(n){
		
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("El número escrito no comprende el rango 1-7");
		}

	}

}
