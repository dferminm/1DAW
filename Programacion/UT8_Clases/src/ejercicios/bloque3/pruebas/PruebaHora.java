package ejercicios.bloque3.pruebas;

import ejercicios.bloque3.clases.Hora;

public class PruebaHora {

	public static void main(String[] args) {
		/* Escribe una clase llamada Hora que tenga como atributos la hora, los minutos y los segundos (n�meros enteros). 
	 	Un constructor inicializar� estos datos a 0 y otro los inicializar� a valores pasados por par�metro. 
	 	Un m�todo de la clase devolver� la cadena con formato: 12:45:32. 
	 	Otro m�todo, que tendr� un argumento de tipo Hora, sumar� dicha hora a la propia. Por ejemplo:

		[...]
		mihora=new Hora(12,45,32);
		unahoraycuarto=new Hora(1,15,0);
		mihora.suma(unahoraycuarto);
		System.out.println(mihora.aCadena());
		[...]
			
		14:00:32
		Para probar la clase crea un main() con dos objetos inicializados a una hora determinada. 
	 	Crea otro sin inicializar y s�male las dos anteriores. Visualiza el valor de las dos horas y el resultante.*/
		
		Hora miHora = new Hora(12, 45, 32);
		
		Hora unaHoraYCuarto = new Hora(1, 15, 0);
		
		System.out.println(miHora.suma(unaHoraYCuarto));
		
		System.out.println(miHora.toString()); //14:00:32
	}

}
