package casillas;

import juego.Jugador;
import juego.Tablero;

public class CasillaCarta extends Casilla {

    private Carta carta;

    public CasillaCarta(int numero, String nombre) {
        super(numero, nombre);
    }


    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    @Override
    public String accion(Jugador jugador) {
        //Coger carta y hacer su acción
        return "Coger carta";
    }
}
