package com.curso.java.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class EjercicioEstaciones {
	
	public static void main(String[] args) {
		
		String mes = "";
		System.out.println("Escribe un mes");
		Scanner scan = new Scanner(System.in);
		mes = scan.nextLine(); //esta linea varia en funcion del caso
		
		scan = new Scanner(System.in); //esta linea añadida despues
		int edad = scan.nextInt();     //esta linea añadida despues
		System.out.println(mes);
		String estacion = ""; 
	
	if(mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase("Febrero") ||mes.equalsIgnoreCase("Marzo")) {
		estacion = "Invierno";
	}else if (mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Mayo") || mes.equalsIgnoreCase("Junio")) {
		estacion = "Primavera";
	}else if (mes.equalsIgnoreCase("Julio") || mes.equalsIgnoreCase("Agosto") || mes.equalsIgnoreCase("Septiembre")) {
		estacion = "Verano";
	}else if (mes.equalsIgnoreCase("Octubre") || mes.equalsIgnoreCase("Noviembre") || mes.equalsIgnoreCase("Diciembre")) {
		estacion = "Otoño";
	//IgnoreCase tras equal nos permite pasar por alto ciertos errores que el usuario haga al introducir informacion	
	}
	
	if (estacion.equals("")) {
	System.out.println("Mes intrudicido erroneo");
	}else {
		System.out.println("El mes " + mes + " está en la estación " + estacion);
	}
	
	}
}




/*Teniendo en cuenta que || sirve para ver si una condición cumplu un valor u otro, hacer lo siguiente:

Declarar una variable para guardar un nombre de un mes
Indicar con que estación del año se corresponde

Enero, Febrero, marzo --> Invierno
Abril, mayo, Junio --> Primavera
Julio, Agosto, septiembre --> Verano
octube, noviembre, diciembre --> Otoño*/