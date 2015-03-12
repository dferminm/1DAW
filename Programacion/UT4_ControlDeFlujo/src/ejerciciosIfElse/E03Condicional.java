package ejerciciosIfElse;

import javax.swing.JOptionPane;

public class E03Condicional {

	public static void main(String[] args) {
		/*Programa que pida dos números y que visualice el número que sea mayor de los dos.
		Si son iguales visualizará cualquiera de ellos.*/
		
		String cadena;
		int numero1,numero2;
		
		cadena = JOptionPane.showInputDialog("Dime el primer número: ");
		numero1 = Integer.parseInt(cadena);
		
		cadena = JOptionPane.showInputDialog("Dime el segundo número: ");
		numero2 = Integer.parseInt(cadena);
		
		if (numero1>numero2) {
			JOptionPane.showMessageDialog(null, "El número " + numero1 + " es el mayor de los dos.");
		}else{
			JOptionPane.showMessageDialog(null, "El número " + numero2 + " es el mayor de los dos.");
		}

	}

}
