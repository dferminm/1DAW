package ejercicios.bloque3.pruebas;

import ejercicios.bloque3.clases.FechaMejorado;

public class PruebaFechaMejorado {

	public static void main(String[] args) {
		/*A�ade la comprobaci�n de errores en los valores de inicializaci�n de a�o. 
		A�ade un m�todo llamado siguienteD�a para incrementar el d�a en uno. 
		El objeto fecha siempre tendr� un valor con sentido. 
		Escribe un programa para probar el funcionamiento del m�todo, 
		para lo que imprimir� la secuencia de varios d�as en los que cambie el mes y el a�o.*/
		
		FechaMejorado fecha = new FechaMejorado(12, 31, 2015);
		
		System.out.println(fecha);
		
		fecha.siguienteDia(fecha);
		
		System.out.println(fecha);

	}

}
