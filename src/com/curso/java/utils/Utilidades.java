package com.curso.java.utils;

import java.util.Scanner;
public class Utilidades {


public static String pideDatoString(String pregunta) {
	String texto = "";
	// Crea un nuevo objeto Scanner que lee desde la entrada estándar
	Scanner scan = new Scanner(System.in);


	// Utiliza el objeto Scanner para leer la siguiente línea de entrada del usuario
	// y la almacena en la variable 'texto'
	texto = scan.nextLine();

	return texto;
}



public static int pideDatoNumerico(String pregunta) {
	int dato = 0;
	System.out.println(pregunta);
	Scanner scan = new Scanner(System.in);
	dato = scan.nextInt();

	calculaAnioNacimiento(28);
	
	return dato;
}


public static int calculaAnioNacimiento(int edad) {
	
	return 2024-edad;
	
}
	public static boolean validarEmail(String email) {
		boolean esValido = false;
		
		
		return esValido;
	}
	
	public static void pintarMenu (String[] opcionesMenu, boolean pintaNumeros) {
		 
		
		if (pintaNumeros) {
			for (int i=0; i<opcionesMenu.length    ;  i++ ) {
				System.out.println(i+1 + ".-" + opcionesMenu[i]);
			}
		}else {
			for ( String opcion : opcionesMenu ) {
				System.out.println(opcion);
				
			}
		}
		
	}


}
