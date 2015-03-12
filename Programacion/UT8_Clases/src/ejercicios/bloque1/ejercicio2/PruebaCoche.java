package ejercicios.bloque1.ejercicio2;

public class PruebaCoche {

	public static void main(String[] args) {
		/*	Dada la clase Coche:

		class Coche {
  		private int velocidad;
  		Coche() {velocidad=0;}
		}
		
		Añadirle los siguientes métodos: 
		1. int getVelocidad - Obtiene la velocidad actual. 
		2. void acelera(int mas) - Aumenta la velocidad en 'más' kilómetros hora.*/
		
		Coche coche = new Coche();
		
		System.out.println(coche.getVelocidad());
		
		coche.acelera(50);
		
		System.out.println(coche.getVelocidad());
		
		coche.acelera(50);
		
		System.out.println(coche.getVelocidad());

	}

}
