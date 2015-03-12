package ejercicios.bloque2.clases;

public class Numero {
	
	private static int numero;
	
	public Numero() {
		numero = 0;
	}
	
	public Numero(int numero) {
		this.numero = numero;
	}
	
	public static int suma (int valor) {
		
		numero = numero+valor;
		
		return numero;
	}
	
	public static int resta (int valor) {
		
		numero = numero-valor;
		
		return numero;
	}

	public int getValor() {
		
		return numero;
	}
	
	public int getDoble() {
		
		return numero*2;
	}
	
	public int getTriple() {
		
		return numero*3;
	}
	
	public void setNumero(int nuevoValor) {
		
		numero = nuevoValor;
	}
}
