package poo;

public class Ejemplos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Crear objeto. Importante new + nombre de la clase y parentesis (Constructor)
		Persona persona1 = new Persona ();
		System.out.println(persona1.edad); //Nº se inicializa a 0
		System.out.println(persona1.nombre);//Se inicializa con null
		
//Se les da valor a los atributos		
		persona1.nombre= " Eva ";
		persona1.edad=28;
		persona1.apellidos= "García";
		
		Persona persona2 = new Persona ();
		persona2.nombre= " Esther ";
		persona2.edad=53;
		persona2.apellidos= "Gutierrez";
		
//ejecuta accion 
		persona1.correr();
		persona2.correr();
	}

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
//Crear objeto. Importante new + nombre de la clase y parentesis (Constructor)
		Persona persona1 = new Persona ();
		System.out.println(persona1.edad); //Nº se inicializa a 0
		System.out.println(persona1.nombre);//Se inicializa con null
		
//Se les da valor a los atributos		
		persona1.nombre= " Eva ";
		persona1.edad=28;
		persona1.apellidos= "García";
		
		Persona persona2 = new Persona ();
		persona2.nombre= " Esther ";
		persona2.edad=53;
		persona2.apellidos= "Gutierrez";
		
//ejecuta accion 
		persona1.correr();
		persona2.correr();
		

		  
		 
	
	}
	

}

