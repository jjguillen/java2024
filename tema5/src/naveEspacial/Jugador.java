package naveEspacial;

import java.util.Objects;

public class Jugador extends Personaje implements Equipable, Comparable<Jugador> {

    public enum Clase {PILOTO, ASTRONAUTA, SOLDADO}
    private Arma armaDerecha;
    private Clase clase;


    public Jugador(String nombre, Arma armaDerecha, int salud, Clase clase) {
        super(nombre, salud);
        this.armaDerecha = armaDerecha;
        this.clase = clase;
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
        sb.append(", salud=").append(salud);
        sb.append('}');
        return sb.toString();
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
