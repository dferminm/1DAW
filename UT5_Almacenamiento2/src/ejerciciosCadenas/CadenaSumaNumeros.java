package ejerciciosCadenas;

import java.util.*;

public class CadenaSumaNumeros {

	public static void main(String[] args) {
		// Escribe un programa que encuentre los n�meros es una cadena y los
		// sume.
		// Por ejemplo, si le damos la cadena
		// "en programaci�n 2 m�s 2 no son siempre 4, 24 de Abril de 2014."
		// dever� devolver 2046.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce una cadena y el programa sumar� los n�meros:");
		String cadena = teclado.nextLine();

		String[] numeros = new String[100]; // array de 100 cadenas por defecto
		Arrays.fill(numeros, "0");
		int indiceNumero = 0;

		// analizar la cadena. Si encuentra una cifra, la va almacenando en el
		// valor n del array.
		// Si el car�cter no es cifra, incrementar el �ndice para que el
		// siguiente n�mero lo empiece a
		// guardar en el siguiente valor del array.

		for (int i = 0; i < cadena.length(); i++) {
			if (Character.isDigit(cadena.charAt(i))) {
				numeros[indiceNumero] = numeros[indiceNumero].concat(String
						.valueOf(cadena.charAt(i)));
				// concatena un string y un char pasado a string

			} else {
				indiceNumero++;
			}
		}

		// sumar los n�meros del array, convirtiendo las cadenas en n�meros
		int suma = 0;
		for (int i = 0; i < 100; i++) {
			suma += Integer.parseInt(numeros[i]);
		}
		System.out.println(suma);
	}

}
