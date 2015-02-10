package ejerciciosIniciacion;

import java.util.*;

public class DivisionEnteros01 {

	public static void main(String[] args) {
		//Crea un programa que pida dos números enteros y muestre el resultado de su división. 
		//Captura la excepción InputMismatchException y ArimeticException 
		//y muestra un mensaje para el caso de que no se introduzca un número 
		//o se intente dividir entre cero respectivamente.

		Scanner teclado = new Scanner(System.in);
		
		int n1, n2;
		
		try {
			System.out.println("Dime el primer número: ");
			n1 = teclado.nextInt();
			System.out.println("Dime el segundo número: ");
			n2 = teclado.nextInt();
			System.out.println(n1/n2);
		}catch (InputMismatchException imex) {
			System.out.println("Eso no es un número.");
		}catch (ArithmeticException aex) {
			System.out.println("No se puede dividir un número entre 0.");
		}
	}

}
