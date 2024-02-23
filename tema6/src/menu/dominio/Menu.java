package tema6.src.menu.dominio;

import java.util.ArrayList;

public class Menu {

	//Atributos
	public static int numeroMenus;
	
	private int numeroIngredientes;		
	private ArrayList<Ingrediente> listaIngredientes;

	//Constructor
	public Menu() {
		listaIngredientes = new ArrayList<Ingrediente>();
		numeroMenus++;		
	}

	//Métodos
	public int getNumeroIngredientes() {
		return this.numeroIngredientes;
	}
	
	public void anyadirBebida(Bebida b) {
		listaIngredientes.add(b);
		numeroIngredientes++;
	}

	public void anyadirComida(Comida c) {
		
		listaIngredientes.add(c);
		numeroIngredientes++;
	}

	public double obtenerPrecioMenu() {

		double precioTotal = 0.0;
		
		for (int i = 0; i < this.listaIngredientes.size(); i++) {
		
			Ingrediente in = this.listaIngredientes.get(i);
			
			precioTotal += in.obtenerPrecio();			
		}

		return precioTotal;
	}
	
	public void imprimirMenu() {
		
		for (int i = 0; i < this.listaIngredientes.size(); i++) {
			
			System.out.println( this.listaIngredientes.get(i) );			
		}		
	}

}