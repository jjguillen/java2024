package biblioteca;

public class Revista extends Documento {

	private int numero;

	public Revista(String titulo, String isbn, int numPaginas, int numero) {
		super(titulo, isbn, numPaginas);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Revista{");
		sb.append("numero=").append(numero);
		sb.append(", titulo='").append(titulo).append('\'');
		sb.append(", isbn='").append(isbn).append('\'');
		sb.append(", prestadoA=").append(prestadoA);
		sb.append(", fechaDePrestamo=").append(fechaDePrestamo);
		sb.append(", numPaginas=").append(numPaginas);
		sb.append('}');
		return sb.toString();
	}
}
