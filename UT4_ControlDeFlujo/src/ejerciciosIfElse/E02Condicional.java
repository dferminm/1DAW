package ejerciciosIfElse;

import javax.swing.JOptionPane;

public class E02Condicional {

	public static void main(String[] args) {
		//Programa que pida un n�mero y que lo visualice, siempre que el n�mero sea par.
		
		String cadena;
		int numero;
		
		cadena = JOptionPane.showInputDialog("Dime un n�mero: ");
		numero = Integer.parseInt(cadena);
		
		if (numero%2==0) {
			JOptionPane.showMessageDialog(null, "El n�mero introducido es " + numero);
		}else{
			JOptionPane.showMessageDialog(null, "No se puede visualizar el n�mero porque no es PAR.");
		}
		

	}

}
