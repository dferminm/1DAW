package ejercicios.bloque1.ejercicio2;

public class Coche {
	private int velocidad;
	
	Coche() {velocidad=0;}

	public int getVelocidad() {
		return velocidad;
	}

	public void acelera(int mas) {
		this.velocidad = velocidad + mas;
	}
	
}
