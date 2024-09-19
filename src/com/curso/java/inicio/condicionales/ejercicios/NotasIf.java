package com.curso.java.inicio.condicionales.ejercicios;

public class NotasIf {
	
	public static void main(String[] args) {
		
		String nombreAlumno = "Antonio";
		String apellido = "Medina";
		String asignatura = "Matemáticas";				
		
		int nota = 4;
		
		if (nota>=0 && nota<5)
			System.out.println("El alumno" + " " + nombreAlumno + " " + apellido + " " + "en la asignatura" + " " + asignatura + " " + "tiene un insuficiente");
			
		if (nota>=5 && nota<7)
			System.out.println("El alumno" + " " + nombreAlumno + " " + apellido + " " + "en la asignatura" + " " + asignatura + " " + "tiene un aprobado");
		
		if (nota>=7&& nota<9)
			System.out.println("El alumno" + " " + nombreAlumno + " " + apellido + " " + "en la asignatura" + " " + asignatura + " " + "tiene un Notable");
			
		if (nota>=10)
			System.out.println("El alumno" + " " + nombreAlumno + " " + apellido + " " + "en la asignatura" + " " + asignatura + " " + "tiene un Sobresaliente");
		
	

	
	
	
	
	
	
	
	
		}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
