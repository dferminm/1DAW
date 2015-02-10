package ejercicios;

import java.util.*;

//Escribe un m�todo llamado ordenado, que tome un vector de enteros como par�metro 
//y devuelva true si el vector (todos sus elementos) est� ordenado ascendentemente, 
//o false en caso contrario.

public class Ordenado {
	
	public static boolean ordenado (int vector []) {
		
		boolean estaOrdenado = false;
		
		for(int i = 1;i < vector.length;i++) {
			if(vector[i] > vector[i-1]) {
				estaOrdenado = true;
			}else{
				estaOrdenado = false;
			}
		}
		
		return estaOrdenado;
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indica el tama�o del vector: ");
		int tama�o = teclado.nextInt();
		
		int [] array = new int [tama�o];
		
		System.out.println("Introduzca n�meros dentro del array: ");
		
		for(int i = 0;i < array.length;i++) {
			array[i] = teclado.nextInt();
		}
		boolean ordenado = ordenado(array);
		
		System.out.println(ordenado);
	}
}
