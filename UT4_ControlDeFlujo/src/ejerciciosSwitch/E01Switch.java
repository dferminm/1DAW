package ejerciciosSwitch;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class E01Switch {

	public static void main(String[] args) {
		//Pide un n�mero del 1 al 7. Imprime el d�a de la semana equivalente (con letra).
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un numero del 1 al 7 y te dir� el d�a de la semana: ");
		int numero = teclado.nextInt();
		
		switch (numero){
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("El n�mero no coincide con ning�n d�a de la semana.");
		}

	}

}
