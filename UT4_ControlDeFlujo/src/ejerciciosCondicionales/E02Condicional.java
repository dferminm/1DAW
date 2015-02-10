package ejerciciosCondicionales;

import javax.swing.JOptionPane;

public class E02Condicional {

	public static void main(String[] args) {
		//Programa con palabra oculta
		//Si acierta, mensaje de éxito, si no, mensaje de error
		
		String palabra;
		
		palabra = JOptionPane.showInputDialog("Introduzca la contraseña: ");
		
		if (palabra.equals("programacion")) {
			JOptionPane.showMessageDialog(null, "Contraseña correcta, felicidades!");
		} else {
			JOptionPane.showMessageDialog(null, "Contraseña incorrecta, inténtelo más tarde.");
		}
			
		

	}

}
