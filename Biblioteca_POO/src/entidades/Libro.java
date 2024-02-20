package entidades;

import java.time.LocalDate;

public class Libro extends Documento {

    private Integer yearPublicacion;

    public Libro(Long id, String isbn, String titulo, Integer numPaginas, Integer yearPublicacion) {
        super(id, isbn, titulo, numPaginas);
        this.yearPublicacion = yearPublicacion;
    }

    public Libro(Long id, String isbn, String titulo, Usuario prestadoA, LocalDate fechaPrestamo, Integer numPaginas, Integer yearPublicacion) {
        super(id, isbn, titulo, prestadoA, fechaPrestamo, numPaginas);
        this.yearPublicacion = yearPublicacion;
    }

    public Integer getYearPublicacion() {
        return yearPublicacion;
    }

    public void setYearPublicacion(Integer yearPublicacion) {
        this.yearPublicacion = yearPublicacion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Libro{");
        sb.append("id=").append(id);
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", prestadoA=").append(prestadoA);
        sb.append(", fechaPrestamo=").append(fechaPrestamo);
        sb.append(", numPaginas=").append(numPaginas);
        sb.append(", yearPublicacion=").append(yearPublicacion);
        sb.append('}');
        return sb.toString();
    }


}


