package arrayList;

import java.util.Objects;

public class Casilla {
    private int numero;
    private String texto;

    public Casilla(int numero, String texto) {
        this.numero = numero;
        this.texto = texto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Casilla{");
        sb.append("numero=").append(numero);
        sb.append(", texto='").append(texto).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casilla casilla = (Casilla) o;
        return numero == casilla.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
