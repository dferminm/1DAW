package ejerciciosCadenas;

import java.util.*;

public class RotarCadena {

	public static void main(String[] args) {
		//Rotar una cadena a la derecha tantas veces como nos digan. 
		//El programa pedir� la cadena y el n�mero de posiciones a rotar, 
		//as� que si introducimos "Rotaciones de cadena" y el valor 4, 
		//nos devolver� "denaRotaciones de ca"

		Scanner teclado = new Scanner(System.in);

		String frase;
		int rotar;

		int contador = 0;
		int contador2 =0;

		System.out.println("Escribe una frase");
		frase = teclado.nextLine();
		System.out.println("Indica el numero de rotaciones");
		rotar = teclado.nextInt();

		contador2 = rotar;

		while(rotar>0){
		System.out.print(frase.charAt(frase.length()-rotar));
		rotar--;
		}
		for(int i=0;i<frase.length()-contador2;i++){
		System.out.print(frase.charAt(i));
		contador++;
		}
	}

}
