package tema6.src.menu.dominio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hamburguesa extends Comida {

	//Atributos
	private Date fechaCaducidad;
	
	//Constructor
	public Hamburguesa(String fecha) {
		super();
		this.setNombre("Hamburguesa");

		//Pasar de String a Date
		
		//Indicar el formato de la fecha
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			//Pasar de texto a fecha
			this.fechaCaducidad = formatoDelTexto.parse( fecha );

		} catch (ParseException e) {
			this.fechaCaducidad = null;
		}
	}

	//Métodos
	public void cocinar() {
		this.cocinado = true;
	}
	
	@Override
	public double obtenerPrecio() {

		double precioBurguer = 3.50;
		
		int diasParaCaducar = diasParaCaducar();		
		
		switch (diasParaCaducar) {
		case 1: precioBurguer *= 0.5; break;
		case 2: precioBurguer *= 0.6; break;
		case 3: precioBurguer *= 0.7; break;
		case 4: precioBurguer *= 0.8; break;
		}
		
		return precioBurguer;
	}

	private int diasParaCaducar() {

		Date ahora = new Date();

		//Calcular la diferencia
		long diferencia = this.fechaCaducidad.getTime() - ahora.getTime();

		//Pasar de milisegundos a dias
		diferencia = diferencia/(1000 * 60 * 60 * 24);

		return (int) diferencia;
	}
	
}