package ejerciciosUtilizacionDeObjetos;

import javax.swing.JOptionPane;

import ejemplos.Alumno;

public class E03AlumnosCuadroDialogo {

	public static void main(String[] args) {
		Alumno alumno1,alumno2,alumno3,edadAlumnos;
		String nombre;
		String cadenaEdad;
		int edad;
		
		alumno1 = new Alumno();
		nombre = JOptionPane.showInputDialog("Nombre del primer alumno: ");
		alumno1.setNombre(nombre);
		
		alumno2 = new Alumno();
		nombre = JOptionPane.showInputDialog("Nombre del segundo alumno: ");
		alumno2.setNombre(nombre);
		
		alumno3 = new Alumno();
		nombre = JOptionPane.showInputDialog("Nombre del tercer alumno: ");
		alumno3.setNombre(nombre);
		
		edadAlumnos = new Alumno();
		cadenaEdad = JOptionPane.showInputDialog("Edad de los alumnos: ");
		edad = Integer.parseInt(cadenaEdad);
		edadAlumnos.setEdad(edad);
		
		System.out.println("Listado de los alumnos: ");
		System.out.println("Nombre\tEdad");
		System.out.println(alumno1.nombre + "\t" + edadAlumnos.edad);
		System.out.println(alumno2.nombre + "\t" + edadAlumnos.edad);
		System.out.println(alumno3.nombre + "\t" + edadAlumnos.edad);
				
	}

}
