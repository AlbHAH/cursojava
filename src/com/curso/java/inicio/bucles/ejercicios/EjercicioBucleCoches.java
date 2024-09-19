package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioBucleCoches {
	
	public static void main(String[] args) {
		
		double velocidadMaxima = 0;
		
		System.out.println("¿Cuantos coches hay?");
		Scanner scan = new Scanner(System.in);
		int numeroCoches = scan.nextInt();
			
		for (int i=0; i<numeroCoches ; i++) { //en la condicion, ponemos numeroCoches, para que dependa de cuantos coches se introducen
			System.out.println("Velocidad del coche " + (i+1)); //evitamos que cuente y parta del coche 0 ya que coche 0 no es un dato buscado
			scan = new Scanner(System.in);
			double velocidadCoche = scan.nextDouble();
			System.out.println("La velocidad del coche 1 es " + velocidadCoche);
			
			if (velocidadCoche>velocidadMaxima) {
				velocidadMaxima = velocidadCoche;
			}
			
		}
		System.out.println("El coche más rapido va a "+ velocidadMaxima + " km/h");
		
			
	}

}

/*

Pedir numero de coches
Por cada coche pedir su velocidad
Indicar a qué velocidad va el coche más rápido

*/


//pista: definir un tope de velocidad, para poder establecer que coche es mas rapido