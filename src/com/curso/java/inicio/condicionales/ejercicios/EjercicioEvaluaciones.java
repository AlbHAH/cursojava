package com.curso.java.inicio.condicionales.ejercicios;

public class EjercicioEvaluaciones {
	
	public static void main(String[] args) {
		
		
	//Solicite las calificaciones de los exámenes, los proyectos y la participación de tres estudiantes
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce nombre del alumno 1");
		String nombreAlumno1 = scan.nextLine();
		
		System.out.println(("Introduce la nota del examen del alumno 1"));
		scan = new Scanner(System.in);
		double 
		
		double notaExamen1 = 0;
		double notaExamen2 = 0;
		double notaProyecto1 = 0;
		double notaProyecto2 = 0;
		double notaParticipacion = 0;
		
		
		
		double calificaionFinal = 0;
		int examen1 = 0;
		
	}

}

/*

Imagina que estás diseñando un sistema de evaluación para un curso. 
El sistema debe determinar la calificación final de un estudiante basándose en diferentes criterios. 
Cada estudiante recibe tres tipos de calificaciones:

+Exámenes: hay dos exámenes, cada uno con un peso del 25% de la nota final.
+Proyectos: hay dos proyectos, cada uno con un peso del 20% de la nota final.
+Participación: la participación en clase tiene un peso del 10% de la nota final.

Además, hay ciertos criterios adicionales que pueden afectar la nota final:

Si la nota media de los exámenes es inferior a 50, el estudiante falla automáticamente.
Si la nota media de los proyectos es superior a 90 y la participación es mayor a 70, se añade un 5% a la nota final.
Si la participación es inferior a 30, se resta un 10% de la nota final.
Tarea:

Escribe un programa en Java que:

Solicite las calificaciones de los exámenes, los proyectos y la participación de tres estudiantes.
Calcule la nota final basada en los pesos indicados.
Aplique las reglas adicionales para modificar la nota final.
Determine si el estudiante pasa o falla el curso basado en la nota final ajustada.
Imprima la nota final y el estado (pasa/falla) del estudiante.

*/