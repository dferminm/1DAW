package ejemplos;

public class operadores {

	public static void main(String[] args) {
		int x,y;
		boolean resultado;
		
		x=10;
		y=5;
		resultado=x>y;
		
		System.out.println("x>y: " + (x>y));
		System.out.println("x>y: " + resultado);
		
		resultado=(x>y) && (x>0);
		//&& se utiliza para definir 1cosa "y" 2cosa.
		resultado=(x>y) || (x>0);
		// || se utiliza para definir 1cosa "o" 2 cosa.
		resultado= !(x>y);
		// ! se utiliza para indicar "NO".
		
		resultado=(x>y || (x!=y) && (y<10));
		

	}

}
