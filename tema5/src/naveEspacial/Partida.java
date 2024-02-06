package naveEspacial;

import java.util.ArrayList;

public class Partida {

    private ArrayList<Monstruo> monstruos;
    private Jugador jugador;

    public Partida(Jugador jugador) {
        this.jugador = jugador;
        this.monstruos = new ArrayList<>();
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public ArrayList<Monstruo> getMonstruos() {
        return monstruos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Partida{");
        sb.append("monstruos=").append(monstruos);
        sb.append(", jugador=").append(jugador);
        sb.append('}');
        return sb.toString();
    }

    public void addMonstruo(Monstruo m) {
        this.monstruos.add(m);
    }

    public void removeMonstruo(Monstruo m) {
        this.monstruos.remove(m);
    }
}
