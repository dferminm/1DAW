package ejerciciosArrayList;

import java.util.*;

public class NumerosPositivoNegativo {

	public static void main(String[] args) {
		//Crea una colección, de tipo ArrayList que cargue 10 números por teclado. 
		//Después recorrerá la colección y devolverá la cantidad de números positivos, cero y negativos.
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		System.out.println("Introduce 10 números (positivos, negativos y ceros):");
		
		//Pedir en un bucle, los 10 números por teclado y rellenar el array.
		
		for(int i = 0;i < 10;i++) {
			int n = teclado.nextInt();
			numeros.add(n);
		}
		
		int positivos = 0;
		int negativos = 0;
		int ceros = 0;
		
		//Recorrer array y comprobar los números positivos, cero y negativos que tiene.
		for(int i = 0;i < numeros.size();i++) {
			if((int)numeros.get(i) > 0) {
			//hay que poner (int) entre parentesis para que convierta el objeto de la posicion
			//del ArrayList a tipo entero, y así poder compararlo con el dato de tipo int.
				positivos++;
			}
			if((int)numeros.get(i) < 0) {
				negativos++;
			}
			if((int)numeros.get(i) == 0) {
				ceros++;
			}
		}
		
		System.out.println("Los números introducidos son: " + numeros);
		System.out.println("Números positivos: " + positivos);
		System.out.println("Números negativos: " + negativos);
		System.out.println("Ceros: " + ceros);

	}
}