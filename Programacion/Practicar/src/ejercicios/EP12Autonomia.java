package ejercicios;

import java.util.*;

public class EP12Autonomia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//El ordenador de nuestro coche calcula los kilómetros que nos quedan antes de repostar. 
		//Crea un programa que pida: tamaño del depósito (en litros), 
		//porcentaje del depósito que está lleno y litros de consumo por 100kms. 
		//El programa mostrará los kilómetros que quedan de autonomía. 
		//Si quedan menos de 30 kilómetros mostrará un aviso de que hay que repostar porque estamos usando la reserva.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Tamaño del depósito: ");
		int tamañoD = teclado.nextInt();
		System.out.println("Porcentaje que está lleno: ");
		int porcentajeD = teclado.nextInt();
		System.out.println("Consumo a los 100 kms: ");
		int consumoD = teclado.nextInt();
		
		int autonomia = (tamañoD*porcentajeD)/consumoD;
		
		System.out.println("Quedan " + autonomia + " kilómetros");
		
		if(autonomia < 30)
			System.out.println("¡ADV! Reserva encendida, hay que repostar");

	}

}
