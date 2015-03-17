package ejercicios;

public class Aplicacion {

	public static void main(String[] args) {
		//Crea un programa que saque por consola el texto "Hola Mundo", y llama a esta clase Aplicación.
		
		System.out.println("Hola Mundo!");
		
		Persona persona = new Persona ("David");
		
		String nombre = persona.getNombre();
		
		nombre = nombre + " Fermín";
		
		persona.setNombre(nombre);
		
		persona.escribeNombre();

	}

}
