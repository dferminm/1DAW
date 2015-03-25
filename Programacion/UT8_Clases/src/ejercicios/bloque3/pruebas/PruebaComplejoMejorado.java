package ejercicios.bloque3.pruebas;

import java.util.ArrayList;

import ejercicios.bloque3.clases.*;

public class PruebaComplejoMejorado {

	public static void main(String[] args) {
		/* programa que genere un arraylist con 10 números complejos (aleatorios entre -10,-10i y 10, 10i).
		Imprimir el arraylist.
		multiplicar por (2, 0i) todos los números y mostrar el resultado. */
		
		ArrayList <Complejo> complejos = new ArrayList <Complejo>();
		
		Complejo multiplicador = new Complejo(2, 0);
		
		for(int i = 0;i < 20;i++) {
			int real = (int)(Math.random()*(10-(-10)+1)-11);
			int imaginaria = (int)(Math.random()*(10-(-10)+1)-11);
			Complejo complejo = new Complejo(real, imaginaria);
			complejos.add(complejo);
			System.out.println(complejo);
			complejo.multiplica(multiplicador);
		}
		
		System.out.println(complejos);

	}

}
