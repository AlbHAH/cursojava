package EjercicioManiqui;

public class Vestido {

	private String color;
	private String talla;
	private int precio;

	public Vestido(String color, String talla, int precio) {
		super();
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

}
