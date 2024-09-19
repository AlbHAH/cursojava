package EjercicioManiqui;

public class Escaparate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vestido vestido = new Vestido("Rojo", "M", 20);
		Maniqui maniqui1 = new Maniqui(123, vestido);

		// ----------------------------------------------

		Boton bot1 = new Boton("Cuadrado", "Verde", "Grande");

		Boton bot2 = new Boton("Cuadrado", "Amarillo", "Grande");

		Boton boton1[] = { bot1, bot2 };

		Camisa cam1 = new Camisa("Blanca", "M", 10, boton1);

		Pantalon pantalon = new Pantalon("Azul", "M", 15);

		Maniqui maniqui2 = new Maniqui(234, pantalon, cam1);

		// -------//--------------------------------//--------

		System.out.println("El maniqui con ID "
				+ (maniqui1.getId() + " lleva un Vestido con un valor de " + vestido.getPrecio() + " euros."));

		int Conj = cam1.getPrecio() + pantalon.getPrecio();

		System.out.println(
				"El maniqui con ID " + (maniqui2.getId() + " lleva un Conjunto con un valor de " + Conj + " euros."));

		// ----------- ------------- ---------- -------------- ------------ ---------

		Maniqui[] maniquies = { maniqui1, maniqui2 };
		mostrarEscaparate(maniquies);
		// Maniqui a = maniquis[maniquis.length - 1];
	}

	/*
	 * modificadorAcceso [static] tipoDeDatoDevuelve nombreDelMetodo ( [parametro1,
	 * parametro2, ..., parametro n] ) {}
	 */

	public static void mostrarEscaparate(Maniqui[] maniquies) {

		for (Maniqui mann : maniquies) {
			System.out.print("El maniquí con ID: "+mann.getId());
			if (mann.getVestido() != null) {
				System.out.println(", lleva vestido.");
				
			} else if (mann.getCamisa() != null && mann.getPantalon() != null) {
				System.out.print(", lleva pantalon y camisa.");

			}

		}

	}
}
