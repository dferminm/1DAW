package ejerciciosIfElse;

import javax.swing.JOptionPane;

public class E04Condicional {

	public static void main(String[] args) {
		//Programa que visualice el m�s peque�o de tres n�meros.
		
		String cadena;
		int numero1,numero2,numero3;
		
		cadena = JOptionPane.showInputDialog("Dime el primer n�mero: ");
		numero1 = Integer.parseInt(cadena);
		
		cadena = JOptionPane.showInputDialog("Dime el segundo n�mero: ");
		numero2 = Integer.parseInt(cadena);
		
		cadena = JOptionPane.showInputDialog("Dime el tercer n�mero: ");
		numero3 = Integer.parseInt(cadena);
		
		if (numero1<numero2 && numero1<numero3) {
			JOptionPane.showMessageDialog(null, "El menor n�mero introducido es " + numero1);
		}
		if (numero2<numero1 && numero2<numero3) {
			JOptionPane.showMessageDialog(null, "El menor n�mero introducido es " + numero2);
		}
		if (numero3<numero1 && numero3<numero2) {
			JOptionPane.showMessageDialog(null, "El menor n�mero introducido es " + numero3);
		}

	}

}
