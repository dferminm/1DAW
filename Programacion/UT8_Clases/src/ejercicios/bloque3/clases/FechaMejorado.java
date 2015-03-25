package ejercicios.bloque3.clases;

public class FechaMejorado {

	private int mes; // 1-12
	private int dia; // 1-31 con base en el mes
	private int anio; // cualquier a�o

	private static final int[] diasPorMes = // d�as en cada mes
	{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// constructor: llama a comprobarMes para confirmar el valor apropiado para
	// el mes;
	// llama a comprobarDia para confirmar el valor apropiado para el d�a
	public FechaMejorado(int elMes, int elDia, int elAnio) {
		mes = comprobarMes(elMes); // valida el mes
		anio = comprobarAnio(elAnio); // pudo validar el a�o
		dia = comprobarDia(elDia); // valida el d�a

		System.out.printf("Constructor de objeto Fecha para la fecha %s\n",
				this);
	} // fin del constructor de Fecha

	// m�todo utilitario para confiirmar el valor apropiado del a�o
	private int comprobarAnio(int anioPrueba) {
		if (anioPrueba > 0 && anioPrueba <= 2015) // valida el a�o
			return anioPrueba;
		else
			// anio es inv�lido
			throw new IllegalArgumentException("el a�o debe ser mayor que 0");
	} // fin del m�todo comprobarAnio

	// m�todo utilitario para confirmar el valor apropiado del mes
	private int comprobarMes(int mesPrueba) {
		if (mesPrueba > 0 && mesPrueba <= 12) // valida el mes
			return mesPrueba;
		else
			// mes es inv�lido
			throw new IllegalArgumentException("el mes debe ser 1 a 12");
	} // fin del m�todo comprobarMes

	// m�todo utilitario para confirmar el valor apropiado del d�a, con base en
	// el mes y el a�o
	private int comprobarDia(int diaPrueba) {
		// comprueba si el d�a est� dentro del rango para el mes
		if (diaPrueba > 0 && diaPrueba <= diasPorMes[mes])
			return diaPrueba;

		// comprueba si es a�o bisiesto
		if (mes == 2 && diaPrueba == 29
				&& (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)))
			return diaPrueba;

		throw new IllegalArgumentException(
				"dia fuera de rango para el mes y anio especificados");
	} // fin del m�todo comprobarDia

	// m�todo para incrementar el d�a en uno
	public void siguienteDia(FechaMejorado fechaAnterior) {
		fechaAnterior.dia++;
			if(fechaAnterior.dia > diasPorMes[fechaAnterior.mes]) {
				fechaAnterior.dia = 1;
				fechaAnterior.mes++;
			}
			if(fechaAnterior.mes > 12) {
				fechaAnterior.mes = 1;
				fechaAnterior.anio++;
			}
	}

	
	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	// devuelve un objeto String de la forma mes/dia/anio
	public String toString() {
		return String.format("%02d/%02d/%02d", mes, dia, anio);
	} // fin del m�todo toString
} // fin de la clase Fecha