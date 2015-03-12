package ejercicios.bloque1.ejercicio4;

public class PruebaProducto {

	public static void main(String[] args) {
		// Crear la clase Producto, que tiene como atributos el c�digo del producto (num�rico),
		// el precio y el tanto por ciento del descuento. 
		// Deben realizarse todos los m�todos get/set. 
		// Deben a�adirse adem�s los m�todos getPrecioTotal, que tiene en cuenta el descuento, 
		// y getPrecioTotal(nuevoPrecio), que debe tener en cuenta el descuento actual para que aplic�ndoselo al precio, 
		// devuelva este 'nuevoPrecio'.

		Producto miProducto = new Producto();
		
		miProducto.setCodProducto(01);
		
		miProducto.setPrecio(120);
		
		miProducto.setPorCientoDescuento(40);
		
		System.out.println("El precio del producto es: " + miProducto.getPrecioTotal() + " euros.");
		
		System.out.println("El nuevo precio del producto es: " + miProducto.getPrecioTotal(80) + " euros.");
	}

}
