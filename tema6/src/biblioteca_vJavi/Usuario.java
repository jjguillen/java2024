package biblioteca_vJavi;

import java.util.ArrayList;
import java.util.Objects;

public class Usuario {

	protected String dni;
	protected String nombre;
	protected int limitePrestamos;
	protected int limitePlazoPrestamos;
	protected ArrayList<Documento> prestados;
	
	
	public Usuario(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.limitePrestamos = 5; //5 libros prestados a la vez como máximo
		this.limitePlazoPrestamos = 60; //60 días como máximo para devolverlo
		this.prestados = new ArrayList<>();
	}


	public Usuario(String dni, String nombre, int limitePrestamos, int limitePlazoPrestamos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.limitePrestamos = limitePrestamos;
		this.limitePlazoPrestamos = limitePlazoPrestamos;
		this.prestados = new ArrayList<>();
	}


	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @return the limitePrestamos
	 */
	public int getLimitePrestamos() {
		return limitePrestamos;
	}


	/**
	 * @param limitePrestamos the limitePrestamos to set
	 */
	public void setLimitePrestamos(int limitePrestamos) {
		this.limitePrestamos = limitePrestamos;
	}


	/**
	 * @return the limitePlazoPrestamos
	 */
	public int getLimitePlazoPrestamos() {
		return limitePlazoPrestamos;
	}


	/**
	 * @param limitePlazoPrestamos the limitePlazoPrestamos to set
	 */
	public void setLimitePlazoPrestamos(int limitePlazoPrestamos) {
		this.limitePlazoPrestamos = limitePlazoPrestamos;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [dni=");
		builder.append(dni);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(dni, other.dni);
	}
	
	public void addDocumento(Documento doc) {
		prestados.add(doc);
	}
	
	public void delDocumento(Documento doc) {
		prestados.remove(doc);
	}
	
	public boolean alcanzadoLimitePrestamos() {
		if (prestados.size() == this.limitePrestamos)
			return true;
		else
			return false;
	}
	
	
	
	
}
