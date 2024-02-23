package Monopoly.src.casillas;

import Monopoly.src.juego.Jugador;

public class Impuesto extends CasillaEspecial {

    public Impuesto(int numero, String nombre, int cantidad) {
        super(numero, nombre, cantidad);
    }

    @Override
    public String accion(Jugador jugador) {
        jugador.pagar(this.getCantidad());
        return "Te toca pagar el impuesto " + this.getNombre();
    }
}
