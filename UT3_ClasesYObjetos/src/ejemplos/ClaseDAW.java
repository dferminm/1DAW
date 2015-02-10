package ejemplos;

public class ClaseDAW {

	public static void main(String[] args) {
		Alumno Juan,Pepe;
		
		Juan=new Alumno();
		Pepe=new Alumno();
		
		Juan.nombre="Juan Perez";
		Juan.edad=27;
		Juan.aumentarEdad(1);
		
		Pepe.setNombre("Pepe Perez");
		Pepe.setEdad(1);
	}

}
