package ejemplos;

public class EjemploWhile {

	public static void main(String[] args) {
		// 10 números consecutivos
		
		int numero;
		
		numero = 1;
		
		while (numero<=10) {
			System.out.println(numero);
			//numero = numero + 1;
			//numero+=1;
			numero++;
			//Es lo mismo
			//numero++ significa que a la variable le suma 1
		}
		
		numero=1;
		do {
			System.out.println(numero);
			numero++;
		} while (numero<=10);
		}
	}
