package ejercicios;

import java.util.Arrays;

//Escribe un método que tome un vector de números y devuelva la suma acumulativa; 
//esto es, un nuevo vector en el que cada elemento contiene la suma de todos los elementos anteriores. 
//Por ejemplo, la suma acumulativa de [1, 2, 3] es [1, 3, 6].

public class SumaAcumulativa {

	public static int [] sumaAcumulativa (int vector []) {
		
		for(int i = 1;i < vector.length;i++) {
			vector[i] = vector[i] + vector[i-1];
		}
		
		return vector;
	}
	public static void main(String[] args) {
		
		int vector [] = new int [] {1, 2, 3};
		
		vector = sumaAcumulativa(vector);
		
		System.out.println(Arrays.toString(vector));
		
	}

}
