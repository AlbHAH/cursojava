package com.curso.java.inicio.String.ejercicios;

import java.util.Scanner;

public class EjercicioString2 {

	public static void main(String[] args) {
		
		String email = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa tu email: ");
		scan = new Scanner(System.in);
		String direccionEmail = scan.nextLine();
		
		if(email != " ") {
			
		//}else { (email == " ") 
			//System.out.println("Esta dirección de email es incorrecta");
		
		
		
		
	
		}
}


/*
 
Ejercicio 2: Validar email
==============================================================
Itroduce tu email (a partir de un email proporcionado). Vamos a validar si el email es correcto o no. Para ello vamos a pasar las siguientes validaciones
   asdasd@as.dasd.easdasdasdsad   

1. El email solo contiene una @
2. El email no puede contener espacios en blanco 
3. Despues de la @ debe de haber al menos un punto
4. Entre la @ y el primer punto que esté depués tiene que haber una separación de 2 caracteres
5. Después del último punto tiene que haber entre 2 y 5 caracteres

Si no cumple validación se indica por qué
*/
