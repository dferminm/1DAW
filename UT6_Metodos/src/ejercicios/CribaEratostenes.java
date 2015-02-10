package ejercicios;

import java.util.*;

//Escribe un programa que implemente el algoritmo de la criba de Erat�stenes. 
//El c�culo de la criba se har� en un m�todo, que imprimir� cada uno de los n�meros no primos encontrados. 

public class CribaEratostenes {

	public static void main(String[] args) {

		 //basado en: http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes#Implementation

		 //hasta qu� numero
		 int n = 100;
		 System.out.println("N�meros primos hasta " + n);

		 //array de valores booleanos de 2 a n inicializados a true
		 boolean[] a = new boolean[n+1];
		 Arrays.fill(a, true);

		 //m�todo para hacer la criba, devuelve un nuevo array de �ndices
		 boolean[] respuesta = criba(n, a);
		//imprimir los n�meros primos
		 for (int i=2; i<=n; i++) {
		 if (respuesta[i])
		 System.out.print(i + " ");
		 }
		 }

		 //m�todo para la criba
		 public static boolean[] criba(int tope, boolean[] indices) {
		 int cont = 0;
		 for (int i=2; i<=tope; i++) {
		 if (indices[i]) {
		 cont = 0;
		 for (int j = i*i; j<=tope; j=(i*i)+(cont*i)) {
		 indices[j] = false; 
		 cont++; 
		 }
		 }
		 }
		 return indices;
	}

}
