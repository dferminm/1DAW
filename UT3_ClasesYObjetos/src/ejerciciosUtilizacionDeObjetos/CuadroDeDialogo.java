package ejerciciosUtilizacionDeObjetos;

import javax.swing.JOptionPane;

public class CuadroDeDialogo {

	public static void main(String[] args) {
		//Cuadro de diálogo
		JOptionPane.showMessageDialog(null, "Hola mundo!");
		
		//Declarar variable y sacarla en cuadro de diálogo
		String nombre;
		
		nombre = JOptionPane.showInputDialog("Dime tu nombre: ");
		
		JOptionPane.showMessageDialog(null, "Hola " + nombre);
		
		//Declarar variale, escribir número y convertir cadena en número
		String numero;
		int n;
		numero = JOptionPane.showInputDialog("Dime un número: ");
		Integer.parseInt(numero);
		n = Integer.parseInt(numero);
		System.out.println("El número elegido es: " + n);
		
	}

}
