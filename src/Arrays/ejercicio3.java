package Arrays;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("¿Cuántos números va a guardar?");
		int numeros = scanner.nextInt();
		int[] numeros1 = new int[numeros];
		
		
		for (int i=0; i<numeros1.length; i++) {
			System.out.println("ingresa los números a guardar");
			scanner = new Scanner(System.in);
			int number = scanner.nextInt();
		
			numeros1[i]=number; 
		}
		for (int numerosTotal : numeros1) {		//Muestra los numeros en total
			System.out.print(numerosTotal+"-");
			
			
		}   
		
	}
	
}
