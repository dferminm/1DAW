package ejercicios;

import java.util.Scanner;

public class EP04Mayor {

	public static void main(String[] args) {
		
		//Escribe un programa que pida dos números y que visualice el número que sea mayor de los dos. 
		//Si los dos son iguales, imprimirá cualquiera de ellos.

		Scanner teclado = new Scanner (System.in);
		
		int n1, n2;
		
		System.out.println("Dime el primer número:");
		n1 = teclado.nextInt();
		
		System.out.println("Dime el segundo número:");
		n2 = teclado.nextInt();
		
		if(n1 > n2){
			System.out.println("El número mayor es el " + n1);
		}else if(n2 > n1){
			System.out.println("El número mayor es el " + n2);
		}else{
			System.out.println("Los números son iguales");
		}
	}

}
