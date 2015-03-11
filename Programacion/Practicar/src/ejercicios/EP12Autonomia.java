package ejercicios;

import java.util.*;

public class EP12Autonomia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//El ordenador de nuestro coche calcula los kil�metros que nos quedan antes de repostar. 
		//Crea un programa que pida: tama�o del dep�sito (en litros), 
		//porcentaje del dep�sito que est� lleno y litros de consumo por 100kms. 
		//El programa mostrar� los kil�metros que quedan de autonom�a. 
		//Si quedan menos de 30 kil�metros mostrar� un aviso de que hay que repostar porque estamos usando la reserva.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Tama�o del dep�sito: ");
		int tama�oD = teclado.nextInt();
		System.out.println("Porcentaje que est� lleno: ");
		int porcentajeD = teclado.nextInt();
		System.out.println("Consumo a los 100 kms: ");
		int consumoD = teclado.nextInt();
		
		int autonomia = (tama�oD*porcentajeD)/consumoD;
		
		System.out.println("Quedan " + autonomia + " kil�metros");
		
		if(autonomia < 30)
			System.out.println("�ADV! Reserva encendida, hay que repostar");

	}

}
