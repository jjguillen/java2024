package tema6.src.menu.dominio;

public abstract class Ingrediente {

	//Atributos
	private String nombre;
	private String tipoIngrediente;	 
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoIngrediente() {
		return tipoIngrediente;
	}	
	public void setTipoIngrediente(String tipoIngrediente) {
		this.tipoIngrediente = tipoIngrediente;
	}
	
	//Métodos abstractos
	public abstract double obtenerPrecio();

	@Override
	public String toString() {

		String textoIngrediente = String.format("%-22s", this.getNombre()).replace(' ','.'); 
		String textoPrecio      = String.format(" %3.2f€", this.obtenerPrecio());
		
		return textoIngrediente + textoPrecio;		
	}
	
}