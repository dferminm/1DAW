package ejemplos;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String hola = "Hola mundo.";
		int contador = 0;
		int especiales = 0;
		
		for(int i = 0;i < hola.length();i++){
			hola.charAt(i);
			System.out.print(hola.charAt(i) + "-");
			if(hola.charAt(i) == 'o')
				contador++;
		}
		char a;
		
		for(int i = 0;i < hola.length();i++){
			a = hola.charAt(i);
			if(!Character.isLetterOrDigit(a))
				especiales++;
		}

		System.out.println("");
		System.out.println("Hay " + contador + " letras O");
		System.out.println("Hay " + especiales + " caracteres que no son letras");
	}

}
