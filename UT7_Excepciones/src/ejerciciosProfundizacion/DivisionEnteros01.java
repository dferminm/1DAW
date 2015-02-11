package ejerciciosProfundizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionEnteros01 {

	public static void main(String[] args) {
		// Cambia el ejercicio 3 de iniciaci�n de forma que si se intenta
		// dividir por cero,
		// la divisi�n se de por realizada. Utiliza los m�todos getMessage(),
		// toString() y printStackTrace() para comprobar qu� informaci�n se
		// visualiza.

		Scanner teclado = new Scanner(System.in);

		int n1, n2;
		boolean esNumero = false;

		while (!esNumero) {
			try {
				System.out.println("Dime el primer n�mero: ");
				n1 = teclado.nextInt();
				System.out.println("Dime el segundo n�mero: ");
				n2 = teclado.nextInt();
				System.out.println(n1 / n2);
				esNumero = true;
			} catch (InputMismatchException imex) {
				System.out.println("Eso no es un n�mero.");
				imex.printStackTrace();
				System.out.println(imex.toString());
				System.out.println(imex.getMessage());
				teclado.next();
			} catch (ArithmeticException aex) {
				System.out.println("No se puede dividir un n�mero entre 0.");
			}
		}
	}

}
