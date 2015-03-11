package ejercicios;

import java.util.*;

public class EP35AEstaturaAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Escribe un programa que pida la estatura de una serie de alumnos, 
		//de tantos como indique el usuario del programa. 
		//Posteriormente, el programa ordenará dichos datos de forma ascendente. 
		//Una vez ordenados, el programa visualizará los datos en el orden que se insertaron 
		//y ordenados de forma ascendente.
		
		Scanner teclado = new Scanner(System.in);
		
		double [] estaturas = new double [5];
		
		System.out.println("Estatura de 5 alumnos: ");
		
		for(int i = 0; i < 5;i++){
			estaturas [i] = teclado.nextDouble();
		}
		System.out.println("Lista de estaturas sin ordenar: ");
		System.out.println(Arrays.toString(estaturas));

		System.out.println("Lista de estaturas ordenadas: ");
		Arrays.sort(estaturas);
		System.out.println(Arrays.toString(estaturas));
	}

}
