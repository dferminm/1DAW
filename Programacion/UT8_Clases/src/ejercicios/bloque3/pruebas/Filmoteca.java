package ejercicios.bloque3.pruebas;

import java.util.ArrayList;

import ejercicios.bloque3.clases.Pelicula;

public class Filmoteca {

	public static void main(String[] args) {
		/* Imagina que quieres crear un programa que te permita organizar tus películas. 
		Crearemos una clase Película donde recogemos toda la información relacionada con un film. 
		Algunos campos serán Titulo, Actores (array de nombres), Directores (array de nombres), 
		fecha estreno, formato, etc. 
		Crea un programa (clase Filmoteca) que permita: 
		insertar, modificar, eliminar, buscar o visualizar una película.*/
		
		Pelicula peli = new Pelicula("Peli1");
		
		peli.insertarPelicula("titulo1");
		peli.insertarPelicula("titulo2");
		
		peli.verPeliculas();
		
		peli.buscarPelicula("titulo1");
		
		peli.eliminarPelicula(0);
		
		peli.verPeliculas();
	}
		
}