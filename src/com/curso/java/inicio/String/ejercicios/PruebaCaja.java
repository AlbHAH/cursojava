package com.curso.java.inicio.String.ejercicios;

import javax.swing.JOptionPane;

public class PruebaCaja {
	
	public static void main(String[] args) {
		
		 boolean arroba = false;

		    boolean punto = false;

		    String mail = JOptionPane.showInputDialog("Ingrese su email por favor: ");

		    for (int i = 0; i<mail.length(); i++) {

		        if(mail.charAt(i)=='@' && mail.charAt(i)=='.') {

		            arroba = true;
		            punto = true;
		        }

		    }

		    if (arroba == true && punto == true) {

		        System.out.println("El mail ingresado es correcto");
		    }
		    else {
		        System.out.println("El mail ingresado es incorrecto");
		}
	}
}
