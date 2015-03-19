package ejercicios.bloque3.pruebas;

import ejercicios.bloque3.clases.FechaMejorado;

public class PruebaFechaMejorado {

	public static void main(String[] args) {
		/*Añade la comprobación de errores en los valores de inicialización de año. 
		Añade un método llamado siguienteDía para incrementar el día en uno. 
		El objeto fecha siempre tendrá un valor con sentido. 
		Escribe un programa para probar el funcionamiento del método, 
		para lo que imprimirá la secuencia de varios días en los que cambie el mes y el año.*/
		
		FechaMejorado fecha = new FechaMejorado(12, 31, 2015);
		
		System.out.println(fecha);
		
		fecha.siguienteDia(fecha);
		
		System.out.println(fecha);

	}

}
