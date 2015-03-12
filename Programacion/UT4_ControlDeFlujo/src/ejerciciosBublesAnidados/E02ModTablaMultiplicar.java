package ejerciciosBublesAnidados;

import java.util.Scanner;

public class E02ModTablaMultiplicar {

	public static void main(String[] args) {
		//Modifica el ejercicio de la tabla de multiplicar de forma que 
		//el usuario vaya introduciendo n�meros y se vayan imprimiendo las tablas correspondientes. 
		//El programa termina cuando se introduce un n�mero no est� entre 1 y 10.

		Scanner teclado=new Scanner(System.in);
		
		int numero=0;
		int fallos=0;
		int aleatorio=(int)(Math.random()*100);
		
		while(numero!=aleatorio){
			fallos++;
			
			System.out.println("Introduzca un n�mero:");
			numero=teclado.nextInt();
			
			if(numero<aleatorio){
				System.out.println("M�s alto");
			}
			
			if(numero>aleatorio){
				System.out.println("M�s bajo");
			}
		}
		System.out.println("Correcto. Has tenido " + fallos + " fallos.");
		
	}

}
