package ejercicios.bloque1.ejercicio4;

		//Crear la clase Producto, que tiene como atributos el c�digo del producto (num�rico),
		// el precio y el tanto por ciento del descuento. 
		// Deben realizarse todos los m�todos get/set. 
		// Deben a�adirse adem�s los m�todos getPrecioTotal, que tiene en cuenta el descuento, 
		// y getPrecioTotal(nuevoPrecio), que debe tener en cuenta el descuento actual para que aplic�ndoselo al precio, 
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
