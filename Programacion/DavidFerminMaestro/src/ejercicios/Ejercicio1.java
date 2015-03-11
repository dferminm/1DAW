package ejercicios;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		
		//declaro variables e inicializo
		int añoR = 0;
		int mesR = 0;
		int diaR = 0;
		int año = 1969;
		int mes = 11;
		int dia = 21;
		boolean entra = true;
		
		//bucle do-while para que haga y repita si los datos no son correctos
		do {
			
		System.out.println("---Introduce la fecha de una efeméride---");
		System.out.println("Dime el año: ");
		añoR = teclado.nextInt();
		System.out.println("Dime el mes: ");
		mesR = teclado.nextInt();
		System.out.println("Dime el dia: ");
		diaR = teclado.nextInt();
		
		//condición de restricciones
		if(añoR < 0){
			System.out.println("Datos inválidos, inténtelo de nuevo");
			entra = false;
		}else{
			break;
		}
		if(mesR < 1 && mesR > 12){
			System.out.println("Datos inválidos, inténtelo de nuevo");
			entra = false;
		}else{
			break;
		}
		if(diaR < 1 && diaR > 31){
			System.out.println("Datos inválidos, inténtelo de nuevo");
			entra = false;
		}else{
			break;
		}
		}while(entra == false);
		
		if(año == añoR && mes == mesR && dia == diaR){
			System.out.println("Día de la primera conexión entre universidades");
		}else if(año < añoR && mes < mesR && dia < diaR){
			System.out.println("Era post-Internet");
		}else if(año > añoR && mes < mesR && dia < diaR){
			System.out.println("Era pre-Internet");
		}else if(año > añoR && mes > mesR && dia < diaR){
			System.out.println("Era pre-Internet");
		}else if(año > añoR && mes > mesR && dia > diaR){
			System.out.println("Era pre-Internet");
		}else if(año > añoR && mes < mesR && dia > diaR){
			System.out.println("Era pre-Internet");
		}else if(año < añoR && mes > mesR && dia < diaR){
			System.out.println("Era post-Internet");
		}else if(año < añoR && mes < mesR && dia > diaR){
			System.out.println("Era post-Internet");
		}else if(año > añoR && mes < mesR && dia < diaR){
			System.out.println("Era post-Internet");
		}else if(año == añoR && mes > mesR && dia > diaR){
			System.out.println("Era pre-Internet");
		}else if(año == añoR && mes == mesR && dia > diaR){
			System.out.println("Era pre-Internet");
		}else if(año > añoR && mes == mesR && dia == diaR){
			System.out.println("Era pre-Internet");
		}else if(año > añoR && mes == mesR && dia > diaR){
			System.out.println("Era pre-Internet");
		}else if(año == añoR && mes < mesR && dia < diaR){
			System.out.println("Era post-Internet");
		}else if(año == añoR && mes == mesR && dia < diaR){
			System.out.println("Era post-Internet");
		}else if(año < añoR && mes == mesR && dia == diaR){
			System.out.println("Era post-Internet");
		}else if(año < añoR && mes == mesR && dia < diaR){
			System.out.println("Era post-Internet");
		}
	}

}
