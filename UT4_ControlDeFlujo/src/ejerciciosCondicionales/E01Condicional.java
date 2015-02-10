package ejerciciosCondicionales;

import javax.swing.JOptionPane;

public class E01Condicional {

	public static void main(String[] args) {
		//Programa con número oculto, se pregunta el número al sujeto.
		//Si acierta mensaje de éxito, si no, muestra el error.
		
		String cadenaOculto;
		int oculto;
		
		oculto = 8;
		
		JOptionPane.showMessageDialog(null, "Adivina un número del 1 al 10");
		cadenaOculto = JOptionPane.showInputDialog("Dime un número: ");
		oculto = Integer.parseInt(cadenaOculto);
		
		if (oculto==8) {
			JOptionPane.showMessageDialog(null, "¡Felicidades, has acertado!");
		} else {
			JOptionPane.showMessageDialog(null, "Lo siento, el número introducido no es el correcto..");
		}

	}

}
