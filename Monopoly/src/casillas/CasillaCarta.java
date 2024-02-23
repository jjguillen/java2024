package Monopoly.src.casillas;

import Monopoly.src.juego.Jugador;

import java.util.ArrayList;
import java.util.Collections;

public class CasillaCarta extends Casilla {

    private ArrayList<Carta> cartas;  //Más adelante

    public CasillaCarta(int numero, String nombre, ArrayList<Carta> cartas) {
        super(numero, nombre);
        this.cartas = cartas;
    }
    @Override
    public String accion(Jugador jugador) {
        //Coger carta y hacer su acción
        Carta carta = cartas.get(0);
        jugador.setDinero(jugador.getDinero() + carta.getCantidad());
        Collections.shuffle(cartas);
        return "Te ha salido la carta:  " + carta.getTexto() + " con acción: " + carta.getCantidad() + " euros";
    }
}
