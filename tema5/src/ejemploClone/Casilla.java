package ejemploClone;

import java.util.Objects;

public class Casilla implements Cloneable {

    private int numero;
    private String nombre;
    private double precio;
    private double alquiler;

    public Casilla(int numero, String nombre, double precio, double alquiler) {
        this.numero = numero;
        this.nombre = nombre;
        this.precio = precio;
        this.alquiler = alquiler;
    }

    /*
    Constructor copia
     */
    public Casilla(Casilla otro) {
        this.numero = otro.numero;
        this.nombre = otro.nombre;
        this.precio = otro.precio;
        this.alquiler = otro.alquiler;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(double alquiler) {
        this.alquiler = alquiler;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Casilla{");
        sb.append("numero=").append(numero);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", alquiler=").append(alquiler);
        sb.append('}');
        return sb.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casilla casilla = (Casilla) o;
        return numero == casilla.numero && Double.compare(precio, casilla.precio) == 0 && Double.compare(alquiler, casilla.alquiler) == 0 && Objects.equals(nombre, casilla.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, nombre, precio, alquiler);
    }

    /**
     * No utilizar
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Antes de borrarse");
    }
}
