package ejerciciosCondicionales;

import java.util.Scanner;

public class E05Condicional {

	public static void main(String[] args) {
		//Programa que diga si un a�o es bisiesto o no
		
		Scanner teclado = new Scanner(System.in);
		
		int a�o;
		
		System.out.println("Dime un a�o: ");
		a�o = teclado.nextInt();
		
		if (a�o%4==0 && a�o%100!=0 || a�o%400==0){
			System.out.println("A�o bisiesto");
		}else{
			System.out.println("A�o no bisiesto");
	}

}}
