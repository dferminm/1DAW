package ejemplos;

public class CompararCadenas {

	public static void main(String[] args) {
		String s1, s2;

		s1 = "Hola";
		s2 = "Adios";

		//Para comparar cadenas se utiliza .equals
		//Para comparar números se utiliza ==
		if (s1.equals(s2)) {
			System.out.println("Iguales");
		} else {
			System.out.println("Distintas");
		}
	}

}
