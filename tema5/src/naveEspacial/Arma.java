package naveEspacial;

import java.util.Objects;

public class Arma {

    private String nombre;
    private Integer puntosD;
    private Boolean esTriple;

    public Arma(String nombre, int puntosD, boolean esTriple) {
        this.nombre = nombre;
        this.puntosD = puntosD;
        this.esTriple = esTriple;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(int puntosD) {
        this.puntosD = puntosD;
    }

    public boolean isEsTriple() {
        return esTriple;
    }

    public void setEsTriple(boolean esTriple) {
        this.esTriple = esTriple;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Arma{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", puntosD=").append(puntosD);
        sb.append(", esTriple=").append(esTriple);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arma arma = (Arma) o;
        return puntosD == arma.puntosD && esTriple == arma.esTriple && Objects.equals(nombre, arma.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, puntosD, esTriple);
    }
}
