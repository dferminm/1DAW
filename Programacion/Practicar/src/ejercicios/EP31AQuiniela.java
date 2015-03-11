package ejercicios;

import java.util.*;

public class EP31AQuiniela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realiza un programa que calcule los 6 números para rellenar una quiniela primitiva 
		//controlando que no se repita ninguno de ellos.
		
		Scanner teclado = new Scanner(System.in);
		
		int [] quiniela = new int [6];
		
		for(int i = 0;i < quiniela.length;i++){
			int calculo = (int)(Math.random() * 99 + 1);
			quiniela[i] = calculo;
		}
		System.out.println(Arrays.toString(quiniela));
		//Se repiten los números!
	}

}
