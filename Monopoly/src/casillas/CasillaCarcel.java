package casillas;

import juego.Jugador;
import juego.Tablero;

public class CasillaCarcel extends Casilla {

    public CasillaCarcel(int numero, String nombre) {
        super(numero, nombre);
    }


    @Override
    public String accion(Jugador jugador) {
        //Quedarte un turno o dos ???
        return "En la cárcel sigues detenido";
    }
}
