package ejercicios.bloque2.clases;

public class Coche {
	
	//Creaci�n de variables.
	private String marca;
	private String modelo;
	
	//Getters y Setters.
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//Constructor con m�todo est�tico
	
	public static String marca (String marca) {
		
		return marca;
	}
	
	public static String modelo (String modelo) {
		
		return modelo;
	}

}
