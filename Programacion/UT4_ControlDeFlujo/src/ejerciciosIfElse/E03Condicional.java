package ejerciciosIfElse;

import javax.swing.JOptionPane;

public class E03Condicional {

	public static void main(String[] args) {
		/*Programa que pida dos n�meros y que visualice el n�mero que sea mayor de los dos.
		Si son iguales visualizar� cualquiera de ellos.*/
		
		String cadena;
		int numero1,numero2;
		
		cadena = JOptionPane.showInputDialog("Dime el primer n�mero: ");
		numero1 = Integer.parseInt(cadena);
		
		cadena = JOptionPane.showInputDialog("Dime el segundo n�mero: ");
		numero2 = Integer.parseInt(cadena);
		
		if (numero1>numero2) {
			JOptionPane.showMessageDialog(null, "El n�mero " + numero1 + " es el mayor de los dos.");
		}else{
			JOptionPane.showMessageDialog(null, "El n�mero " + numero2 + " es el mayor de los dos.");
		}

	}

}
