package ejerciciosCondicionales;

import javax.swing.JOptionPane;

public class E01Condicional {

	public static void main(String[] args) {
		//Programa con n�mero oculto, se pregunta el n�mero al sujeto.
		//Si acierta mensaje de �xito, si no, muestra el error.
		
		String cadenaOculto;
		int oculto;
		
		oculto = 8;
		
		JOptionPane.showMessageDialog(null, "Adivina un n�mero del 1 al 10");
		cadenaOculto = JOptionPane.showInputDialog("Dime un n�mero: ");
		oculto = Integer.parseInt(cadenaOculto);
		
		if (oculto==8) {
			JOptionPane.showMessageDialog(null, "�Felicidades, has acertado!");
		} else {
			JOptionPane.showMessageDialog(null, "Lo siento, el n�mero introducido no es el correcto..");
		}

	}

}
