package com.curso.java.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class EjercicioEstacionesSwitch {

	
	public static void main(String[] args) {
		
		String mes = "";
		System.out.println("Escribe un mes");
		Scanner scan = new Scanner(System.in);
		mes = scan.nextLine();
		System.out.println(mes);
		String estacion = "";
		
		
		/*switch(mes) {
			case "Enero": estacion = "invierrno";break;
			case "Febrero": estacion = "invierrno";break;
			case "Marzo": estacion = "invierno";break;
			case "Abril": estacion = "primavera";break;
			
		}*/
		
		switch(mes) {
		case "Enero", "Febrero", "Marzo": estacion = "invierno";break;
		case "Abril", "Mayo", "Junio": estacion = "primavera";break;
		case "Julio", "Agosto", "Septiembre": estacion = "verano";break;
		case "Octubre", "Noviembre", "Diciembre": estacion = "otoño";break;
		
		}
		
	if (estacion.equals("")) {
		System.out.println("Mes introducido erroneo");
		
	}else {	
		System.out.println("El mes "+ mes + "esta en la estacion "+estacion);
	}
	
	}
}
