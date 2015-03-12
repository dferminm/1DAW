package ejercicios.bloque3.pruebas;

import ejercicios.bloque3.clases.Hora;

public class PruebaHora {

	public static void main(String[] args) {
		/* Escribe una clase llamada Hora que tenga como atributos la hora, los minutos y los segundos (números enteros). 
	 	Un constructor inicializará estos datos a 0 y otro los inicializará a valores pasados por parámetro. 
	 	Un método de la clase devolverá la cadena con formato: 12:45:32. 
	 	Otro método, que tendrá un argumento de tipo Hora, sumará dicha hora a la propia. Por ejemplo:

		[...]
		mihora=new Hora(12,45,32);
		unahoraycuarto=new Hora(1,15,0);
		mihora.suma(unahoraycuarto);
		System.out.println(mihora.aCadena());
		[...]
			
		14:00:32
		Para probar la clase crea un main() con dos objetos inicializados a una hora determinada. 
	 	Crea otro sin inicializar y súmale las dos anteriores. Visualiza el valor de las dos horas y el resultante.*/
		
		Hora miHora = new Hora(12, 45, 32);
		
		Hora unaHoraYCuarto = new Hora(1, 15, 0);
		
		System.out.println(miHora.suma(unaHoraYCuarto));
		
		System.out.println(miHora.toString()); //14:00:32
	}

}
