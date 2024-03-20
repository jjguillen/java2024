package tema7_parte1.nba;

import java.util.HashSet;

public class Equipo {

    private HashSet<Jugador> jugadores = new HashSet<Jugador>();

    public void addJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public HashSet<Jugador> getJugadores() {
        return jugadores;
    }
}
