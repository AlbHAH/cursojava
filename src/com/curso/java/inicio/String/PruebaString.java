package com.curso.java.inicio.String;

public class PruebaString {
	
	public static void main(String[] args) {
		
		
		String textoPrueba = "Hola Mundo";
		String textoPruebaEspacios = "         Hola Triana  ";
		String textoPruebaContenido = "     ";
		
		//Prueba .indexOf: devuelve la posicion de uno o varios caracteres siendo la primera posicion 0. Si no encuentra el caracter, devuelve -1.
			System.out.println(textoPrueba.indexOf("M"));
			
		//Prueba .lastIndexOf: devuelve la posicion de uno o varios caracteres empezando por el final.
			System.out.println(textoPrueba.lastIndexOf("d"));
	
		//Prueba .length: tamaño del String (longitud no posicion).
			System.out.println(textoPrueba.length());
	
		//Prueba .contains: devuelve true o false respecto a la busqueda de in caracter o varios caracteres en el String.
			System.out.println(textoPrueba.contains("ola"));
		
		//Prueba .charAt: devuelve el caracter respecto a la posicion pasada por parametro.
			System.out.println(textoPrueba.charAt(3));
			
		//Prueba .trim: devuelve el String sin los espacios que haya tanto al inicio como al final.
			System.out.println(textoPruebaEspacios.trim());
	
		//Prueba .isBlank: comprueba si String esta en blanco (los espacios cuentan como contenido, pero no como texto).
			System.out.println(textoPruebaContenido.isBlank());
			
		//Prueba .isEmpty: comprueba si String tiene contenido (los espacios vuentan como contenido).
			System.out.println(textoPruebaContenido.isEmpty());
	
		//Prueba .replace: reemplaza un caracter por otro
			System.out.println(textoPrueba.replace('M','H'));
		
		//Prueba .substring: devuelve el caracter, respecto a la posicion en el String, pasada por parametro.
			System.out.println(textoPrueba.substring (2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
