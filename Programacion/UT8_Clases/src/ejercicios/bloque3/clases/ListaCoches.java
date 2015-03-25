package ejercicios.bloque3.clases;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class ListaCoches {
	
	private ArrayList <Coche> coches;	//atributo coches, que será un arraylist de tipo coche.
	private Coche coche1 = new Coche("bravo", "1234", "fiat", "marron");
	private Coche coche2 = new Coche("m3", "2345", "bmw", "negro");
	private Coche coche3 = new Coche("cordoba", "3456", "seat", "blanco");
	
	public ListaCoches() {	//Constructor listaCoches, que contendrá un array de coches.
		this.coches = new ArrayList <Coche>();
		this.coches.add(coche1);
		this.coches.add(coche2);
		this.coches.add(coche3);
	}
	
	public Coche devolverCoche(int posicion) {	//Devuelve el coche que se encuentra en la posición dada.
		if(posicion > 2) {
		throw new IndexOutOfBoundsException("La posicion no existe");
		}else{
		return coches.get(posicion);
		}
	}

	@Override
	public String toString() {
		return "ListaCoches [coches=" + coches + "]";
	}

	public static void main(String[] args) {
		/* Crea la clase llamada ListaCoches que contenga como atributos un array de la clase Coche.

		La clase Coche tendrá los atributos privados modelo, matrícula, marca y color. 
		Crea los constructores que estimes necesarios, los get/set necesarios y el método toString().
		
		La clase ListaCoches contendrá el array de coches y 
		los métodos necesarios para hacer un programa principal que pueda hacer lo siguiente:
		
		Devolver el coche que se encuentra en una posición dada. Si la posición aportada no es válida devolverá null.
		Devolver la posición del coche cuya matrícula coincide con una dada. En caso de no encontrar esta devolverá -1.
		Devuelve la lista de coches que son de una marca determinada.*/
		
		ListaCoches lista = new ListaCoches();
		
		System.out.println(lista);
		
		System.out.println(lista.devolverCoche(2));
		
	}

}
