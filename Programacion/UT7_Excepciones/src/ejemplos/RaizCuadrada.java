package ejemplos;

public class RaizCuadrada {

	public static double raiz (double a) {
		
		if(a < 0)
			throw new ArithmeticException("Raíz de negativo");
	
		return Math.sqrt(a);
	}
	
	public static void main(String[] args) {
		
		System.out.println(raiz(7));
		try {
		System.out.println(raiz(-2));
		}
		catch (ArithmeticException aex) {
			System.out.println("No se puede hacer una raíz de negativo.");
		}
		
	}

}
