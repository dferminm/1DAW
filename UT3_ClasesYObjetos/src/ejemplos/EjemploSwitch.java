package ejemplos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EjemploSwitch {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String cadena;
		int numero;
		cadena = "hola";
		numero = teclado.nextInt();
		
		switch (numero) {
			case 1 : System.out.println("El numero es 1");
			break;
			case 2 : System.out.println("El numero es 2");
			break;
			case 10 : System.out.println("El numero es 10");
			break;
		}
		switch (cadena) {
			case "Hola":
			//saludo
			break;
			case "adios":
			//despedida
			break;
		default:	//ni uno ni otro
	}
	}
}
