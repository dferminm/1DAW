package ejercicios;

class Cerebro {
	
	public Cerebro () {
		System.out.println("Pensando...");
	}
}

class Persona {
	
	private String nombre;
	private Cerebro cerebro;
	
	public Persona () {
		
	}
	
	public Persona (String nombre) {
		
		//This hace referencia a los atributos.
		this.nombre = nombre;
		
		cerebro = new Cerebro();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void escribeNombre () {
		
		System.out.println("Mi nombre es " + nombre);
	}

}
