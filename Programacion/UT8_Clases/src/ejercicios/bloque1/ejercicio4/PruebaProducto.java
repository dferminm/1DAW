package ejercicios.bloque1.ejercicio4;

public class PruebaProducto {

	public static void main(String[] args) {
		// Crear la clase Producto, que tiene como atributos el código del producto (numérico),
		// el precio y el tanto por ciento del descuento. 
		// Deben realizarse todos los métodos get/set. 
		// Deben añadirse además los métodos getPrecioTotal, que tiene en cuenta el descuento, 
		// y getPrecioTotal(nuevoPrecio), que debe tener en cuenta el descuento actual para que aplicándoselo al precio, 
		// devuelva este 'nuevoPrecio'.

		Producto miProducto = new Producto();
		
		miProducto.setCodProducto(01);
		
		miProducto.setPrecio(120);
		
		miProducto.setPorCientoDescuento(40);
		
		System.out.println("El precio del producto es: " + miProducto.getPrecioTotal() + " euros.");
		
		System.out.println("El nuevo precio del producto es: " + miProducto.getPrecioTotal(80) + " euros.");
	}

}
