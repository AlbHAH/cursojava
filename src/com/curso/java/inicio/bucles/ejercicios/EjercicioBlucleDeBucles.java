package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioBlucleDeBucles {
	
	public static void main(String[] args) {
		
		double numero = Math.random() *37;
		int numApuesta = 0;
		
		System.out.println("¿Por qué número quieres apostar?");
		Scanner scan = new Scanner(System.in);
		int numApostado = scan.nextInt();
		
		int numeroRuleta = (int)(Math.random()*37);
		
		
		if (numApuesta >0 && numApuesta <= 36) {
			
		}else { numApuesta <0 || numApuesta >36) 
			System.out.println("El numero introducido no es correcto en las apuestas de la ruleta");
			
					
		}
		
	}

}
