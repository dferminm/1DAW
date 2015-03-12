package ejerciciosIniciacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionEnteros03 {

	public static void main(String[] args) {
		//Modifica el ejercicio 1 para que si el usuario introduce algo que no es un número, 
		//vuelva a repetirse el pedir el dividendo y divisor.

		Scanner teclado = new Scanner(System.in);
		
		int n1, n2;
		boolean esNumero = false;
		
		while(!esNumero) {
		try {
			System.out.println("Dime el primer número: ");
			n1 = teclado.nextInt();
			System.out.println("Dime el segundo número: ");
			n2 = teclado.nextInt();
			System.out.println(n1/n2);
			esNumero = true;
		}catch (InputMismatchException imex) {
			System.out.println("Eso no es un número.");
			teclado.next();
		}catch (ArithmeticException aex) {
			System.out.println("No se puede dividir un número entre 0.");
		}
		}
	}

}
