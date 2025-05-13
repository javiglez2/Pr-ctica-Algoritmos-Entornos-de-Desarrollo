package com.entornos.nombreCompleto.algoritmos;

public class Principal {

	public static void main(String[] args) {

		 int numeros[] = new int[3];
		 
		 int resultadoFibonacci[] =new int[3];
		 int resultadoFactorial[] =new int[3];
		 boolean resultadoPrimo[] =new boolean[3];

		
		//ejercicio 3.1
		 
		 for(int i = 0; i<3 ; i++) {
				numeros[i] = (int)(Math.random()*9+1);
				
				for(int j = 0; j <3 ; j++) {
					while(numeros[i] == numeros[j] && i!=j) {
						numeros[i] = (int)(Math.random()*9+2);
					}
				}
			}

		//ejercicio 3.2
		 
		for (int i = 0; i < 3; i++) {
			resultadoFibonacci[i]=Algoritmo.fibonacci(numeros[i]);
		}
		
		//ejercicio 3.3
		
		for (int i = 0; i < 3; i++) {
			resultadoFactorial[i]=Algoritmo.factorial(numeros[i]);
		}
		//ejercicio 3.4
		
		for (int i = 0; i < 3; i++) {
			resultadoPrimo[i]=Algoritmo.primo(numeros[i]);
		}
	}
}