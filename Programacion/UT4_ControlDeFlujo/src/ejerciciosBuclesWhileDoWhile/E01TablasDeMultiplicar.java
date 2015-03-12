package ejerciciosBuclesWhileDoWhile;

import java.util.Scanner;

public class E01TablasDeMultiplicar {

	public static void main(String[] args) {
		//Imprimir tablas de multiplicar que el usuario elija.
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int multiplicador;
		
		multiplicador = 1;
		
		System.out.println("Tabla de multiplicar del numero que elijas: ");
		numero = teclado.nextInt();
		
		while(multiplicador<=10){
			System.out.println(numero*multiplicador);
			multiplicador++;
		
		}

	}

}
