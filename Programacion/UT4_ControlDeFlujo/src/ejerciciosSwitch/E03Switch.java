package ejerciciosSwitch;

import java.util.Scanner;

public class E03Switch {

	public static void main(String[] args) {
		/*Programa que pida dos n�meros enteros. El usuario despu�s indicar� una operaci�n: *, +, -, /.
		El programa visulizar� el resultado de esa operaci�n, o error si no se corresponde con ninguna.*/
		
		Scanner teclado = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int o;
		
		System.out.println("Dime un n�mero: ");
		numero1 = teclado.nextInt();
		
		System.out.println("Dime otro n�mero: ");
		numero2 = teclado.nextInt();
		
		System.out.println("Indica la operaci�n: *(1), +(2), -(3), /(4) : ");
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
			System.out.println("La opci�n indicada no es v�lida.");
			break;
		}

	}

}
