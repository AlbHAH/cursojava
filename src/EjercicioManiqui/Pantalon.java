package EjercicioManiqui;

public class Pantalon {

	private String color;
	private String talla;
	private int precio;
	Boton boton = new Boton("Redondo", "amarillo", "pequeño");

	public Pantalon(String color, String talla, int precio, Boton boton) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.boton = boton;
	}

	public Pantalon(String color, String talla, int precio) {
		this.color = color;
		this.talla = talla;
		this.precio = precio;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Boton getBoton() {
		return boton;
	}

	public void setBoton(Boton boton) {
		this.boton = boton;
	}

}
