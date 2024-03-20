package tema7_parte1.nba;

public class Main {

    public static void main(String[] args) {
        Jugador j1 = new Jugador("j1", 201d);
        Jugador j2 = new Jugador("j2", 211d);
        Jugador j3 = new Jugador("j3", 210d);
        Jugador j4 = new Jugador("j4", 205d);

        Equipo e1 = new Equipo();
        e1.addJugador(j1);
        e1.addJugador(j2);

        Equipo e2 = new Equipo();
        e2.addJugador(j3);
        e2.addJugador(j4);

        NBA nba = new NBA();
        nba.addEquipo("equipo1", e1);
        nba.addEquipo("equipo2", e2);

        System.out.println(nba.buscarMasAlto1().getAltura());
        System.out.println(nba.buscarMasAlto2().getAltura());
        System.out.println(nba.buscarMasAlto3().getAltura());
        System.out.println(nba.buscarMasAlto4().getAltura());
        System.out.println(nba.buscarMasAlto6().getNombre());




    }
}
