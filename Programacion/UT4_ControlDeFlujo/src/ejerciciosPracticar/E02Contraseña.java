package ejerciciosPracticar;

import java.util.Scanner;

public class E02Contrase�a {

	public static void main(String[] args) {
		//Un programa que pida al usuario una contrase�a (en el programa escribe la palabra oculta que quieras). 
		//El programa volver� a pedir la contrase�a hasta que la adivine el jugador o se llege a los 3 intentos, 
		//lo que ocurra primero. 
		//Mostrar� un mensaje de aceptaci�n de la contrase�a o el de error por hacer tres intentos fallidos.
		
		Scanner teclado = new Scanner(System.in);
		
		String oculta = "david";
		int intentos = 1;
		
		do{
			System.out.println("Introduce la contrase�a:");
			oculta = teclado.nextLine();
			intentos++;
			if(oculta.equals("david")==false){
			System.out.println("Contrase�a incorrecta");
			}
		}while(intentos<=3 && oculta.equals("david")==false);
		
		if(oculta.equals("david")==false){
			System.out.println("Has sobrepasado los 3 intentos permitidos.");
			System.out.println("Fin del programa.");
		}if (oculta.equals("david")==true){
			System.out.println("Contrase�a correcta!");
		}

	}

}
