package ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaro el Array
		int[] sucesion = new int [40];
		
		//Declaro las 3 primeras variables del Array
		sucesion[0]=1;
		sucesion[1]=1;
		sucesion[2]=1;
		
		//Hago un bucle para que recorra el Array
		for(int i=3;i<40;i++){
			
			//Digo que el siguiente número es igual a:
			//numero - 2 posiciones y el numero - 3 posiciones
			sucesion[i]=sucesion[i-2]+sucesion[i-3];
		}
		
		//Digo que me vaya imprimiendo los números
		for(int i=0;i<sucesion.length;i++)
			System.out.print(sucesion[i]+" ");
			

	}

}
