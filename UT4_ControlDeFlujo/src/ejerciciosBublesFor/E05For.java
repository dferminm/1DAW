package ejerciciosBublesFor;

import java.util.Scanner;

public class E05For {

	public static void main(String[] args) {
		//Escribe un programa que pida dos n�meros con el fin de visualizar la suma 
		//de todos los n�meros que hay entre ambos n�meros (incluidos dichos n�meros). 
		//Si el primer n�mero que inserte el usuario es mayor que el segundo, 
		//se volver�n a pedir otros dos n�meros hasta que el primer n�mero insertado 
		//sea menor o igual que el segundo.
		
		Scanner teclado = new Scanner(System.in);
		
		int n1,n2;
		n1 = 1;
		n2 = 0;
		int suma = 0;
		
		for(;n1>n2;){
			System.out.println("Dime el primer n�mero: ");
			n1 = teclado.nextInt();
			System.out.println("Dime el segundo n�mero ");
			n2 = teclado.nextInt();
		if(n1>n2)
			System.out.println("El primer n�mero es mayor que el segundo, repita el proceso:");
		
		for(;n1<n2;){
			suma+=n1;
			n1++;
		if(n1==n2){
			System.out.println("La suma de n�meros entre el primero y el segundo es " + (suma+n2));
		}
		}
		}

	}

}
