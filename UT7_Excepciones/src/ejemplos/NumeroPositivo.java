package ejemplos;

import java.util.*;

public class NumeroPositivo {

	public static int leerPositivo() throws NumeroPositivoException {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		numero = teclado.nextInt();
		
		if(numero < 0)
			throw new NumeroPositivoException();
		
		return numero;
	}
	
	public static void main(String[] args) {
		
		int numero = 0;
		
		try {
			numero = leerPositivo();
		}
		catch (NumeroPositivoException e) {
			System.out.println("Numero no positivo, vuelve a intentarlo");
		}
		catch (InputMismatchException imex) {
			System.out.println("No es un número, vuelve a intentarlo");
		}
		
		System.out.println(numero);
	}

}
