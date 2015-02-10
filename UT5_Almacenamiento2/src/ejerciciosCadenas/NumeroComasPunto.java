package ejerciciosCadenas;

import java.util.*;

public class NumeroComasPunto {

	public static void main(String[] args) {
		//Escribe un programa que reciba un numero double y devuelva a una cadena con comas y punto decimal. 
		//Por ejemplo, pasándole 1235689,45 dará "1.235.689,45".

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
        double numero=teclado.nextDouble();
        
        String numeroIntroducido = Double.toString(numero);
        byte contador = 0;
        
        numeroIntroducido = numeroIntroducido.replace('.',  ',');
        
        contador = (byte)numeroIntroducido.indexOf(',');
        
        String numeroFormateado="";
        for(int i=(numeroIntroducido.length()-contador);i>0;i--){
            numeroFormateado+=numeroIntroducido.charAt(numeroIntroducido.length()-i);
        }
        for(byte i=1;i<contador+1;i++){
            numeroFormateado=numeroIntroducido.charAt(contador-i)+numeroFormateado;
            if ((i%3)==0 && i!=contador){
                numeroFormateado="."+numeroFormateado;
            }
        }
    
        System.out.println(numeroFormateado);
	}

}
