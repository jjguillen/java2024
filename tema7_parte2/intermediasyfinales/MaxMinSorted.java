package tema7_parte2.intermediasyfinales;

import java.util.Comparator;
import java.util.stream.Stream;

public class MaxMinSorted {

    public static void main(String[] args) {

        Jugador j1 = new Jugador("j1", 2.03);
        Jugador j2 = new Jugador("j2", 1.93);
        Jugador j3 = new Jugador("j3", 2.13);
        Jugador j4 = new Jugador("j4", 2.07);
        Jugador j5 = new Jugador("j5", 1.95);
        Jugador j6 = new Jugador("j6", 2.05);

        //Devuelve la altura máxima
        Stream.of(j1,j2,j3,j4,j5,j6)
                .map(j -> j.getAltura())
                .max( (a1,a2) -> a1.compareTo(a2) )
                .ifPresent( System.out::println );


        //Devuelve el jugador con la altura máxima
        Stream.of(j1,j2,j3,j4,j5,j6)
                .max( (ju1,ju2) -> ju1.getAltura().compareTo(ju2.getAltura()))
                .ifPresent( System.out::println );

        //Devuelve el jugador con la altura máxima
        Stream.of(j1,j2,j3,j4,j5,j6)
                .max( Comparator.comparing(Jugador::getAltura) )
                .ifPresent( System.out::println );

        //Pintar todos los jugadores ordenados por nombre descendente
        System.out.println("-------------------");
        Stream.of(j1,j2,j3,j4,j5,j6)
                .sorted( Comparator.comparing(Jugador::getNombre).reversed() )
                .forEach(System.out::println);


    }
}
