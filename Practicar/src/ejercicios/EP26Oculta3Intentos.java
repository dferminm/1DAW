package ejercicios;

import java.util.*;

public class EP26Oculta3Intentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Un programa que pida al usuario una contrase�a (en el programa escribe la palabra oculta que quieras). 
		//El programa volver� a pedir la contrase�a hasta que la adivine el jugador o se llege a los 3 intentos, 
		//lo que ocurra primero. 
		//Mostrar� un mensaje de aceptaci�n de la contrase�a o el de error por hacer tres intentos fallidos.
		
		Scanner teclado = new Scanner (System.in);
		
		String oculta = "david";
		String respuesta;
		int contador = 0;
		
		do {
			System.out.println("Escribe la contrase�a: ");
			respuesta = teclado.nextLine();
			if(respuesta.equals(oculta) == true){
				System.out.println("Contrase�a correcta!");
			}else if(respuesta.equals(oculta) == false){
				System.out.println("Contrase�a incorrecta, int�ntelo de nuevo");
				contador++;
				if(contador > 3){
					System.out.println("Ha sobrepasado los 3 intentos permitidos");
					break;
				}
			}
		}while(respuesta.equals(oculta) == false);

	}

}
