package ejerciciosPracticar;

import java.util.Scanner;

public class E05NumerosIguales {

	public static void main(String[] args) {
		//Escribe un programa que pida dos números. 
		//Si los dos números dados son iguales, se visualizará un mensaje informando de esto y 
		//se volverán a pedir otros dos números. El programa termina cuando los dos números no son iguales 
		//y se imprime el mayor de los dos.
		
		Scanner teclado = new Scanner(System.in);
		
		int n1,n2;
		
		do{
			System.out.println("Dime el primer número:");
			n1 = teclado.nextInt();
			System.out.println("Dime el segundo número:");
			n2 = teclado.nextInt();
			if(n1==n2){
				System.out.println("Los números introducidos son iguales, inténtelo de nuevo.");
			}
		}while(n1==n2);
		
		if(n1>n2){
			System.out.println("El número mayor es " + n1);
		}else{
			System.out.println("El número mayor es " + n2);
		}

	}

}
