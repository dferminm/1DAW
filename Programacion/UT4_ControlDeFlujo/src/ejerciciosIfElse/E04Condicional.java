package ejerciciosIfElse;

import javax.swing.JOptionPane;

public class E04Condicional {

	public static void main(String[] args) {
		//Programa que visualice el más pequeño de tres números.
		
		String cadena;
		int numero1,numero2,numero3;
		
		cadena = JOptionPane.showInputDialog("Dime el primer número: ");
		numero1 = Integer.parseInt(cadena);
		
		cadena = JOptionPane.showInputDialog("Dime el segundo número: ");
		numero2 = Integer.parseInt(cadena);
		
		cadena = JOptionPane.showInputDialog("Dime el tercer número: ");
		numero3 = Integer.parseInt(cadena);
		
		if (numero1<numero2 && numero1<numero3) {
			JOptionPane.showMessageDialog(null, "El menor número introducido es " + numero1);
		}
		if (numero2<numero1 && numero2<numero3) {
			JOptionPane.showMessageDialog(null, "El menor número introducido es " + numero2);
		}
		if (numero3<numero1 && numero3<numero2) {
			JOptionPane.showMessageDialog(null, "El menor número introducido es " + numero3);
		}

	}

}
