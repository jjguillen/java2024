package scotify;

public class Autor {
	protected String nombre;
	protected String informacion;
	
	public Autor(String nombre, String informacion) {
		super();
		this.nombre = nombre;
		this.informacion = informacion;
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
	 * @return the informacion
	 */
	public String getInformacion() {
		return informacion;
	}

	/**
	 * @param informacion the informacion to set
	 */
	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autor [nombre=");
		builder.append(nombre);
		builder.append(", informacion=");
		builder.append(informacion);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
