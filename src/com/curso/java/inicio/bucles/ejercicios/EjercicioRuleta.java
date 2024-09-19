package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioRuleta {
	
	public static void main(String[] args) {
		
		int numeroApostado = 0;
		double saldo = 500.0;
		int dineroApostado = 0;
		
		System.out.println("¿Cual es el número de tu apuesta?");
		Scanner scan = new Scanner(System.in);
		int numeroApuesta = scan.nextInt();
		
		if (numeroApostado >=0 && numeroApostado <= 36) {
		
		
		System.out.println("¿Cuánto dinero quieres apostar¿");
		scan = new Scanner(System.in);
		int dineroApuesta = scan.nextInt();
		
		
		
					
		
	}
	}


}








/*
============================
Ruleta
============================

Facil
============================
saldo = 500

¿Por qué numero quieres apostar? (0-36) 
Si es otro numero se vuelve a formular la pregunta

¿Cuánto dinero quieres apostar? 
Si el importe de la apuesta es > que el saldo disponible por el usuario,
se notifica y se vuelve a formular la pregunta

De manera aleatoria generar un nº entre 0 y 36

Si el numero apostado es = al nº aleatorio, se multiplica lo apostado *36 y se suma al saldo no apostado
Si no lo es le restamos del saldo la cantidad apostada

Si tiene saldo le perguntamos ¿Quieres seguir jugando? si dice que no le indicamos el saldo con el que se va y si no tiene saldo le indicamos que se ha quedado sin dinero.


Dificil
============================
Preguntar a qué juego quiere jugar (Número,Par/Impar,Bloques)

+ Si la apuesta es par/impar y se gana, se multiplica lo apostado *2
+ Si la apuesta es Bloques y se gana, se multiplica lo apostado *5 (1-12,13-24,25-36)
*/