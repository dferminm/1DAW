package ejerciciosCondicionales;

import javax.swing.JOptionPane;

public class E02Condicional {

	public static void main(String[] args) {
		//Programa con palabra oculta
		//Si acierta, mensaje de �xito, si no, mensaje de error
		
		String palabra;
		
		palabra = JOptionPane.showInputDialog("Introduzca la contrase�a: ");
		
		if (palabra.equals("programacion")) {
			JOptionPane.showMessageDialog(null, "Contrase�a correcta, felicidades!");
		} else {
			JOptionPane.showMessageDialog(null, "Contrase�a incorrecta, int�ntelo m�s tarde.");
		}
			
		

	}

}
