package ejercicios.bloque1.ejercicio3;

// Añade a la clase Temperatura los métodos estáticos celsiusToFarenheit farenheitToCelsius, 
// de forma que puedan usarse sin necesidad de crar ningún objeto.

public class TemperaturaEstatico {

	private float temperatura;

	public static float celsiusToFarenheit (float temperatura) {
		
		return temperatura * 1.8f + 32;
	}
	
	public static float farenheitToCelsius (float temperatura) {
		
		return (temperatura - 32) / 1.8f;
	}
	
	public float getCelsius() {
		return temperatura;
	}

	public void setCelsius(float temperatura) {
		this.temperatura = temperatura;
	}
	
	public float getFahrenheit() {
		return temperatura * 1.8f + 32;
	}

	public void setFahrenheit(float temperatura) {
		this.temperatura = (temperatura - 32) / 1.8f;
	}
	
}
