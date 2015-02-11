package ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class E01Quiniela {

	public static void main(String[] args) {
		//Realiza un programa que calcule los 6 números para rellenar
		//una quiniela primitiva controlando que no se repita ninguno de ellos.
		
		//Repetir hasta que teng 6 números
		//Generar número [1-49]
		//Mirar si está
		//Si está lo descarto, si no lo guardo
		
		Scanner teclado = new Scanner(System.in);
		
		int [] primitiva = new int [6];
		
		System.out.println("---LA PRIMITIVA---");
		
		for(int i = 0;i < 6;) {
			
			int aleatorio = (int)(Math.random() * 49 + 1);
			
			boolean esta = false;
			
			for(int j = 0;j < i;j++)
				if(aleatorio == primitiva[j]) esta = true;
				if(!esta)
				primitiva[i] = aleatorio;
				i++;
	}
		System.out.println(Arrays.toString(primitiva));

}
}
