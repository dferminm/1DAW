package Ejercicios;

import java.util.Scanner;

public class Ejercicio3_1 {

	public static void main(String[] args) {
		/*Programa que calcule el perímetro y área de un 
        rectángulo dada su base y su altura.*/
		//Perímetro: 2*b+2*h
		//Área: b*h

		Scanner teclado=new Scanner(System.in);
		long base;
		long altura;
		
		System.out.println("Calcularé el perímetro y la base de un rectángulo ");
		
		System.out.println("Dime la base del rectángulo ");
		base=teclado.nextLong();
		
		System.out.println("Dime la altura del rectángulo ");
		altura=teclado.nextLong();
		
		System.out.println("El perímetro del rectángulo es " + 2*(base+altura));
		System.out.println("El área del rectángulo es " + (base*altura));
	}

}
