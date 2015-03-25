package ejercicios.bloque3.clases;

public class FechaYHora {
	
	private Hora nuevaHora = new Hora();
	private FechaMejorado nuevaFecha = new FechaMejorado(1, 1, 2001);
	
	public FechaYHora(int hora, int minutos, int segundos, int dia, int mes, int anio) {
		nuevaHora.setHora(hora);
		nuevaHora.setMinutos(minutos);
		nuevaHora.setSegundos(segundos);
		nuevaFecha.setDia(dia);
		nuevaFecha.setMes(mes);
		nuevaFecha.setAnio(anio);
	}
	
	public void siguienteHora() {
		nuevaHora.incrementarHora(1);
		if(nuevaHora.hora == 0) {
			nuevaFecha.siguienteDia(nuevaFecha);
		}
	}

	@Override
	public String toString() {
		return  nuevaHora + "\nFecha:"+ nuevaFecha + "\n";
	}

}