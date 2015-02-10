package ejercicios;

import java.util.*;

public class EP32AMesesAño {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crea un programa que almacene los meses del año (los nombres de cada mes). 
		//Se pedirá al usuario el número de mes y se visualizará su nombre.
		
		Scanner teclado = new Scanner(System.in);
		
		String [] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", 
				"septiembre", "octubre", "noviembre", "diciembre"};
		int mes;
		
		System.out.println("Indique el número del mes: ");
		mes = teclado.nextInt();
		
		System.out.println(meses[mes-1]);

	}

}
