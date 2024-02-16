package scotify;

import java.util.ArrayList;
import java.util.Objects;

public class Multimedia {
	protected String nombre;
	protected int duracion;
	protected int year;
	protected long reproducciones;
	protected ArrayList<Autor> autores;
	
	public Multimedia(String nombre, int duracion) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.reproducciones = 0;
		this.autores = new ArrayList<>();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the reproducciones
	 */
	public long getReproducciones() {
		return reproducciones;
	}

	/**
	 * @param reproducciones the reproducciones to set
	 */
	public void setReproducciones(long reproducciones) {
		this.reproducciones = reproducciones;
	}

	/**
	 * @return the autores
	 */
	public ArrayList<Autor> getAutores() {
		return autores;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Multimedia [nombre=");
		builder.append(nombre);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", autores=");
		builder.append(autores);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(duracion, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		return duracion == other.duracion && Objects.equals(nombre, other.nombre);
	}
	
	public void addAutor(Autor a) {
		this.autores.add(a);
	}
	
	public void delAutor(Autor a) {
		this.autores.remove(a);
	}
	
	public void reproducir() {
		this.reproducciones++;
		System.out.println("Reproduciendo "+this.nombre);
	}
	
	
	
}
