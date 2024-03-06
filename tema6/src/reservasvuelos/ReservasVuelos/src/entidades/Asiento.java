package entidades;

import java.util.Objects;

public abstract class Asiento {
    protected Long id;
    protected Double precioBase;
    protected Integer fila;
    protected String letra;
    protected TipoAsiento tipo;
    protected Pasajero pasajero;

    public Asiento(Long id, Double precioBase, Integer fila, String letra) {
        this.id = id;
        this.precioBase = precioBase;
        this.fila = fila;
        this.letra = letra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public TipoAsiento getTipo() {
        return tipo;
    }

    public void setTipo(TipoAsiento tipo) {
        this.tipo = tipo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "id=" + id +
                ", precioBase=" + precioBase +
                ", fila=" + fila +
                ", letra='" + letra + '\'' +
                ", tipo=" + tipo +
                ", pasajero=" + pasajero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asiento asiento = (Asiento) o;
        return Objects.equals(id, asiento.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * Devuelve el código del asiento formado por la fila y la letra
     * @return String
     */
    public String getCodigo() {
        return "" + this.getTipo() + this.getFila() + "-" + this.getLetra();
    }

    /**
     * Devuelve el precio base del asiento
     * @return double
     */
    public abstract double calcularPrecio();
}
