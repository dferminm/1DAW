package ejerciciosPracticar;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class E01Capicúa {

	public static void main(String[] args) {
		//Lee un número por consola y comprueba si es palíndromo (capicúa).
		//Pista: si creas un número con los dígitos en orden inverso al leido, 
		//y al compararlos resulta que son iguales, será capicúa.

		int numero;
		int resto;
		int numInv = 0;
		int n;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
		
		n = numero;
		
		while(n != 0){
			resto = n % 10;
			n = n / 10;
			numInv = numInv*10 + resto;
		}
		
		if(numero == numInv){
			JOptionPane.showMessageDialog(null, "El número es capicúa.");
		}else{
			JOptionPane.showMessageDialog(null, "El número no es capicúa.");
		}
	}

}
