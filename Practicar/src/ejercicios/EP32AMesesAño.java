package ejercicios;

import java.util.*;

public class EP32AMesesA�o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crea un programa que almacene los meses del a�o (los nombres de cada mes). 
		//Se pedir� al usuario el n�mero de mes y se visualizar� su nombre.
		
		Scanner teclado = new Scanner(System.in);
		
		String [] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", 
				"septiembre", "octubre", "noviembre", "diciembre"};
		int mes;
		
		System.out.println("Indique el n�mero del mes: ");
		mes = teclado.nextInt();
		
		System.out.println(meses[mes-1]);

	}

}
