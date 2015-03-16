package ejercicios.bloque3.clases;

public class Hora {

	private int hora;
	private int minutos;
	private int segundos;
	
	public Hora() {
		this.hora = 0;
		this.minutos = 0;
		this.segundos = 0;
	}
	
	public Hora(int hora, int minutos, int segundos) {
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", minutos=" + minutos + ", segundos="
				+ segundos + "]";
	}
	
	public String getHora() {
		return this.hora + ":" + this.minutos + ":" + this.segundos;
	}
	
	public String suma (Hora nuevaHora) {
		this.hora = nuevaHora.hora + this.hora;
		this.minutos = nuevaHora.minutos + this.minutos;
		this.segundos = nuevaHora.segundos + this.segundos;
		return this.hora + ":" + this.minutos + ":" + this.segundos;
	}

}
