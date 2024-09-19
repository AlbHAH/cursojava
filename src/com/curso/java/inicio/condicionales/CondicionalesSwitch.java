package com.curso.java.inicio.condicionales;

public class CondicionalesSwitch {

	public static void main(String[] args) {
		
		int nota = 10;
		
		switch (nota) {
			case 5: System.out.println("Aprobado"); break;  //break hace que en la linea correcta la lectura se detenga
			case 7: System.out.println("Notable"); break;
			case 9: System.out.println("Notable Alto"); break;
			case 10: System.out.println("Sobresaliente"); break;
			default: System.out.println("Nota incorrecta");
		}
	}
}
