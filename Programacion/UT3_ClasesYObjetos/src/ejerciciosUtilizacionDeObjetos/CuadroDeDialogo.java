package ejerciciosUtilizacionDeObjetos;

import javax.swing.JOptionPane;

public class CuadroDeDialogo {

	public static void main(String[] args) {
		//Cuadro de di�logo
		JOptionPane.showMessageDialog(null, "Hola mundo!");
		
		//Declarar variable y sacarla en cuadro de di�logo
		String nombre;
		
		nombre = JOptionPane.showInputDialog("Dime tu nombre: ");
		
		JOptionPane.showMessageDialog(null, "Hola " + nombre);
		
		//Declarar variale, escribir n�mero y convertir cadena en n�mero
		String numero;
		int n;
		numero = JOptionPane.showInputDialog("Dime un n�mero: ");
		Integer.parseInt(numero);
		n = Integer.parseInt(numero);
		System.out.println("El n�mero elegido es: " + n);
		
	}

}
