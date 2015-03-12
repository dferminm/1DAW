package ejercicios.bloque1.ejercicio3;

// A�ade a la clase Temperatura los m�todos est�ticos celsiusToFarenheit farenheitToCelsius, 
// de forma que puedan usarse sin necesidad de crar ning�n objeto.

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
