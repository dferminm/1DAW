package ejerciciosIfElse;

import javax.swing.JOptionPane;

public class E02Condicional {

	public static void main(String[] args) {
		//Programa que pida un número y que lo visualice, siempre que el número sea par.
		
		String cadena;
		int numero;
		
		cadena = JOptionPane.showInputDialog("Dime un número: ");
		numero = Integer.parseInt(cadena);
		
		if (numero%2==0) {
			JOptionPane.showMessageDialog(null, "El número introducido es " + numero);
		}else{
			JOptionPane.showMessageDialog(null, "No se puede visualizar el número porque no es PAR.");
		}
		

	}

}
