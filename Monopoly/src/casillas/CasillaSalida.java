package Monopoly.src.casillas;


import Monopoly.src.juego.Jugador;

public class CasillaSalida extends Casilla{

    public CasillaSalida(int numero, String nombre) {
        super(numero, nombre);
    }

    @Override
    public String accion(Jugador jugador) {
        //Cobrar 40000 si no lo has cobrado
        return "Estás en la salida, ahora te pago los 20000€";
    }
}
