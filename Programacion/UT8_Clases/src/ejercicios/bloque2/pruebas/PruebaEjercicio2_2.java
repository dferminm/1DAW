package ejercicios.bloque2.pruebas;

import java.util.Scanner;

import ejercicios.bloque2.clases.Coche;

public class PruebaEjercicio2_2 {

	public static void main(String[] args) {
		//  Crea la clase Coche con dos constructores. Uno no toma parámetros y el otro sí. 
		// Los dos constructores inicializarán los atributos marca y modelo de la clase. 
		// Crea dos objetos (cada objeto llama a un constructor distinto) y verifica que todo funciona correctamente.
		
		Scanner teclado = new Scanner(System.in);
		
		Coche coche = new Coche();	
		
		System.out.println("Dime la marca del coche: ");
		String marca = teclado.next();
		System.out.println("Dime el modelo del coche: ");
		String modelo = teclado.next();
		
		coche.setMarca(marca);
		coche.setModelo(modelo);
		
		System.out.println("El coche con marca: " + coche.getMarca() + " y el modelo " + coche.getModelo() + " funciona correctamente.");
		System.out.println("El coche con la marca: " + Coche.marca(marca) + " y el modelo " + Coche.modelo(modelo) + " funciona correctamente.");

	}

}
