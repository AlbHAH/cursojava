package com.curso.java.inicio.condicionales;

public class CondicionalesIf {
	
	public static void main(String[] args) {

		int numero = 6;
		System.out.println("EMPIEZA");
		
		if (numero>10) {
			System.out.println("El número es mayor de 10");
			
		}else if (numero>0 && numero<5) {
			System.out.println("El numero esta entre 0 y 5");
			
		}else if (numero>=5) {
			System.out.println("El numero está entre 5 y 10");
		}
		else {
			System.out.println("El número es menor que 0");
		}
		
		if (numero != 10) {
		System.out.println("El numero no es 10");
		}

		System.out.println("FIN");
		
		
	}

}