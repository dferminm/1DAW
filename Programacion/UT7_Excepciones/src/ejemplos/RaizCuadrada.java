package ejemplos;

public class RaizCuadrada {

	public static double raiz (double a) {
		
		if(a < 0)
			throw new ArithmeticException("Ra�z de negativo");
	
		return Math.sqrt(a);
	}
	
	public static void main(String[] args) {
		
		System.out.println(raiz(7));
		try {
		System.out.println(raiz(-2));
		}
		catch (ArithmeticException aex) {
			System.out.println("No se puede hacer una ra�z de negativo.");
		}
		
	}

}
