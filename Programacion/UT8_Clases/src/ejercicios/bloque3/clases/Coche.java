package ejercicios.bloque3.clases;

public class Coche {

	private String modelo, matricula, marca, color;
	
	public Coche(String modelo, String matricula, String marca, String color) {
		this.modelo = modelo;
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", matricula=" + matricula
				+ ", marca=" + marca + ", color=" + color + "]";
	}
	
	
}
