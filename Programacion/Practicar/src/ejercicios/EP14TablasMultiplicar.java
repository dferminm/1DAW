package ejercicios;

import java.util.*;

public class EP14TablasMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Imprimir la tablas de multiplicar que el usuario elija.
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int multiplicador = 1;
		
		System.out.println("Dime la tabla de multiplicar que quieres: ");
		numero = teclado.nextInt();
		
		while(multiplicador <= 10){
			System.out.println(numero * multiplicador);
			multiplicador++;
		}

	}

}
