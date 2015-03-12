package ejemplos;

public class Constante {

	public static void main(String[] args) {
		//Vamos a hacer una aplicación que calcule el perímetro de una circunferencia
		final float PI=3.1416f;
		//final float hace que la variable creada sea constante y no cambie
		float perimetro, radio;
		
		radio=16;
		perimetro=radio*PI*2;
		//* sirve para indicar multiplicación
		
		System.out.println("El perímetro con un radio " + radio + "\n es " + perimetro);
		//\n hace que el programa baje a una linea nueva para seguir escribiendo
		//+ hace que el programa junte varias cadenas

	}

}
