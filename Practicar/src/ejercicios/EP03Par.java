package ejercicios;

import java.util.Scanner;

public class EP03Par {

	public static void main(String[] args) {
		
		//Escribe un programa que pida un n�mero con el fin de visualizarlo, 
		//siempre que dicho n�mero sea par.

		Scanner teclado = new Scanner (System.in);
		
		int n;
		
		System.out.println("Dime un n�mero y te dir� si es par o impar:");
		n = teclado.nextInt();
		
		if(n%2==0){
			System.out.println("El n�mero es par");
		}else{
			System.out.println("El n�mero es impar");
		}
	}

}
