package ejercicios.bloque1.ejercicio5;

/*Crea la clase Oculto que contiene un número oculto. 
 Cuando se crea un objeto de esta clase, se crea internamente un número aleatorio entre 1 y 100, 
 o entre los números que se le pasan por parámetros (mínimo y máximo). 
 Esta clase entrá el método: pruebaNumero(int n), que devolverá 0 si el número es el oculto, 
 -1 si el número oculto es menor y +1 si el número oculto es mayor. 
 Utiliza esta clase para crear la aplicación Adivina el número.*/

public class Oculto {

	private int numeroOculto;
	
	Oculto() {numeroOculto=(int)(Math.random() * 100 + 1);}

	public int pruebaNumero(int n) {
		
		int resultado = 1;
		
		if(n == numeroOculto) {
			resultado = 0;
		}else if(n > numeroOculto) {
			resultado = -1;
		}else if(n < numeroOculto) {
			resultado = 1;
		}
		return resultado;
	}
	
}
