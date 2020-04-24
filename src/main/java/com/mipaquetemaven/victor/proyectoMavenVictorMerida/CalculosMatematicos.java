package com.mipaquetemaven.victor.proyectoMavenVictorMerida;

import java.util.ArrayList;

public class CalculosMatematicos {

	public static int potencia(int base, int exponente) {

		int resul = 1;
		if (exponente > 0)
			resul = base * potencia(base, exponente - 1);
		return resul;
	}

	public static boolean esPrimo(int numero) {

		boolean primo = true;
		int divisor = 3;
		if(numero !=2 && numero%2==0)
			primo=false;
		while(primo && divisor< numero/2) {
			if(numero % divisor==0)
				primo = false;
			divisor+=2;
		}
		return primo;
	}
	
	public static long factorial(long numero) {
		long factorial=1;
		while ( numero!=0) {
			  factorial=factorial*numero;
			  numero--;
			  if(factorial<0) {
				  return -1;
			  }
		}
		
		return factorial;
	}
	
	public static ArrayList<Integer> listaDePrimosHasta(int numero){
		ArrayList<Integer> listaDePrimos = new ArrayList<Integer>();
			listaDePrimos.add(1);
			listaDePrimos.add(2);
			listaDePrimos.add(3);
			for(int i=5; i<=numero; i+=2) {
				if(esPrimo(i))
					listaDePrimos.add(i);
				}		
				return listaDePrimos;		
			}


}
