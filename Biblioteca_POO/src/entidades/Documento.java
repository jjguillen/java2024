package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Documento implements Prestable {

    protected Long id;
    protected String isbn;
    protected String titulo;
    protected Usuario prestadoA;
    protected LocalDate fechaPrestamo;
    protected Integer numPaginas;
    protected ArrayList<Autor> autores = new ArrayList<>();

    public Documento(Long id, String isbn, String titulo, Integer numPaginas) {
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.numPaginas = numPaginas;
    }

    public Documento(Long id, String isbn, String titulo, Usuario prestadoA, LocalDate fechaPrestamo, Integer numPaginas) {
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.prestadoA = prestadoA;
        this.fechaPrestamo = fechaPrestamo;
        this.numPaginas = numPaginas;
    }

    public Documento(Documento documento) {
        this.id = documento.id;
        this.isbn = documento.isbn;
        this.titulo = documento.titulo;
        this.prestadoA = documento.prestadoA;
        this.fechaPrestamo = documento.fechaPrestamo;
        this.numPaginas = documento.numPaginas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Usuario getPrestadoA() {
        return prestadoA;
    }

    public void setPrestadoA(Usuario prestadoA) {
        this.prestadoA = prestadoA;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Documento{");
        sb.append("id=").append(id);
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", prestadoA=").append(prestadoA);
        sb.append(", fechaPrestamo=").append(fechaPrestamo);
        sb.append(", numPaginas=").append(numPaginas);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Documento documento = (Documento) o;

        return Objects.equals(id, documento.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public void prestaAUsuario(Usuario user) {
        this.prestadoA = user;
        //Tengo que añadir el documento a la lista de prestados del usuario
        user.addDocumento(this);
    }

    @Override
    public void devuelve(Usuario user) {
        this.prestadoA = null;
        //Tengo que eliminar el documento de la lista de prestados del usuario
        user.delDocumento(this);
    }

    @Override
    public boolean estaPrestado() {
        if (this.prestadoA == null)
            return false;
        else
            return true;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void addAutor(Autor autor) {
        this.autores.add(autor);
    }

    public void delAutor(Autor autor) {
        this.autores.remove(autor);
    }
}
