package com.entornos.nombreCompleto.algoritmos;

public abstract class Algoritmo {
	
	/****
	 * La sucecion de Fibonacci es una secuencia de 
	 * números en la que, después del 0 y del 1, cada número de la serie se obtiene sumando los dos anteriores
	 * @param numero
	 * @return  int 
	 */
	
	public static int fibonacci(int numero) {
        if(numero<0) throw new IllegalArgumentException();
        
        int a = 0;
        int b = 1;
        
        if(numero == 0) return 0;
        if(numero == 1) return 1; 
        
        int ultimo = 0;
        
        for(int i = 2; i <= numero; i++) {
            ultimo = a+b;
            a = b;
            b = ultimo;
        }

        return b;
    }
	
	
	/****
	 * fatorial multiplica todos los valores menores a "numero"
	 * @param numero
	 * @return int 
	 */
	public static int factorial(int numero) {
		if(numero<0) throw new IllegalArgumentException();
		
		if(numero==0)return 0;
		
		int res=1;
		
		for(int i = 2; i <= numero; i++) {
            res =res*i;
        }

		return res;
	}
	/****
	 * Calcula cuelquier numero que no sea divisible ni por el ni por 1;
	 * @param numero
	 * @return boolean
	 */
	public static boolean primo (int numero) {
		if(numero<2) throw new IllegalArgumentException();
		if(numero==2) return true;
		for(int i = 2; i <= numero/2; i++) {
            if((numero%i)==0) return false;
        }
		
		return true;
	}
}
