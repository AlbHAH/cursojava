package poo;
import com.curso.java.utils.*;
public class AlumnoPojoBean {

	private String dni;
	private String nombre;
	private String apellidos;
	private boolean mayorEdad;
	private int nota;
	
	public AlumnoPojoBean() {
		
	}
	
	public AlumnoPojoBean (String dni, String nombre, String apellidos) {
		
	    this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		
	}

     public AlumnoPojoBean (String dni, String nombre, String apellidos, int nota) {
		
	    this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.nota=nota;
		
	}

     public AlumnoPojoBean (String dni, String nombre, String apellidos, int nota, boolean mayorEdad) {
 		
 	    this.dni=dni;
 		this.nombre=nombre;
 		this.apellidos=apellidos;
 		this.nota=nota;
 		this.mayorEdad=mayorEdad;
 		
 	}

     public void verNota() {
    	 
    	 int notaEdad = 18;
    	 if (notaEdad<=18) {
    		 
    		 
    	 }

    		 
    		 
     }

}
