package ejemplos;

import java.util.Scanner;

public class LeerNext {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Escribe: ");
		String cadena=teclado.next();
		//next lee solamente un toque de teclado (antes de dar al espacio).
		//Para que lea toda la línea, en lugar de next se escribiria nextLine

		System.out.println("Leído: " + cadena);
	
	}

}
