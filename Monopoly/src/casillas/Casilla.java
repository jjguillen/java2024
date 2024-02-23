package casillas;

import juego.Jugador;
import juego.Tablero;

public abstract class Casilla {

    protected int numero;
    protected String nombre;

    public Casilla(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Casilla casilla = (Casilla) object;

        return numero == casilla.numero;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numero;
        return result;
    }

    @Override
    public java.lang.String toString() {
        final java.lang.StringBuffer sb = new java.lang.StringBuffer("Casilla{");
        sb.append("numero=").append(numero);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }

    public abstract String accion(Jugador jugador);
}
