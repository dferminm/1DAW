package ejerciciosSwitch;

import java.util.Scanner;

public class E02Switch {

	public static void main(String[] args) {
		/*Pide un n�mero del 1 al 7. Imprime si es laborable o festivo. 
		Puedes realizar el ejercicio con sentencias if y otra versi�n con switch.*/
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Dime un n�mero del 1 al 7 y te dir� si es festivo o no: ");
		numero = teclado.nextInt();
		
		switch (numero){
		case 1:
			System.out.println("No festivo");
			break;
		case 2:
			System.out.println("No festivo");
			break;
		case 3:
			System.out.println("No festivo");
			break;
		case 4:
			System.out.println("No festivo");
			break;
		case 5:
			System.out.println("No festivo");
			break;
		case 6:
			System.out.println("Festivo");
			break;
		case 7:
			System.out.println("Festivo");
			break;
		default:
			System.out.println("La opci�n elegida no es v�lida.");
			break;
			
		}

	}

}
