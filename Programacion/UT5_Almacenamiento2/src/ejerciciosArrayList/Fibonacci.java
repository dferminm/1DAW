package ejerciciosArrayList;

import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		//Crea una colección con los primeros X números de la serie de Fibonacci, donde X es un número que pedirás al usuario. 
		//Después pregunta números y di si está o no en la colección. 
		//El programa terminará cuando el usuario introduzca un 0.
		//Serie de Fibonacci: 1,1,2,3,5,8,13,21,34,55... hasta infinito.
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> serie = new ArrayList<Integer>();
		
		//Pedir X al usuario, para crear el arraylist de esa cantidad de elementos.
		System.out.println("Dime la cantidad de elementos de la serie: ");
		int x = teclado.nextInt();
		
		//Añadir en la (posición 0 el número 1) y en la (posición 1, el número 1).
		serie.add(1);
		serie.add(1);
		
		//Recorrer el arraylist.
		for(int i = 2;i < x;i++) {
			//Hacer 2 variables, que contenga cada una el elemento 
			//1 posición antes de "i", y 2 posiciones antes de "i".
			int a = (int)serie.get(i-1);
			int b = (int)serie.get(i-2);
			//Añadir a la posición "i", la suma de a + b.
			serie.add(a + b);
		}
		
		System.out.println(serie);
		
		System.out.println("Preguntame números y te diré si están en la colección o no. Para terminar introduce 0.");
		
		//Crear bucle para pedir números.
		while(true) {
			System.out.println("Dime un número: ");
			int numero = teclado.nextInt();
			//Si se introduce "0", se sale del bucle.
			if(numero == 0) {
				break;
			}
			//Si numero está en la serie, imprimir que está.
			if(serie.contains(numero)) {
				System.out.println("El número " + numero + " SI está en la serie.");
			//Si número NO está en la serie, imprimir que no está.
			}else{
				System.out.println("El número " + numero + " NO está en la serie.");
			}
		}

	}

}
