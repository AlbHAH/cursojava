package poo;

public class AlumnoMain {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno();
		alumno1.setDni("1A");
		alumno1.setNombre("N1");
		alumno1.setApellidos("A1");
		alumno1.setNota(6.5);
		alumno1.setMayorEdad(true);
		
		
		Alumno alumno2 = new Alumno("2B","N2","A2");
		alumno2.setNota(7);
		alumno2.setMayorEdad(false);
		
		Alumno alumno3 = new Alumno("3C","N3","A3",9.75);
		alumno3.setMayorEdad(true);
		
		
		Alumno alumno4 = new Alumno("4D","N4","A4",true,5.25);
		
		System.out.println(alumno4.getNombre());
		
		alumno1.verNota();
		alumno2.verNota();
		alumno3.verNota();
		alumno4.verNota();
		
		
		String[] colores = {"Azul","Verde","Amarillo"};
		Alumno[] alumnos = {alumno1,alumno2,alumno3,alumno4}; 
		
		Alumno a = alumnos[alumnos.length-1];
		System.out.println(a.getNombre());
		
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre());
		}
		
	}

}





