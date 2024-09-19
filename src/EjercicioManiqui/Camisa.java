package EjercicioManiqui;

public class Camisa {

	private String color;
	private String talla;
	private int precio;
	Boton[] botones = {};

	public Camisa(String color, String talla, int precio, Boton[] botones) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.botones = botones;
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

	public Boton[] getBotones() {
		return botones;
	}

	public void setBotones(Boton[] botones) {
		this.botones = botones;
	}

}
