package tema7_parte2.intermediasyfinales;

import java.util.stream.Stream;

public class FindMatch {

    public static void main(String[] args) {

        Jugador j1 = new Jugador("j1", 2.03);
        Jugador j2 = new Jugador("j2", 1.93);
        Jugador j3 = new Jugador("j3", 2.13);
        Jugador j4 = new Jugador("j4", 2.07);
        Jugador j5 = new Jugador("j5", 1.95);
        Jugador j6 = new Jugador("j6", 2.12);

        boolean masDeDosDiez = Stream.of(j1,j2,j3,j4,j5,j6)
                .anyMatch( j -> j.getAltura() > 2.10);
        System.out.println(masDeDosDiez);

        boolean masDeUnoNoventa = Stream.of(j1,j2,j3,j4,j5,j6)
                .allMatch( j -> j.getAltura() > 1.90);
        System.out.println(masDeUnoNoventa);

        boolean masDeDosVeinte = Stream.of(j1,j2,j3,j4,j5,j6)
                .noneMatch( j -> j.getAltura() > 2.20);
        System.out.println(masDeDosVeinte);

        Stream.of(j1,j2,j3,j4,j5,j6)
                .filter( j ->j.getAltura() > 2.10)
                .findAny()
                .ifPresent( System.out::println );

        System.out.println( Stream.of(j1,j2,j3,j4,j5,j6)
                .filter( j ->j.getAltura() > 2.10)
                .findAny()
                .get() );

        Stream.of(j1,j2,j3,j4,j5,j6)
                .filter( j ->j.getAltura() > 2.02)
                .findFirst()
                .ifPresent( System.out::println );


    }


}
