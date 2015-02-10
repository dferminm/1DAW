package ejercicios;

import java.util.*;

public class EP28NombreSueldoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribe un programa que pida los datos de empleados, en concreto su nombre y sueldo. 
		//Realizará una pregunta tipo "¿Otro [s/n]?" para saber cuando parar. 
		//El programa calculará la media del sueldo.
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		int sueldo;
		int contador = 0;
		String respuesta;
		
		do {
			System.out.println("Indica el nombre del empleado: ");
			nombre = teclado.next();
			System.out.println("Indica el sueldo del empleado: ");
			sueldo = teclado.nextInt();
			System.out.println("¿Otro [s/n]?");
			respuesta = teclado.next();
			contador++;
			contador *= sueldo;
		}while(respuesta.equals("s") == true);

	}

}
