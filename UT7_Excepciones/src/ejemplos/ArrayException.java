package ejemplos;

public class ArrayException {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		int i = 0;
		
		for(int x = 0;x < a.length;x++) {
		try {
			System.out.println(a[i++]+" ");
		}
		catch (ArrayIndexOutOfBoundsException aiobex) {
			System.out.println(".");
		}
		}

	}

}
