package ejercicios.bloque3.pruebas;

import ejercicios.bloque3.clases.Complejo;

public class PruebaComplejo {

	public static void main(String[] args) {
		
		Complejo uno, dos;
		
		uno = new Complejo();
		
		dos = new Complejo();
		
		uno.suma(dos);
		
		System.out.println("Suma:");
		System.out.println(uno);

		//pueba multiplicar
		
		uno.setReal(2);
		uno.setImaginaria(-3);
		
		Complejo tres = new Complejo(1,1);
		
		uno.multiplica(tres);
		
		//(5, -1)
		System.out.println("Multiplicación:");
		System.out.println(uno);
		
	}

}
