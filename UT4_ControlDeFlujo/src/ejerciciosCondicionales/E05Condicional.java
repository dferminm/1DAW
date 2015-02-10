package ejerciciosCondicionales;

import java.util.Scanner;

public class E05Condicional {

	public static void main(String[] args) {
		//Programa que diga si un año es bisiesto o no
		
		Scanner teclado = new Scanner(System.in);
		
		int año;
		
		System.out.println("Dime un año: ");
		año = teclado.nextInt();
		
		if (año%4==0 && año%100!=0 || año%400==0){
			System.out.println("Año bisiesto");
		}else{
			System.out.println("Año no bisiesto");
	}

}}
