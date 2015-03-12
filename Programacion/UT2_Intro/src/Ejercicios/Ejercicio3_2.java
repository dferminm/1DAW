package Ejercicios;

import java.util.Scanner;

public class Ejercicio3_2 {

	public static void main(String[] args) {
		//Programa que calcule el perímetro y el área de un círculo dado su radio.
		//Perímetro: 2*PI*r
		//Área: PI*r^2
		
		Scanner teclado=new Scanner(System.in);
		final float PI=3.1416f;
		float radio;
		
		System.out.println("Perímetro y radio de una circunferencia ");
		
		System.out.println("Dime el radio de la circunferencia ");
		radio=teclado.nextLong();
		
		System.out.println("El perímetro es " + 2*PI*radio);
		System.out.println("El área es " + PI*Math.pow(radio, 2));

	}

}
