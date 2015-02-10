package ejemplos;

public class Tablas {

	public static void main(String[] args) {
		/*Ejemplo de bucle anidado para hacer 
		las tablas de multiplicar del 1 al 10.*/
		
		for(int i = 1;i<=10;i++){
			for(int j = 1;j<=10;j++){
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}	
	}

}
