package ejercicios;

import java.util.*;

public class EP26Oculta3Intentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Un programa que pida al usuario una contraseña (en el programa escribe la palabra oculta que quieras). 
		//El programa volverá a pedir la contraseña hasta que la adivine el jugador o se llege a los 3 intentos, 
		//lo que ocurra primero. 
		//Mostrará un mensaje de aceptación de la contraseña o el de error por hacer tres intentos fallidos.
		
		Scanner teclado = new Scanner (System.in);
		
		String oculta = "david";
		String respuesta;
		int contador = 0;
		
		do {
			System.out.println("Escribe la contraseña: ");
			respuesta = teclado.nextLine();
			if(respuesta.equals(oculta) == true){
				System.out.println("Contraseña correcta!");
			}else if(respuesta.equals(oculta) == false){
				System.out.println("Contraseña incorrecta, inténtelo de nuevo");
				contador++;
				if(contador > 3){
					System.out.println("Ha sobrepasado los 3 intentos permitidos");
					break;
				}
			}
		}while(respuesta.equals(oculta) == false);

	}

}
