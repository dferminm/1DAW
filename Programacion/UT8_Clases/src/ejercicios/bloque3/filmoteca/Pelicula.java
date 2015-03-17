package ejercicios.bloque3.filmoteca;

import java.util.ArrayList;

class Peliculas {
	
	private String codigo;

	public Peliculas(String codigo) {
		super();
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Peliculas [codigo=" + codigo + "]";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peliculas other = (Peliculas) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
}

public class Pelicula {
	
	private String titulo, fechaEstreno, formato;
	private ArrayList <Peliculas> peliculas;
	
	public Pelicula () {
		this.titulo = null;
		this.fechaEstreno = null;
		this.formato = null;
		peliculas = new ArrayList<Peliculas>();
	}
	
	public Pelicula(String titulo, String fechaEstreno, String formato,
			ArrayList<String> actores, ArrayList<String> directores) {
		super();
		this.titulo = titulo;
		this.fechaEstreno = fechaEstreno;
		this.formato = formato;
	}

	public void insertarPelicula (Peliculas pelicula) {
		this.peliculas.add(pelicula);
	}
	
	public void eliminarPelicula (Peliculas pelicula) {
		this.peliculas.remove(pelicula);
	}
	
	public void buscarPelicula (Peliculas pelicula) {
		this.peliculas.contains(pelicula);
	}
	
	@Override
	public String toString() {
		return " Titulo: " + titulo + "\n fechaEstreno: " + fechaEstreno
				+ "\n formato: " + formato;
	}
	
}
