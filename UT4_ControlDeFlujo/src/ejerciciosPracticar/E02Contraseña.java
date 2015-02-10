package ejerciciosPracticar;

import java.util.Scanner;

public class E02Contraseña {

	public static void main(String[] args) {
		//Un programa que pida al usuario una contraseña (en el programa escribe la palabra oculta que quieras). 
		//El programa volverá a pedir la contraseña hasta que la adivine el jugador o se llege a los 3 intentos, 
		//lo que ocurra primero. 
		//Mostrará un mensaje de aceptación de la contraseña o el de error por hacer tres intentos fallidos.
		
		Scanner teclado = new Scanner(System.in);
		
		String oculta = "david";
		int intentos = 1;
		
		do{
			System.out.println("Introduce la contraseña:");
			oculta = teclado.nextLine();
			intentos++;
			if(oculta.equals("david")==false){
			System.out.println("Contraseña incorrecta");
			}
		}while(intentos<=3 && oculta.equals("david")==false);
		
		if(oculta.equals("david")==false){
			System.out.println("Has sobrepasado los 3 intentos permitidos.");
			System.out.println("Fin del programa.");
		}if (oculta.equals("david")==true){
			System.out.println("Contraseña correcta!");
		}

	}

}
