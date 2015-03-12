package ejercicios.bloque2.pruebas;

import ejercicios.bloque2.clases.Numero;

public class PruebaEjercicio5_2 {

	public static void main(String[] args) {
		// Realiza una clase N�mero que almacene un n�mero entero y tenga las siguientes caracter�sticas:
		// Constructor por defecto que inicializa a 0 el n�mero interno.
		// Constructor que inicializa el n�mero interno.
		// M�todo a�ade que permite sumarle un n�mero al valor interno.
		// M�todo resta que resta un n�mero al valor interno.
		// M�todo getValor. Devuelve el valor interno.
		// M�todo getDoble. Devuelve el doble del valor interno.
		// M�todo getTriple. Devuelve el triple del valor interno.
		// M�todo setNumero. Inicializa de nuevo el valor interno.
		
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
