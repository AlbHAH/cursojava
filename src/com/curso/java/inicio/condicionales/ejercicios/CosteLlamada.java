package com.curso.java.inicio.condicionales.ejercicios;

public class CosteLlamada {

	public static void main(String[] args) {

		int duracionLlamada = 13;
		double coste = 0;
				
		if (duracionLlamada>0) {
			coste=1;				//coste++; aumenta en 1 el valor de una variale numerica. El lugar donde ubicamos (delante/detras) ""++", determina el resultado
									//coste--; resta 1
									//operador mod %
		}
		if(duracionLlamada>5) {
			coste = coste + 0.80;	//coste += 0.8;
					
		}
		if(duracionLlamada>8) {
			coste = coste + 0.70;
				
		}
		if(duracionLlamada>10) {
			coste = coste + ((duracionLlamada-10)*0.50);
				
		}
				
		System.out.println(coste);
				
	}
}



/*
Herramienta para calcular el precio de una llamada
Cuando se realiza una llamada, el cobro es por el tiempo que esta dura, 
de tal forma que:

+ los primeros cinco minutos cuestan 1€, 
+ los siguientes 3 minutos, 80 céntimos, 
+ los siguientes dos minutos a 70 céntimos 
+ y a partir del décimo minuto, 50 céntimos cada minuto.

Se carga un impuesto del 3% cuando es domingo, 
y si es otro día, 
	en turno de mañana 15% (6-12)
	y en turno de tarde 10%. (12-23)
	y en turno de noche -10%. (23-6)

Solicitar tiempo de llamada, dia de la semana y hora y calcular el coste de la llamada
*/