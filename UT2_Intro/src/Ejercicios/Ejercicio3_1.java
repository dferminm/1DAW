package Ejercicios;

import java.util.Scanner;

public class Ejercicio3_1 {

	public static void main(String[] args) {
		/*Programa que calcule el per�metro y �rea de un 
        rect�ngulo dada su base y su altura.*/
		//Per�metro: 2*b+2*h
		//�rea: b*h

		Scanner teclado=new Scanner(System.in);
		long base;
		long altura;
		
		System.out.println("Calcular� el per�metro y la base de un rect�ngulo ");
		
		System.out.println("Dime la base del rect�ngulo ");
		base=teclado.nextLong();
		
		System.out.println("Dime la altura del rect�ngulo ");
		altura=teclado.nextLong();
		
		System.out.println("El per�metro del rect�ngulo es " + 2*(base+altura));
		System.out.println("El �rea del rect�ngulo es " + (base*altura));
	}

}
