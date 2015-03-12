package ejerciciosUtilizacionDeObjetos;

import java.util.Scanner;

import ejemplos.Alumno;

public class E02Alumnos {

	public static void main(String[] args) {
		Alumno alumno1,alumno2,alumno3;
		Scanner teclado=new Scanner(System.in);
		String nombre;
		int edad;
		
		alumno1=new Alumno();
		System.out.println("NOMBRE del PRIMER alumno: ");
		nombre=teclado.nextLine();
		alumno1.setNombre(nombre);
		System.out.println("EDAD del PRIMER alumno: ");
		edad=teclado.nextInt();
		alumno1.setEdad(edad);
		
		alumno2=new Alumno();
		System.out.println("NOMBRE del SEGUNDO alumno: ");
		nombre=teclado.nextLine();
		alumno2.setNombre(nombre);
		System.out.println("EDAD del SEGUNDO alumno: ");
		edad=teclado.nextInt();
		alumno2.setEdad(edad);
		
		alumno3=new Alumno();
		System.out.println("NOMBRE del TERCER alumno: ");
		nombre=teclado.nextLine();
		alumno3.setNombre(nombre);
		System.out.println("EDAD del TERCER alumno: ");
		edad=teclado.nextInt();
		alumno3.setEdad(edad);
		
		System.out.println("Listado de los alumnos: ");
		System.out.println("Nombre\tEdad");
		System.out.println(alumno1.nombre + "\t" + alumno1.edad);
		System.out.println(alumno2.nombre + "\t" + alumno2.edad);
		System.out.println(alumno3.nombre + "\t" + alumno3.edad);

	}

}
