package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Programa que convierta un peso en Kg a Onzas
		//1Kg=35.2739619(Oz)
		
		Scanner teclado=new Scanner(System.in);
		float kilos;
		final float ONZAS=35.2739619f;
		//Las variables constantes se deben escribir en mayúscula como norma general.
		
		System.out.println("Dime un peso en Kg y te lo diré en Oz ");
		
		System.out.println("Dime el peso en Kg ");
		kilos=teclado.nextFloat();
		
		System.out.println("El peso introducido en Kg es igual a " + kilos*ONZAS + " Onzas ");

	}

}
