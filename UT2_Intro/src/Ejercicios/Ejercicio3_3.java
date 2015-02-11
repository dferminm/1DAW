package Ejercicios;

import java.util.Scanner;

public class Ejercicio3_3 {

	public static void main(String[] args) {
		//Programa que calcule el volumen de una esfera dado su radio.
		//Volumen esfera: 4/3*PI*r^3
		
		Scanner teclado=new Scanner(System.in);
		final float PI=3.1416f;
		float radio;
		
		System.out.println("Volumen de una esfera ");
		
		System.out.println("Dime el radio ");
		radio=teclado.nextLong();
		
		System.out.println("El volumen de la esfera es " + 1.33f*PI*Math.pow(radio, 3));

	}

}
