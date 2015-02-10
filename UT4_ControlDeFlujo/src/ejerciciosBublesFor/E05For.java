package ejerciciosBublesFor;

import java.util.Scanner;

public class E05For {

	public static void main(String[] args) {
		//Escribe un programa que pida dos números con el fin de visualizar la suma 
		//de todos los números que hay entre ambos números (incluidos dichos números). 
		//Si el primer número que inserte el usuario es mayor que el segundo, 
		//se volverán a pedir otros dos números hasta que el primer número insertado 
		//sea menor o igual que el segundo.
		
		Scanner teclado = new Scanner(System.in);
		
		int n1,n2;
		n1 = 1;
		n2 = 0;
		int suma = 0;
		
		for(;n1>n2;){
			System.out.println("Dime el primer número: ");
			n1 = teclado.nextInt();
			System.out.println("Dime el segundo número ");
			n2 = teclado.nextInt();
		if(n1>n2)
			System.out.println("El primer número es mayor que el segundo, repita el proceso:");
		
		for(;n1<n2;){
			suma+=n1;
			n1++;
		if(n1==n2){
			System.out.println("La suma de números entre el primero y el segundo es " + (suma+n2));
		}
		}
		}

	}

}
