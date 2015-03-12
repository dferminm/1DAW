package ejerciciosIniciacion;

import java.util.InputMismatchException;
import java.util.*;

public class DivisionEnteros02 {

	public static void main(String[] args) {
		//Añade un bloque finally al ejercicio 1 
		//y haz que se muestre un mensaje final independientemente de lo que ocurra en el programa.

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
		}finally {
			System.out.println("El programa ha finalizado.");
		}
	}

}
