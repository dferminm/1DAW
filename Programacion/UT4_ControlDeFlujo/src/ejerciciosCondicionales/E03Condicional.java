package ejerciciosCondicionales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class E03Condicional {

	public static void main(String[] args) {
		//Una tienda hace un descuento del 10% por compras menores de 20€
		//un 20% por compras entre 20€ y 50€
		//y un 25% si la compra es mayor de 50€
		//Programa que pida el precio del producto y muestre su precio final en rebajas
		
		Scanner teclado = new Scanner(System.in);
		int precio;
		
		System.out.println("Dime el precio en € del artículo y te dire su precio final: ");
		precio = teclado.nextInt();
		
		if (precio<20)
			System.out.println("El precio final es de " + (precio-(precio*0.1)) + " € ");
		if (precio>=20 && precio<=50) 
			System.out.println("El precio final es de " + (precio-(precio*0.2)) + " € ");
		if (precio>50)
			System.out.println("El precio final es de " + (precio-(precio*0.25)) + " € ");
			
		

	}

}
