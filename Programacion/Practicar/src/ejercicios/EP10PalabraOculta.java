package ejercicios;

import java.util.Scanner;

public class EP10PalabraOculta {

	public static void main(String[] args) {
		
		//Crea un programa que tiene una palabra oculta. 
		//El programa pregunta la contrase�a al jugador, si la adivina muestra un mensaje de �xito. 
		//Si no, muestra el error.
		
		Scanner teclado = new Scanner (System.in);
		
		String oculta = "david";
		String palabra;
		
		System.out.println("Contrase�a:");
		palabra = teclado.next();
		
		if(palabra.equals(oculta) == true){
			System.out.println("Correcto!");
		}else{
			System.out.println("Contrase�a incorrecta.");
		}
		
	}

}
