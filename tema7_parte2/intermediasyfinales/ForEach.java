package tema7_parte2.intermediasyfinales;

import java.util.stream.Stream;

public class ForEach {

    public static void main(String[] args) {

        Jugador j1 = new Jugador("j1", 2.03);
        Jugador j2 = new Jugador("j2", 1.93);
        Jugador j3 = new Jugador("j3", 2.13);
        Jugador j4 = new Jugador("j4", 2.07);
        Jugador j5 = new Jugador("j5", 1.95);
        Jugador j6 = new Jugador("j6", 2.05);

        Stream.of(j1,j2,j3,j4,j5,j6)
                .forEach(System.out::println);

        Stream.of(j1,j2,j3,j4,j5,j6)
                .forEach( j -> {
                    int num=5;
                    System.out.println(j.getAltura()+num);
                });



    }
}
