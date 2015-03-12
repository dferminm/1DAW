package ejerciciosArrayList;

import java.util.*;

public class CaracteresDuplicados {

	public static void main(String[] args) {
		//Crear una colecci�n de caracteres que se ir�n introduciendo por teclado, 
		//hasta que se introduzca un *. 
		//Decir si hay alg�n caracter duplicado.
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> coleccion = new ArrayList<String>();
		
		//contador para ver los caracteres duplicados
		int duplicados = 0;
		
		System.out.println("Dime letras (separadas por espacios), para terminar introduce (*): ");
		
		//Crear bucle que pida caracteres por teclado hasta *.
		for(int i = 0;i < coleccion.size()+1;i++) {
			//pedir letra
			String letra = teclado.next();
			//comprobar los caracteres duplicados.
			if(coleccion.contains(letra)){
				duplicados++;
			}
			//comprobar si hay *.
			if(letra.charAt(0) == '*') {
				break;
			}else{
				//si no hay *, a�adir letra al array.
				coleccion.add(letra);
			}
		}

	System.out.println(coleccion);
	System.out.println("La colecci�n contiene " + duplicados + " caracteres duplicados");
	}
}
