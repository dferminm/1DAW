package ejercicios;

import java.util.*;

public class AñosEntreFechas {
	
//Crear un método que calcule los años que hay entre dos fechas, 
//calcule la edad de una persona pidiendole la fecha actual y la de su nacimiento. 
//El método tendrá la forma: public static int añosEntre(int dia, int mes, int año, int dia_final, int mes_final, int año_final)	
	
	public static int añosEntre(int dia, int mes, int año, int diaFinal, int mesFinal, int añoFinal) {
		int años;
		
		años = añoFinal - año;
		
		if(mesFinal < mes) {
			años--;
		}else if(mesFinal == mes) {
			if(diaFinal < dia) {
				años--;
			}
		}
		
		return años;
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int dia1,dia2,mes1,mes2,año1,año2;
		
		System.out.println("Escribe los días-mes-año de tu nacimiento: ");
		dia1=teclado.nextInt();
		mes1=teclado.nextInt();
		año1=teclado.nextInt();
		
		System.out.println("Escribe los dias-mes-año de hoy");
		dia2=teclado.nextInt();
		mes2=teclado.nextInt();
		año2=teclado.nextInt();
		
		System.out.println("Tienes : " + añosEntre(dia1, mes1, año1, dia2, mes2, año2) + " años.");
		
	}
}
