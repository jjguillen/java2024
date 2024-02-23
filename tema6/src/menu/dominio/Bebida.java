package tema6.src.menu.dominio;

public abstract class Bebida extends Ingrediente {

	//Atributos
	private boolean refrigerada;
	
	//Constructor
	public Bebida() {
		this.refrigerada = false;
		this.setTipoIngrediente("Bebida");
	}
	
	//Métodos
	public void meterEnNevera() {
		this.refrigerada = true;
	}
	
	public void sacarDeNevera() {
		this.refrigerada = false;
	}
	
	public double obtenerPrecio() {
		
		return this.refrigerada ? 1.5 : 1;
	}
	
}