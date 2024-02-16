package biblioteca;

public class Libro extends Documento {

	private int anioPublicacion;

	public Libro(String titulo, String isbn, int numPaginas, int anio) {
		super(titulo, isbn, numPaginas);
		this.anioPublicacion = anio;
	}

	/**
	 * @return the anioPublicacion
	 */
	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Libro{");
		sb.append("anioPublicacion=").append(anioPublicacion);
		sb.append(", titulo='").append(titulo).append('\'');
		sb.append(", isbn='").append(isbn).append('\'');
		sb.append(", prestadoA=").append(prestadoA);
		sb.append(", fechaDePrestamo=").append(fechaDePrestamo);
		sb.append(", numPaginas=").append(numPaginas);
		sb.append('}');
		return sb.toString();
	}
}
