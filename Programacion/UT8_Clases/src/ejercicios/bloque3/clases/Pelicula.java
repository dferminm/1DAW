package ejercicios.bloque3.clases;

import java.util.ArrayList;

public class Pelicula {
	
	private String titulo, fechaEstreno, formato;
	private ArrayList <String> actores, directores;
	
	public Pelicula(String titulo, String fechaEstreno, String formato, String actor, String director) {
		super();
		this.titulo = titulo;
		this.fechaEstreno = fechaEstreno;
		this.formato = formato;
		this.actores = new ArrayList <String>();
		actores.add(actor);
		this.directores = new ArrayList <String>();
		directores.add(director);
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", fechaEstreno=" + fechaEstreno
				+ ", formato=" + formato + ", actores=" + actores
				+ ", directores=" + directores + "]";
	}
	
}
