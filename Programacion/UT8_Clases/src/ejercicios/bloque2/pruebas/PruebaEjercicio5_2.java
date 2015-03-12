package ejercicios.bloque2.pruebas;

import ejercicios.bloque2.clases.Numero;

public class PruebaEjercicio5_2 {

	public static void main(String[] args) {
		// Realiza una clase Número que almacene un número entero y tenga las siguientes características:
		// Constructor por defecto que inicializa a 0 el número interno.
		// Constructor que inicializa el número interno.
		// Método añade que permite sumarle un número al valor interno.
		// Método resta que resta un número al valor interno.
		// Método getValor. Devuelve el valor interno.
		// Método getDoble. Devuelve el doble del valor interno.
		// Método getTriple. Devuelve el triple del valor interno.
		// Método setNumero. Inicializa de nuevo el valor interno.
		
		Numero n = new Numero();
		
		System.out.println(n.getValor());
		
		n.setNumero(5);
		
		System.out.println(n.getValor());
		
		System.out.println(n.getDoble());
		
		System.out.println(n.getTriple());
		
		n.resta(1);
		
		System.out.println(n.getValor());
		
		n.suma(1);
		
		System.out.println(n.getValor());

	}

}
