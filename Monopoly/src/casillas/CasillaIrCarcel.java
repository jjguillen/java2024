package Monopoly.src.casillas;

import Monopoly.src.juego.Jugador;

public class CasillaIrCarcel extends CasillaEspecial {

    private Casilla carcel;

    public CasillaIrCarcel(int numero, String nombre, int cantidad, Casilla carcel) {
        super(numero, nombre, cantidad);
        this.carcel = carcel;
    }


    @Override
    public String accion(Jugador jugador) {
        jugador.setCasillaActual(carcel);
        return "Voy de camino a la cárcel";
    }
}
