package ejercicios.bloque3.pruebas;

import ejercicios.bloque3.clases.FechaYHora;

public class PruebaFechaYHora {

	public static void main(String[] args) {
		/* Crea la clase FechaYHora. 
		 * La clase utiliza la clase Hora definida en el ejercicio 1, 
		 * y la clase Fecha del ejercicio anterior, 
		 * ya que queremos que almacene tanto la fecha como la hora. 
		 * Crea un nuevo método siguienteHora que incrementa la hora pero que también 
		 * llame al método siguienteDía si es necesario porque se avanza un día. 
		 * Crea el método aCadena (toString()) que muestre la fecha y la hora de forma conjunta. 
		 * Escribe un programa que pruebe la nueva clase, 
		 * especialmente el incremento de de hora que cambia el día.*/
		
		FechaYHora fh = new FechaYHora(23, 0, 0, 31, 12, 2015);
		
		System.out.println(fh);
		
		fh.siguienteHora();
		
		System.out.println(fh);

	}

}
