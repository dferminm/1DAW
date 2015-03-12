package ejerciciosPracticar;

import java.util.Scanner;

public class E06EmpleadosSueldo {

	public static void main(String[] args) {
		//Escribe un programa que pida los datos de empleados, en concreto su nombre y sueldo. 
		//Realizará una pregunta tipo "¿Otro [s/n]?" para saber cuando parar. 
		//El programa calculará la media del sueldo.
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		double sueldo = 0;
		String respuesta = "s";
		double c = 0;
		double cSueldo = sueldo;
		
		for(;respuesta.equals("s");c++) {
			System.out.println("Dime el nombre del empleado:");
			nombre = teclado.next();
			
			System.out.println("Dime el sueldo del empleado:");
			sueldo = teclado.nextInt();
			
			System.out.println("¿Otro [s/n]?");
			respuesta = teclado.next();
			
			cSueldo = cSueldo+sueldo;
			}
		
		System.out.println("La media del sueldo de los empleados es " + cSueldo/c + " €");
		
		}
	}

