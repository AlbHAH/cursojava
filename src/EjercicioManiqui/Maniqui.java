package EjercicioManiqui;

public class Maniqui {

	private int id;
	private Vestido vestido;
	private Pantalon pantalon;
	private Camisa camisa;

	public Maniqui(int id, Vestido vestido) {
		super();
		this.id = id;
		this.vestido = vestido;
	}

	public Maniqui(int id, Pantalon pantalon, Camisa camisa) {
		this.pantalon = pantalon;
		this.camisa = camisa;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	
	public void Desvestir() {
		this.vestido=null;
		this.camisa=null;
		this.pantalon=null;
		
	}
	
	
}
