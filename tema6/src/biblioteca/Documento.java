package biblioteca;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Documento implements Prestable {

	protected String titulo;
	protected String isbn;
	protected Usuario prestadoA;
	protected LocalDate fechaDePrestamo;
	protected int numPaginas;
	protected ArrayList<Autor> autores;
	
	public Documento(String titulo, String isbn, int numPaginas) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.numPaginas = numPaginas;
		this.autores = new ArrayList<Autor>();
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @return the codigo
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @return the prestadoA
	 */
	public Usuario getPrestadoA() {
		return prestadoA;
	}
	
	public boolean estaPrestado() {
		if (this.prestadoA == null)
			return false;
		else 
			return true;
	}
	
	public void prestaAUsuario(Usuario user) {
		this.prestadoA = user;
		this.fechaDePrestamo = LocalDate.now();
	}
	
	public void devuelve() {
		this.prestadoA = null;
	}
	
	public int plazoPrestamo() {
		Duration dur = Duration.between(fechaDePrestamo, LocalDate.now());
		return (int) dur.toDays();
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public LocalDate getFechaDePrestamo() {
		return fechaDePrestamo;
	}

	public ArrayList<Autor> getAutores() {
		return autores;
	}

	public void addAutor(Autor autor) {
		//Para no añadir repetidos
		if (this.autores.indexOf(autor) < 0) {
			this.autores.add(autor);
		}
	}

	public void deleteAutor(Autor autor) {
		this.autores.remove(autor);
	}


	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Documento{");
		sb.append("titulo='").append(titulo).append('\'');
		sb.append(", isbn='").append(isbn).append('\'');
		sb.append(", prestadoA=").append(prestadoA);
		sb.append(", fechaDePrestamo=").append(fechaDePrestamo);
		sb.append(", numPaginas=").append(numPaginas);
		sb.append('}');
		return sb.toString();
	}
}
