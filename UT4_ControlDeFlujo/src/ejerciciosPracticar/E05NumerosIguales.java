package ejerciciosPracticar;

import java.util.Scanner;

public class E05NumerosIguales {

	public static void main(String[] args) {
		//Escribe un programa que pida dos n�meros. 
		//Si los dos n�meros dados son iguales, se visualizar� un mensaje informando de esto y 
		//se volver�n a pedir otros dos n�meros. El programa termina cuando los dos n�meros no son iguales 
		//y se imprime el mayor de los dos.
		
		Scanner teclado = new Scanner(System.in);
		
		int n1,n2;
		
		do{
			System.out.println("Dime el primer n�mero:");
			n1 = teclado.nextInt();
			System.out.println("Dime el segundo n�mero:");
			n2 = teclado.nextInt();
			if(n1==n2){
				System.out.println("Los n�meros introducidos son iguales, int�ntelo de nuevo.");
			}
		}while(n1==n2);
		
		if(n1>n2){
			System.out.println("El n�mero mayor es " + n1);
		}else{
			System.out.println("El n�mero mayor es " + n2);
		}

	}

}
