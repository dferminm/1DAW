package ejemplos;

public class Segundo {

	public static void main(String[] args) {
		int numeroEntero;
		long numeroLargo;
		//int declara un numero entero de 32 bits
		//long declara un numero entero de 64 bits
		float numeroReal;
		double numeroRealLargo;
		//float declara un numero real de 32 bits
		//double declara un numero real de 64 bits
		
		numeroEntero=7;
		numeroLargo=7;
		numeroReal=5.45f;
		numeroRealLargo=5.789f;
		//escribir f al final del numero indica al programa que el numero escrito es un numero real o "float"
		
		System.out.println(numeroEntero);
		System.out.println(numeroLargo);
		System.out.println(numeroReal);
		System.out.println(numeroRealLargo);
		
		char letra;
		//declara un caracter unicode
		letra='a';
		
		System.out.println(letra);
		
		boolean incognita;
		incognita=true;
		incognita=false;
		//boolean declara verdadero o falso
		incognita=4>5;
		
		System.out.println(incognita);
	}

}
