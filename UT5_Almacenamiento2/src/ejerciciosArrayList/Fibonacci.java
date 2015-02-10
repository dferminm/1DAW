package ejerciciosArrayList;

import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		//Crea una colecci�n con los primeros X n�meros de la serie de Fibonacci, donde X es un n�mero que pedir�s al usuario. 
		//Despu�s pregunta n�meros y di si est� o no en la colecci�n. 
		//El programa terminar� cuando el usuario introduzca un 0.
		//Serie de Fibonacci: 1,1,2,3,5,8,13,21,34,55... hasta infinito.
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> serie = new ArrayList<Integer>();
		
		//Pedir X al usuario, para crear el arraylist de esa cantidad de elementos.
		System.out.println("Dime la cantidad de elementos de la serie: ");
		int x = teclado.nextInt();
		
		//A�adir en la (posici�n 0 el n�mero 1) y en la (posici�n 1, el n�mero 1).
		serie.add(1);
		serie.add(1);
		
		//Recorrer el arraylist.
		for(int i = 2;i < x;i++) {
			//Hacer 2 variables, que contenga cada una el elemento 
			//1 posici�n antes de "i", y 2 posiciones antes de "i".
			int a = (int)serie.get(i-1);
			int b = (int)serie.get(i-2);
			//A�adir a la posici�n "i", la suma de a + b.
			serie.add(a + b);
		}
		
		System.out.println(serie);
		
		System.out.println("Preguntame n�meros y te dir� si est�n en la colecci�n o no. Para terminar introduce 0.");
		
		//Crear bucle para pedir n�meros.
		while(true) {
			System.out.println("Dime un n�mero: ");
			int numero = teclado.nextInt();
			//Si se introduce "0", se sale del bucle.
			if(numero == 0) {
				break;
			}
			//Si numero est� en la serie, imprimir que est�.
			if(serie.contains(numero)) {
				System.out.println("El n�mero " + numero + " SI est� en la serie.");
			//Si n�mero NO est� en la serie, imprimir que no est�.
			}else{
				System.out.println("El n�mero " + numero + " NO est� en la serie.");
			}
		}

	}

}
