package juego;

import casillas.Casilla;
import casillas.Propiedad;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Tablero tablero; //Casillas del 1 al 39
    //private ArrayList<Carta>;  //Más adelante


    public Juego() {
        this.tablero = new Tablero();
        this.jugadores = new ArrayList<>();
    }

    public void addJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void pintarJuego() {
        System.out.println();
        for(Jugador jugador :jugadores) {
            System.out.println("Jugador: " + jugador.getNombre() + " - Casilla: " + jugador.getCasillaActual().getNumero()
                    + " - Dinero: " + jugador.getDinero());
            System.out.println("Propiedades compradas: ------------------------");
            for(Propiedad propiedad: jugador.getPropiedadesCompradas()) {
                System.out.println("    - " + propiedad.getNombre());
            }
            System.out.println("---------------------------------------------------------------");
        }
    }

    private static int generarNumero(int min, int max)  {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }

    public int tirarDados() {
        return generarNumero(2, 12);
    }

    /**
     * Comprobamos que no de la vuelta al tablero. Si da restamos 40 a la suma de la casilla
     * actual y la tirada, y nos da la nueva casilla. Cobra 40000
     * En cualquier caso al jugador le ponemos la nueva casilla.
     * @param jugador
     * @param numeroCasillas
     */
    public int moverJugador(Jugador jugador, int numeroCasillas) {
        //Si un jugador se queda sin dinero lo retiramos del juego antes de mover
        if (jugador.getDinero() <= 0) {
            //this.jugadores.remove(jugador);
            return -1;
        }

        int numCasillaActual = jugador.getCasillaActual().getNumero();
        if (numCasillaActual + numeroCasillas > 39) {
            numCasillaActual = numCasillaActual + numeroCasillas - 40;
            jugador.cobrar(40000);
        } else {
            numCasillaActual += numeroCasillas;
        }

        Casilla casilla = this.tablero.buscarCasilla(numCasillaActual);
        jugador.setCasillaActual(casilla);
        return 0;
    }

}
