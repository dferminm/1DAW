package ejercicios;

import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		//declaro la variable cantidad
		int cantidad;
		
		//en la variable cantidad se va a almacenar lo que introduzca el usuario por la consola
		System.out.println("Dime la longitud del Array:");
		cantidad = teclado.nextInt();
		
		//declaracion e inicializacion de array y variables
		int [] array = new int [cantidad];
		boolean chulo = false;
		int contador = 0;
		
		//bucle para que vaya agregando el número introducido dentro del Array 
		for(int i = 0;i < array.length;i++){
		System.out.println("Dime un número:");
		array[i] = teclado.nextInt();
		//bucle anidado para que vaya recorriendo el array un número por delante del anterior
		for(int j = 1;j < array.length;j++){
			//condicion para saber si el número es chulo o no
				if(array[j-1] == 8 && array[j] == 8){
					chulo = true;
				}
			if(array[j-1] != 8 && array[j] != 8){
				chulo = false;
			}
		}
		
		}
		
		//imprimir por consola si es cierto o no que es chulo (true o false)
		System.out.println(chulo);
		//imprimir el array por consola
		System.out.println("Este es el Array: " + Arrays.toString(array));
		
		

	}

}
