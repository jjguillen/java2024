package naveEspacial;

import java.util.Objects;

public class Jugador implements Equipable, Comparable<Jugador> {

    private String nombre;
    private Arma armaDerecha;

    public Jugador() {
    }

    public Jugador(String nombre, Arma armaDerecha) {
        this.nombre = nombre;
        this.armaDerecha = armaDerecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Arma getArmaDerecha() {
        return armaDerecha;
    }

    public void setArmaDerecha(Arma armaDerecha) {
        this.armaDerecha = armaDerecha;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", armaDerecha=").append(armaDerecha);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(nombre, jugador.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }


    @Override
    public boolean equipar(Arma arma) {
        //El código para equipar un arma


        return false;
    }

    @Override
    public int compareTo(Jugador o) {
        return this.nombre.compareTo(o.nombre);
    }
}
