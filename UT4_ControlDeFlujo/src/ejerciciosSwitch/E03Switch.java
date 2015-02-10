package ejerciciosSwitch;

import java.util.Scanner;

public class E03Switch {

	public static void main(String[] args) {
		/*Programa que pida dos números enteros. El usuario después indicará una operación: *, +, -, /.
		El programa visulizará el resultado de esa operación, o error si no se corresponde con ninguna.*/
		
		Scanner teclado = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int o;
		
		System.out.println("Dime un número: ");
		numero1 = teclado.nextInt();
		
		System.out.println("Dime otro número: ");
		numero2 = teclado.nextInt();
		
		System.out.println("Indica la operación: *(1), +(2), -(3), /(4) : ");
		o = teclado.nextInt();
		
		switch(o){
		case 1:
			System.out.println("El resultado es: " + (numero1 * numero2));
			break;
		case 2:
			System.out.println("El resultado es: " + (numero1 + numero2));
			break;
		case 3:
			System.out.println("El resultado es: " + (numero1 - numero2));
			break;
		case 4:
			System.out.println("El resultado es: " + (numero1 / numero2));
			break;
		default:
			System.out.println("La opción indicada no es válida.");
			break;
		}

	}

}
