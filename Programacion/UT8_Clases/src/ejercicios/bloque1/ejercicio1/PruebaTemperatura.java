package ejercicios.bloque1.ejercicio1;

public class PruebaTemperatura {

	public static void main(String[] args) {
		// Crear clase Temperatura, que alamacena una temperatura 
		// (atributo float que almacena la temperatura en grados celsius).
		// La clase no tiene constructores, s�lo m�todos: 
		// 1. getCelsius()/setCelsius(float grados). 
		// 2. getFahrenheit()/setFahrnheit(float grados).

		Temperatura temp = new Temperatura();
		
		temp.setCelsius(20.5f);
		
		System.out.println("Hoy hace " + temp.getCelsius() + " �C");
		System.out.println("Hoy hace " + temp.getFahrenheit() + " �F");
	}

}
