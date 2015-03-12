package ejercicios.bloque1.ejercicio5;

import java.util.*;

public class PruebaOculto {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Oculto nuevoOculto = new Oculto();
		
		boolean acertado = false;
		
		System.out.println("Número acertado(0) - El número oculto es mayor (1) - El número oculto es menor (-1)");
		
		while(acertado == false) {
			System.out.println("Introduzca un número: ");
			int numero = teclado.nextInt();
			System.out.println(nuevoOculto.pruebaNumero(numero));
			if(nuevoOculto.pruebaNumero(numero) == 0) {
				acertado = true;
			}
		}
		
		System.out.println("Enhorabuena, has acertado!");
		
	}

}
