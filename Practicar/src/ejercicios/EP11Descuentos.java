package ejercicios;

import java.util.Scanner;

public class EP11Descuentos {

	public static void main(String[] args) {
		
		//Una tienda hace un descuento del 10% por compras menores de 20€, 
		//un 20% por compras entre 20 y 50€ 
		//y un 25% si la compra es mayor. 
		//Escribe un programa que pida el precio de un producto y muestre su precio final en las rebajas.
		
		Scanner teclado = new Scanner(System.in);
		
		int compra = 1;
		int descuento1 = (90*compra)/100;
		int descuento2 = (80*compra)/100;
		int descuento3 = (75*compra)/100;
		
		System.out.println("Importe de la compra:");
		compra = teclado.nextInt();
		
		if(compra < 20){
			System.out.println("A pagar: " + descuento1 );
		}else if(compra <= 20 && compra <= 50){
			System.out.println("A pagar: " + descuento2);
		}else if(compra > 50){
			System.out.println("A pagar: " + descuento3);
		}

	}

}
