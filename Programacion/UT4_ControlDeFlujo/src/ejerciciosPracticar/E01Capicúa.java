package ejerciciosPracticar;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class E01Capic�a {

	public static void main(String[] args) {
		//Lee un n�mero por consola y comprueba si es pal�ndromo (capic�a).
		//Pista: si creas un n�mero con los d�gitos en orden inverso al leido, 
		//y al compararlos resulta que son iguales, ser� capic�a.

		int numero;
		int resto;
		int numInv = 0;
		int n;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero:"));
		
		n = numero;
		
		while(n != 0){
			resto = n % 10;
			n = n / 10;
			numInv = numInv*10 + resto;
		}
		
		if(numero == numInv){
			JOptionPane.showMessageDialog(null, "El n�mero es capic�a.");
		}else{
			JOptionPane.showMessageDialog(null, "El n�mero no es capic�a.");
		}
	}

}
