package ejercicios;

import java.util.*;

public class EP16PedirNumerosHastaPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribir un programa que pida varios números hasta que el usuario inserte un número par. 
		//Hay que ir mostrando cada uno de los números insertados (excepto el par).
		
		Scanner teclado = new Scanner (System.in);
		
		int numero = 1;
		
		while(numero % 2 != 0){
			System.out.println("Dime un número: ");
			numero = teclado.nextInt();
			if(numero % 2 != 0){
				System.out.println("Has insertado un " + numero);
			}
		}

	}

}
