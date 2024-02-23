package tema6.src.menu.dominio;

public abstract class Comida extends Ingrediente {

	//Atributos	
	protected boolean cocinado;
	
	//Constructor
	public Comida() {
		
		this.setTipoIngrediente("Comida");
		this.cocinado = false;
	}
	
}