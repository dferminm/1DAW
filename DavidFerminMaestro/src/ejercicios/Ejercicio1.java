package ejercicios;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		
		//declaro variables e inicializo
		int a�oR = 0;
		int mesR = 0;
		int diaR = 0;
		int a�o = 1969;
		int mes = 11;
		int dia = 21;
		boolean entra = true;
		
		//bucle do-while para que haga y repita si los datos no son correctos
		do {
			
		System.out.println("---Introduce la fecha de una efem�ride---");
		System.out.println("Dime el a�o: ");
		a�oR = teclado.nextInt();
		System.out.println("Dime el mes: ");
		mesR = teclado.nextInt();
		System.out.println("Dime el dia: ");
		diaR = teclado.nextInt();
		
		//condici�n de restricciones
		if(a�oR < 0){
			System.out.println("Datos inv�lidos, int�ntelo de nuevo");
			entra = false;
		}else{
			break;
		}
		if(mesR < 1 && mesR > 12){
			System.out.println("Datos inv�lidos, int�ntelo de nuevo");
			entra = false;
		}else{
			break;
		}
		if(diaR < 1 && diaR > 31){
			System.out.println("Datos inv�lidos, int�ntelo de nuevo");
			entra = false;
		}else{
			break;
		}
		}while(entra == false);
		
		if(a�o == a�oR && mes == mesR && dia == diaR){
			System.out.println("D�a de la primera conexi�n entre universidades");
		}else if(a�o < a�oR && mes < mesR && dia < diaR){
			System.out.println("Era post-Internet");
		}else if(a�o > a�oR && mes < mesR && dia < diaR){
			System.out.println("Era pre-Internet");
		}else if(a�o > a�oR && mes > mesR && dia < diaR){
			System.out.println("Era pre-Internet");
		}else if(a�o > a�oR && mes > mesR && dia > diaR){
			System.out.println("Era pre-Internet");
		}else if(a�o > a�oR && mes < mesR && dia > diaR){
			System.out.println("Era pre-Internet");
		}else if(a�o < a�oR && mes > mesR && dia < diaR){
			System.out.println("Era post-Internet");
		}else if(a�o < a�oR && mes < mesR && dia > diaR){
			System.out.println("Era post-Internet");
		}else if(a�o > a�oR && mes < mesR && dia < diaR){
			System.out.println("Era post-Internet");
		}else if(a�o == a�oR && mes > mesR && dia > diaR){
			System.out.println("Era pre-Internet");
		}else if(a�o == a�oR && mes == mesR && dia > diaR){
			System.out.println("Era pre-Internet");
		}else if(a�o > a�oR && mes == mesR && dia == diaR){
			System.out.println("Era pre-Internet");
		}else if(a�o > a�oR && mes == mesR && dia > diaR){
			System.out.println("Era pre-Internet");
		}else if(a�o == a�oR && mes < mesR && dia < diaR){
			System.out.println("Era post-Internet");
		}else if(a�o == a�oR && mes == mesR && dia < diaR){
			System.out.println("Era post-Internet");
		}else if(a�o < a�oR && mes == mesR && dia == diaR){
			System.out.println("Era post-Internet");
		}else if(a�o < a�oR && mes == mesR && dia < diaR){
			System.out.println("Era post-Internet");
		}
	}

}
