package ejerciciosIniciacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionEnteros04 {

	public static void main(String[] args) {
		//Modifica el ejercicio 3 para que si el usuario tiene más de 5 errores 
		//muestre el mensaje "Demasiados fallos. Vuelve a intentarlo otro día".

		Scanner teclado = new Scanner(System.in);
		
		int n1, n2;
		boolean esNumero = false;
		int contador = 0;
		
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
			contador++;
		}catch (ArithmeticException aex) {
			System.out.println("No se puede dividir un número entre 0.");
		}finally {
			if(contador > 5) {
				System.out.println("Demasiados fallos. Vueve a intentarlo otro día.");
				System.exit(-1);
			}
			System.out.println("Fin del programa.");
		}
		}
	}

}
