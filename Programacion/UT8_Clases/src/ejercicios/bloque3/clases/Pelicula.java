package ejercicios.bloque3.clases;

import java.util.ArrayList;

public class Pelicula {
	
	/*Imagina que quieres crear un programa que te permita organizar tus películas. 
	 * Crearemos una clase Película donde recogemos toda la información relacionada con un film. 
	 * Algunos campos serán Titulo, Actores (array de nombres), Directores (array de nombres), fecha estreno, formato, etc. 
	 * Crea un programa (clase Filmoteca) que permita: insertar, modificar, eliminar, buscar o visualizar una película.*/
	
	private ArrayList <Pelicula> peliculas = new ArrayList <Pelicula>();
	
	private String titulo, fechaEstreno = "2015", formato = "hd";
	private ArrayList <String> actores, directores;
	
	public Pelicula(String titulo) {
		this.titulo = titulo;
		this.formato = formato;
		this.fechaEstreno = fechaEstreno;
		this.actores = new ArrayList <String>();
		actores.add("actor1");
		actores.add("actor2");
		actores.add("actor3");
		this.directores = new ArrayList <String>();
		directores.add("director1");
		directores.add("director2");
		directores.add("director3");
	}
	
	public void insertarPelicula(String titulo) {
		Pelicula pelicula = new Pelicula(titulo);
		peliculas.add(pelicula);
		System.out.println("Insertada la película " + titulo);
	}
	
	public void eliminarPelicula(int numeroPelicula) {
		peliculas.remove(numeroPelicula);
	}
	
	public void buscarPelicula(String pelicula) {
		peliculas.contains(pelicula);
	}
	
	public void verPeliculas() {
		System.out.println(peliculas.toString());
	}

	@Override
	public String toString() {
		return "Pelicula [peliculas=" + peliculas + ", titulo=" + titulo
				+ ", fechaEstreno=" + fechaEstreno + ", formato=" + formato
				+ ", actores=" + actores + ", directores=" + directores + "]";
	}
	
	
}
