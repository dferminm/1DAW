package ejercicios;

//Escribe una funci�n tiene_duplicados(vector) que tome un vector de cadenas 
//y devuelva verdadero si alg�n elemento aparece m�s de una vez. 
//La funci�n no modificar� el vector.

public class TieneDuplicados {

	public static boolean tieneDuplicados (String vector []) {
		
		boolean losTiene = false;
		
		for(int i = 0;i < vector.length;i++) {
			for(int j = 0;j < vector.length;j++) {
				if(i!=j){
				if(vector[i].equals(vector[j])) {
					losTiene = true;
				}
				}
			}
		}
		
		return losTiene;
	}
	
	public static void main(String[] args) {
		
		String vector [] = new String [] {"hola", "que", "tal", "hola"};
		
		tieneDuplicados(vector);
		
		System.out.println(tieneDuplicados(vector));
		
	}

}
