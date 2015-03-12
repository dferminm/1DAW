package ejemplos;

public class Altura {
	private double altura;
	
	//crear constructor. Se llaman como la clase.
	public Altura() {
		this.altura = -1;
	}
	
	public Altura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
