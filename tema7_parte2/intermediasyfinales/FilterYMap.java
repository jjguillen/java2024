package tema7_parte2.intermediasyfinales;

import java.util.Optional;
import java.util.stream.Stream;

public class FilterYMap {
    public static void main(String[] args) {

        Jugador j1 = new Jugador("j1", 2.03);
        Jugador j2 = new Jugador("j2", 1.93);
        Jugador j3 = new Jugador("j3", 2.13);
        Jugador j4 = new Jugador("j4", 2.07);
        Jugador j5 = new Jugador("j5", 1.95);
        Jugador j6 = new Jugador("j6", 2.05);

        Stream.of(j1,j2,j3,j4,j5,j6)
                .filter( j -> j.getAltura() > 2.00)
                .map( j -> j.getAltura())
                .forEach(System.out::println);

        //Optional es un tipo de objeto que puede tener algo o no
        Optional<Double> sumaAltura = Stream.of(j1,j2,j3,j4,j5,j6)
                .filter( j -> j.getAltura() > 2.00)
                .map( j -> j.getAltura())
                .reduce(Double::sum);

        //Preguntamos si el optional tiene algo. Con get() nos devuelve lo que hay en el Optional
        //if (sumaAltura.isPresent())
            System.out.println(sumaAltura.get() /
                    Stream.of(j1,j2,j3,j4,j5,j6)
                        .filter( j -> j.getAltura() > 2.00).count());

        Stream.of(j1,j2,j3,j4,j5,j6)
                .filter( j -> j.getAltura() > 2.00)
                .map( j -> j.getAltura())
                .filter( a -> a > 2.07)
                .forEach(System.out::println);

        //Sacar los nombres en mayúsculas
        Stream.of(j1,j2,j3,j4,j5,j6)
                .map(j -> j.getNombre() )
                .map(j -> j.toUpperCase() )
                .forEach(System.out::println);

    }

}
