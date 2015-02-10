package ejercicios;

import java.util.*;

public class A�osEntreFechas {
	
//Crear un m�todo que calcule los a�os que hay entre dos fechas, 
//calcule la edad de una persona pidiendole la fecha actual y la de su nacimiento. 
//El m�todo tendr� la forma: public static int a�osEntre(int dia, int mes, int a�o, int dia_final, int mes_final, int a�o_final)	
	
	public static int a�osEntre(int dia, int mes, int a�o, int diaFinal, int mesFinal, int a�oFinal) {
		int a�os;
		
		a�os = a�oFinal - a�o;
		
		if(mesFinal < mes) {
			a�os--;
		}else if(mesFinal == mes) {
			if(diaFinal < dia) {
				a�os--;
			}
		}
		
		return a�os;
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int dia1,dia2,mes1,mes2,a�o1,a�o2;
		
		System.out.println("Escribe los d�as-mes-a�o de tu nacimiento: ");
		dia1=teclado.nextInt();
		mes1=teclado.nextInt();
		a�o1=teclado.nextInt();
		
		System.out.println("Escribe los dias-mes-a�o de hoy");
		dia2=teclado.nextInt();
		mes2=teclado.nextInt();
		a�o2=teclado.nextInt();
		
		System.out.println("Tienes : " + a�osEntre(dia1, mes1, a�o1, dia2, mes2, a�o2) + " a�os.");
		
	}
}
