package Ejercicios;

import java.util.Scanner;

public class Ejercicio3_2 {

	public static void main(String[] args) {
		//Programa que calcule el per�metro y el �rea de un c�rculo dado su radio.
		//Per�metro: 2*PI*r
		//�rea: PI*r^2
		
		Scanner teclado=new Scanner(System.in);
		final float PI=3.1416f;
		float radio;
		
		System.out.println("Per�metro y radio de una circunferencia ");
		
		System.out.println("Dime el radio de la circunferencia ");
		radio=teclado.nextLong();
		
		System.out.println("El per�metro es " + 2*PI*radio);
		System.out.println("El �rea es " + PI*Math.pow(radio, 2));

	}

}
