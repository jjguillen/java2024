package Monopoly.src.main;

import Monopoly.src.casillas.Propiedad;
import Monopoly.src.juego.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Juego juego = new Juego();

        System.out.println( "BIENVENIDO A MONOPOLY JAVA");
        //System.out.println(juego.getTablero());

        for(int i=1; i<=4; i++){
            System.out.println("Dime nombre jugador " + i);
            juego.addJugador(new Jugador(sc.nextLine(), juego.getTablero().buscarCasilla(1)));
        }

        juego.pintarJuego();

        while(true) {
            //Comprobar ganador
            if (juego.getJugadores().size() == 1) {
                System.out.println("Enhorabuena, eres el ganador " + juego.getJugadores().get(0).getNombre());
                break;
            }

            //Eliminar propietario de las casillas con jugadores sin dinero
            for(Jugador j: juego.getJugadores()) {
                if (j.getDinero() <=0 ) {
                    for(Propiedad p: j.getPropiedadesCompradas()) {
                        p.setPropietario(null);
                    }
                }
            }
            //Eliminar jugadores sin dinero
            juego.getJugadores().removeIf(j -> j.getDinero() <= 0);

            //Mover jugadores
            for(Jugador jugador: juego.getJugadores()) {
                //Antes de mover comprobar que no estás en la cárcel

                //Mover jugador
                juego.moverJugador(jugador, juego.tirarDados());

                System.out.println("El jugador " + jugador.getNombre() + " se mueve a la casilla " +
                        jugador.getCasillaActual().getNumero());
                System.out.println(jugador.getCasillaActual().accion(jugador));
                System.out.println();

                System.out.println("Pulsa enter para continuar");
                sc.nextLine();
            }

            //Pintar estado
            juego.pintarJuego();
        }


    }
}
