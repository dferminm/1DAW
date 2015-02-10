package ejerciciosArrayList;

import java.util.*;

public class Quiniela {

	public static void main(String[] args) {
		// Realiza un programa que calcule los 6 números para rellenar una quiniela primitiva 
		// controlando que no se repita ninguno de ellos.
		
		ArrayList quiniela = new ArrayList();
		
		System.out.println("Programa generando los 6 números de La Quiniela");
		
		int numero;
		
		for(int i = 0;i <= 6;i++) {
			numero = (int) (Math.random()*49 + 1);
			if(quiniela.contains(numero))
				i--;
			else
				quiniela.add(numero);
		}
		System.out.println(quiniela);
	}

}
