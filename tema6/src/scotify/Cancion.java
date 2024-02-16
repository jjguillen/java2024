package scotify;

public class Cancion extends Multimedia {

	enum Genero {
		ROCK, HIPHOP, TRAP, SOUL, DISCO, ELECTRONICA, POP, HEAVY_METAL
	}
	
	protected int posicion;
	protected Genero genero;
	protected Disco disco;
	
	public Cancion(String nombre, int duracion, int posicion, Genero genero) {
		super(nombre, duracion);
		this.posicion = posicion;
		this.genero = genero;
	}
	
	public Cancion(String nombre, int duracion, int posicion, Genero genero, Disco disco) {
		super(nombre, duracion);
		this.posicion = posicion;
		this.genero = genero;
		this.disco = disco;
	}

	/**
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/**
	 * @return the disco
	 */
	public Disco getDisco() {
		return disco;
	}

	/**
	 * @param disco the disco to set
	 */
	public void setDisco(Disco disco) {
		this.disco = disco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cancion [posicion=");
		builder.append(posicion);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", disco=");
		builder.append(disco);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", year=");
		builder.append(year);
		builder.append(", reproducciones=");
		builder.append(reproducciones);
		builder.append(", autores=");
		builder.append(autores);
		builder.append("]");
		return builder.toString();
	}

	
	
}
