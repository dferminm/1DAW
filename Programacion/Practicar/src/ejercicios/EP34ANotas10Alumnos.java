package ejercicios;

import java.util.*;

public class EP34ANotas10Alumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribe un programa que pida las notas que han obtenido los 10 alumnos de una clase 
		//en el módulo de "Sistemas Informáticos" y el nombre de cada uno de ellos. 
		//Posteriormente, el programa debe visualizar la media obtenida en dicho módulo, 
		//la cantidad de alumnos que superan dicha media 
		//y el nombre de los alumnos que han superado la media.
		
		Scanner teclado = new Scanner(System.in);
		
		int [] notas = new int [10];
		String [] nombres = new String [10];
		int media = 0;
		int contador = 0;
		int contador2 = 0;
		
		System.out.println("---Notas de Sistemas Informáticos---");
		
		for(int i = 0;i < notas.length;i++){
			System.out.println("Nombre del alumno: ");
			nombres [i] = teclado.next();
			
			System.out.println("Nota del alumno: ");
			notas [i] = teclado.nextInt();
			
			contador ++;
			media = media + notas[i];
			
		}
		System.out.println("Los alumnos que han superado la media son: ");

		for(int i = 0;i < 10;i++){
			if(notas[i] > media/contador){
				System.out.println(nombres[i]);
				contador2++;
			}
		}
		System.out.println("El número de alumnos que ha superado la media es: " + contador2);
		System.out.println("La media obtenida en el módulo es " + media/contador);
	}

}
