package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Programa que pida el nombre al usuario y lo salude.
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Hola usuario, dime tu nombre ");
		String nombre=teclado.nextLine();
		
		System.out.println("Bienvenido " + nombre + " , encantado de conocerte.");
	}

}
