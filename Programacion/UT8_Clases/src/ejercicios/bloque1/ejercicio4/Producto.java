package ejercicios.bloque1.ejercicio4;

		//Crear la clase Producto, que tiene como atributos el código del producto (numérico),
		// el precio y el tanto por ciento del descuento. 
		// Deben realizarse todos los métodos get/set. 
		// Deben añadirse además los métodos getPrecioTotal, que tiene en cuenta el descuento, 
		// y getPrecioTotal(nuevoPrecio), que debe tener en cuenta el descuento actual para que aplicándoselo al precio, 
		// devuelva este 'nuevoPrecio'.

public class Producto {
	
	private int codProducto;
	private int precio;
	private double porCientoDescuento;
	
	public int getCodProducto() {
		return codProducto;
	}
	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public double getPorCientoDescuento() {
		return porCientoDescuento;
	}
	public void setPorCientoDescuento(int porCientoDescuento) {
		this.porCientoDescuento = porCientoDescuento;
	}
	
	public double getPrecioTotal() {
		return precio-(precio*(porCientoDescuento/100));
	}
	
	public double getPrecioTotal(int nuevoPrecio) {
		return nuevoPrecio-(nuevoPrecio*(porCientoDescuento/100));
	}

}
