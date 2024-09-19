package com.curso.java.inicio.String.ejercicios;

public class EjercicioString1 {

	public static void main(String[] args) {
		
		String textoQuijote = "    En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda...           ";
		int posicionPunto = textoQuijote.indexOf(".");
		int conteoComas = 0;
				
			System.out.println("Texto sin sus espacios iniciales y finales: " + textoQuijote.trim().length() + " palabras");
			System.out.println("Segunda frase del texto: " + textoQuijote.substring(posicionPunto+1).trim());
			System.out.println("¿Aparece la palabra quijote?: "+ textoQuijote.contains("quijote"));
			//System.out.println(textoQuijote.));
		
	}
}


/*

Ejercicio 1
==============================================================
Tamaño del texto sin los espacios en blanco del principio y del final*
Mostrar la segunda frase del quijote*
Aparece la palabra Quijote??*
Cuantas comas aparecen en el texto (resuelto en el ejercicio del profesor)

*/