package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class EjemplosBucleFor {
	
	public static void main(String[] args) {
		
		//for (	declaramos la variable ; condicion que hay que dar para que el bucle se ejecute	; modificacion de las variables	)
		
		/*for (int i=0 ; i<5 ; i++ ) {
			System.out.println("Hola");*/
		
		/*for(int i=0; i<=20; i+=10)
		System.out.println(i);
		*/
		
		
		/*int multiplicando ;
	       System.out.println("¿Que tabla desea Realizar?");
	       Scanner valor1 = new Scanner(System.in);
	       multiplicando = valor1.nextInt();
	    
	       int multiplicador;
	       for(multiplicador = 0; multiplicador <=10; multiplicador++){
	       System.out.println(multiplicando + " X " + multiplicador + " = " + multiplicando * multiplicador );
	       }  
	    */
	       
	     
	       for (int j=1;j<=10;j++) {
	    	   System.out.println("\nTabla del "+j);
	    	   for (int i=1; i<=10; i++) {
	    		   System.out.println("\t"+j+"x"+i+" = " + (j*i));
	    	   }
	       }
	  }
}
		

// \t inserta una tabulacion
// \n salto de linea