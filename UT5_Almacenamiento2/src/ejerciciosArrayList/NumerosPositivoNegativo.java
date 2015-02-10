package ejerciciosArrayList;

import java.util.*;

public class NumerosPositivoNegativo {

	public static void main(String[] args) {
		//Crea una colecci�n, de tipo ArrayList que cargue 10 n�meros por teclado. 
		//Despu�s recorrer� la colecci�n y devolver� la cantidad de n�meros positivos, cero y negativos.
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		System.out.println("Introduce 10 n�meros (positivos, negativos y ceros):");
		
		//Pedir en un bucle, los 10 n�meros por teclado y rellenar el array.
		
		for(int i = 0;i < 10;i++) {
			int n = teclado.nextInt();
			numeros.add(n);
		}
		
		int positivos = 0;
		int negativos = 0;
		int ceros = 0;
		
		//Recorrer array y comprobar los n�meros positivos, cero y negativos que tiene.
		for(int i = 0;i < numeros.size();i++) {
			if((int)numeros.get(i) > 0) {
			//hay que poner (int) entre parentesis para que convierta el objeto de la posicion
			//del ArrayList a tipo entero, y as� poder compararlo con el dato de tipo int.
				positivos++;
			}
			if((int)numeros.get(i) < 0) {
				negativos++;
			}
			if((int)numeros.get(i) == 0) {
				ceros++;
			}
		}
		
		System.out.println("Los n�meros introducidos son: " + numeros);
		System.out.println("N�meros positivos: " + positivos);
		System.out.println("N�meros negativos: " + negativos);
		System.out.println("Ceros: " + ceros);

	}
}