package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*Programa que pida tama�o de archivo (Mb) y la velocidad de datos (Mbps)
		y muestre el tiempo que tardar� en transmitirlo*/
		//Tama�o de archivo / Vel de transferencia = tiempo en segundos.
		
		Scanner teclado=new Scanner(System.in);
		float archivo;
		float velocidad;
		
		System.out.println("Tiempo de transferencia de archivos: ");
		
		System.out.println("Indica tama�o del archivo (Mb) ");
		archivo=teclado.nextFloat();
		
		System.out.println("Indica velocidad de transferencia de datos (Mbps) ");
		velocidad=teclado.nextFloat();
		
		System.out.println("El tiempo que tardar� es de " + archivo/velocidad + " segundos o " + archivo/velocidad/60 + " minutos ");

	}

}
