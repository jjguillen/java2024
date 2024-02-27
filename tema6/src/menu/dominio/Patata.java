package tema6.src.menu.dominio;

import tema6.src.menu.interfaces.Cocinable;

public class Patata extends Comida implements Cocinable {

	//Atributos
	private int estado;
	
	//Constructor
	public Patata() {
		super();
		this.estado = CRUDA;
		this.setNombre("Patata cruda");
	}
	
	//Métodos
	
	@Override
	public void freir() {
		this.estado = FRITA;
		this.setNombre("Patatas fritas");
		this.cocinado = true;
	}

	@Override
	public void cocer() {
		this.estado = COCIDA;		
		this.setNombre("Patata cocida");
		this.cocinado = true;
	}

	@Override
	public void asar() {
		this.estado = ASADA;		
		this.setNombre("Patata asada");
		this.cocinado = true;
	}

	@Override
	public double obtenerPrecio() {

		double precio = 0.0;
		
		switch (this.estado) {
		case FRITA:  precio = 1.1; break; 
		case COCIDA: precio = 0.8; break;
		case ASADA:  precio = 0.9; break;
		}
		
		return precio;
	}

}