package ejerciciosintroPOO;

import ejerciciosintroPOO.Jugador;

public class Test {

    public static void main(String[] args) {
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();

        System.out.println(j1);
        System.out.println(j2);

        j1.setNombre("Conan");
        j1.setNivel(99);
        j1.setSalud(1450);

        j1.tomarPocion(100);

        System.out.println(j1);

        j2.atacar(100, j1);

        System.out.println(j1);




    }
}
