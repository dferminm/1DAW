package ejerciciosProfundizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionEnteros01 {

	public static void main(String[] args) {
		// Cambia el ejercicio 3 de iniciación de forma que si se intenta
		// dividir por cero,
		// la división se de por realizada. Utiliza los métodos getMessage(),
		// toString() y printStackTrace() para comprobar qué información se
		// visualiza.

		Scanner teclado = new Scanner(System.in);

		int n1, n2;
		boolean esNumero = false;

		while (!esNumero) {
			try {
				System.out.println("Dime el primer número: ");
				n1 = teclado.nextInt();
				System.out.println("Dime el segundo número: ");
				n2 = teclado.nextInt();
				System.out.println(n1 / n2);
				esNumero = true;
			} catch (InputMismatchException imex) {
				System.out.println("Eso no es un número.");
				imex.printStackTrace();
				System.out.println(imex.toString());
				System.out.println(imex.getMessage());
				teclado.next();
			} catch (ArithmeticException aex) {
				System.out.println("No se puede dividir un número entre 0.");
			}
		}
	}

}
