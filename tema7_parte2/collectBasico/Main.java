package tema7_parte2.collectBasico;

import tema7_parte2.intermediasyfinales.Jugador;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Jugador j1 = new Jugador("j1", 2.03);
        Jugador j2 = new Jugador("j2", 1.93);
        Jugador j3 = new Jugador("j3", 2.13);
        Jugador j4 = new Jugador("j4", 2.07);
        Jugador j5 = new Jugador("j5", 1.95);
        Jugador j6 = new Jugador("j6", 2.05);

        //Altura total
        Double total = Stream.of(j1,j2,j3,j4,j5,j6)
                .collect(Collectors.summingDouble(Jugador::getAltura));
        System.out.println(total);

        Double total2 = Stream.of(j1, j2, j3, j4, j5, j6).mapToDouble(Jugador::getAltura).sum();
        System.out.println(total2);

        //Media de las alturas
        Double media = Stream.of(j1,j2,j3,j4,j5,j6)
                .collect(Collectors.averagingDouble(Jugador::getAltura));
        System.out.println(media);

        //Estadísticas: suma, total, max, min, media
        Double media2 = Stream.of(j1,j2,j3,j4,j5,j6)
                .collect(Collectors.summarizingDouble(Jugador::getAltura))
                .getAverage();
        System.out.println(media2);

        DoubleSummaryStatistics estadisticas = Stream.of(j1,j2,j3,j4,j5,j6)
                .collect(Collectors.summarizingDouble(Jugador::getAltura));

        System.out.println("Suma " + estadisticas.getSum() + " , max = " + estadisticas.getMax());

        //Concatenar todos los nombres
        String nombres = Stream.of(j1,j2,j3,j4,j5,j6)
                .map( j -> j.getNombre())
                .collect(Collectors.joining(", "));
        System.out.println(nombres);

        //Sacar el mínimo a través de un Comparator
        Double minimo = Stream.of(j1,j2,j3,j4,j5,j6)
                .collect(Collectors.minBy(Comparator.comparing(Jugador::getAltura)))
                .get()
                .getAltura();
        System.out.println(minimo);

        Double minimo2 = Stream.of(j1,j2,j3,j4,j5,j6)
                .min(Comparator.comparing(Jugador::getAltura))
                .get()
                .getAltura();
        System.out.println(minimo2);

    }
}
