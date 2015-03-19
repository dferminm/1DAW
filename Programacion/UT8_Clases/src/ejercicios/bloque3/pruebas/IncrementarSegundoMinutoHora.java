package ejercicios.bloque3.pruebas;

import ejercicios.bloque3.clases.Hora;

public class IncrementarSegundoMinutoHora {

	public static void main(String[] args) {
		/*Añade los métodos tick, incrementarMinuto e incrementarHora que incrementan la hora en 1 segundo,
		 1 minuto y 1 hora respectivamente. 
		 Crea un programa que prueba el funcionamiento de estos métodos. 
		 Has de asegurarte de que funcionan bien los siguientes casos:
		 a. incremento al siguiente minuto, b. incremento a la siguiente hora, c. incremento al siguiente día.*/
		
		Hora horaSegundos = new Hora(12,0,0);
		
		System.out.println(horaSegundos);
		
		horaSegundos.tick(60);
		
		System.out.println(horaSegundos);
		
		Hora horaMinutos = new Hora(12,0,0);
		
		horaMinutos.incrementarMinuto(60);
		
		System.out.println(horaMinutos);
		
		Hora horaHoras = new Hora(12,0,0);
		
		horaHoras.incrementarHora(24);
		
		System.out.println(horaHoras);

	}

}
