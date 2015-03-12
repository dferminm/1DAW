package ejerciciosUtilizacionDeObjetos;

import java.util.Scanner;

import ejemplos.Alumno;

public class E01Alumnos {

	public static void main(String[] args) {
		Alumno alumno1,alumno2,alumno3;
		Scanner teclado=new Scanner(System.in);
		String nombre;
		int edad;
		
		alumno1=new Alumno();
		System.out.println("Nombre del primer alumno: ");
		nombre=teclado.nextLine();
		alumno1.setNombre(nombre);
		System.out.println("Edad de los alumnos: ");
		edad=teclado.nextInt();
		alumno1.setEdad(edad);
		
		alumno2=new Alumno();
		System.out.println("Nombre del segundo alumno: ");
		teclado.nextLine();
		alumno2.setNombre(teclado.nextLine());
		alumno2.setEdad(edad);
		
		alumno3=new Alumno();
		System.out.println("Nombre del tercero alumno: ");
		alumno3.setNombre(teclado.nextLine());
		alumno3.setEdad(edad);
		
		System.out.println("Listado de los alumnos: ");
		System.out.println("Nombre\tEdad");
		System.out.println(alumno1.nombre + "\t" + alumno1.edad);
		System.out.println(alumno2.nombre + "\t" + alumno2.edad);
		System.out.println(alumno3.nombre + "\t" + alumno3.edad);
		
	}

}
