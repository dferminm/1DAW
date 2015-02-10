package ejercicios;

import java.util.Arrays;

public class ACRellenarAleatorioYMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear array.
		//Rellenar con números aleatorios entre 1 y 100.
		
		int [] vector = new int [10];
		
		for(int i = 0;i < vector.length;i++)
			vector[i] = (int)(Math.random() * 100 + 1);
		
			//recorremos el array para buscar el mayor
			
			int mayor;
			mayor = vector [0];
			
			for(int i = 1;i < vector.length;i++)
				if(vector [i] > mayor){
					mayor = vector[i];
				}
		
			System.out.println("El número mayor es el " + mayor);
	
	}
}
