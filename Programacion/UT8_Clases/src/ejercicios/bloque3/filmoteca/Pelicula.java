package ejercicios.bloque3.filmoteca;

import java.util.ArrayList;

public class Pelicula {
	
	/* Algunos campos serán Titulo, Actores (array de nombres), 
	Directores (array de nombres), fecha estreno, formato, etc.*/
	
	//  insertar, modificar, eliminar, buscar o visualizar una película.
	
	private String titulo, fechaEstreno, formato;
	private ArrayList <String> actores, directores;
	
	public Pelicula() {
		super();
		this.titulo = titulo;
		this.fechaEstreno = fechaEstreno;
		this.formato = formato;
		actores = new ArrayList<String>();
		directores = new ArrayList<String>();
	}
	
	
	@Override
	public String toString() {
		return " Titulo: " + titulo + "\n fechaEstreno: " + fechaEstreno
				+ "\n formato: " + formato + "\n actores: " + actores
				+ "\n directores: " + directores;
	}
	
}
