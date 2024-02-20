package entidades;

import java.time.LocalDate;

public class Revista extends Documento {

    private Integer numero;
    private String tituloNumero;

    public Revista(Long id, String isbn, String titulo, Integer numPaginas, Integer numero,
                   String tituloNumero) {
        super(id, isbn, titulo, numPaginas);
        this.numero = numero;
        this.tituloNumero = tituloNumero;
    }

    public Revista(Long id, String isbn, String titulo, Usuario prestadoA, LocalDate fechaPrestamo,
                   Integer numPaginas, Integer numero, String tituloNumero) {
        super(id, isbn, titulo, prestadoA, fechaPrestamo, numPaginas);
        this.numero = numero;
        this.tituloNumero = tituloNumero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTituloNumero() {
        return tituloNumero;
    }

    public void setTituloNumero(String tituloNumero) {
        this.tituloNumero = tituloNumero;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Revista{");
        sb.append("id=").append(id);
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", prestadoA=").append(prestadoA);
        sb.append(", fechaPrestamo=").append(fechaPrestamo);
        sb.append(", numPaginas=").append(numPaginas);
        sb.append(", numero=").append(numero);
        sb.append(", tituloNumero='").append(tituloNumero).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
