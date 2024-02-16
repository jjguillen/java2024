package scotify;

import java.time.LocalDate;
import java.util.ArrayList;

public class Disco {

	protected String titulo;
	protected LocalDate fecha;
	protected Autor autor;
	protected String discografica;
	protected ArrayList<Cancion> canciones;
	
	public Disco(String titulo, LocalDate fecha, Autor autor, String discografica, ArrayList<Cancion> canciones) {
		super();
		this.titulo = titulo;
		this.fecha = fecha;
		this.autor = autor;
		this.discografica = discografica;
		this.canciones = canciones;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the autor
	 */
	public Autor getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	/**
	 * @return the discografica
	 */
	public String getDiscografica() {
		return discografica;
	}

	/**
	 * @param discografica the discografica to set
	 */
	public void setDiscografica(String discografica) {
		this.discografica = discografica;
	}

	/**
	 * @return the canciones
	 */
	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disco [titulo=");
		builder.append(titulo);
		builder.append(", fecha=");
		builder.append(fecha);
		builder.append(", autor=");
		builder.append(autor);
		builder.append(", discografica=");
		builder.append(discografica);
		builder.append(", canciones=");
		builder.append(canciones);
		builder.append("]");
		return builder.toString();
	}
	
	public void addCancion(Cancion a) {
		//Añadimos el disco a la canción
		a.setDisco(this);
		//Añadimos la canción a la lista que tiene el disco
		this.canciones.add(a);
	}
	
	public void delCancion(Cancion a) {
		this.canciones.remove(a);
	}
	
	public long getDuracion() {
		long duracion=0;
		for(Cancion c: canciones) {
			duracion += c.getDuracion();
		}
		return duracion;
	}
	
	
}
