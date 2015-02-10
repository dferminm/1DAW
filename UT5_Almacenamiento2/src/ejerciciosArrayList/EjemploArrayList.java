package ejerciciosArrayList;

import java.util.ArrayList;

public class EjemploArrayList {

	public static void main(String[] args) {
		
		//Clase arraylist con funciones para arrays
		ArrayList numeros = new ArrayList();
		
		//añadir elementos al array
		numeros.add(20);
		numeros.add(30);
		numeros.add(45);
		
		System.out.println(numeros);
		
		
		//ver si en alguna posicion del array contiene un dato específico
		if(numeros.contains(20)) {
			System.out.println("Ya contiene el 20");
		}
		
		
		//para que recorra un array y vaya imprimiendo cada valor
		for(int i = 0;i < numeros.size();i++) {
			System.out.println(numeros.get(i));
		}
		
		//para que te quite el elemento de la posición que quieras del array
		numeros.remove(2);
		//para que introduzca en la posición especificada, el elemento especificado
		numeros.set(2, 40);
		
	}

}
