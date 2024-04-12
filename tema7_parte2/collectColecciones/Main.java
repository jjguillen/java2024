package tema7_parte2.collectColecciones;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
       Jugador j1 = new Jugador("j1", 2.03);
       Jugador j2 = new Jugador("j2", 1.93);
       Jugador j3 = new Jugador("j3", 2.13);
       Jugador j4 = new Jugador("j4", 2.07);
       Jugador j5 = new Jugador("j5", 1.95);
       Jugador j6 = new Jugador("j6", 2.05);

       ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
       jugadores.add(j1);
       jugadores.add(j2);
       jugadores.add(j3);
       jugadores.add(j5);
       jugadores.add(j4);
       jugadores.add(j6);

       //Lo pasa a una lista inmutable
       List<Jugador> jugadores2 = jugadores.stream()
               .sorted(Comparator.comparing(Jugador::getAltura))
               .toList();
       //jugadores2.add(j2); //No se puede hacer
       System.out.println(jugadores2);

       //Lo pasa a una lista mutable
       List<Jugador> jugadores3 = jugadores.stream()
                .sorted(Comparator.comparing(Jugador::getAltura))
                .collect(Collectors.toList());
       jugadores3.add(j2); //No se puede hacer
       System.out.println(jugadores3);

       //Pasarlo a un set
       Set<String> jugadores4 = jugadores.stream()
               .map(Jugador::getNombre)
               .collect(Collectors.toSet());
       System.out.println(jugadores4);

       //Pasarlo a un map string-double
        Map<String, Double> jugadores5 = jugadores.stream()
                .collect(Collectors.toMap(Jugador::getNombre, Jugador::getAltura));
        jugadores5.entrySet()
                .forEach( es -> System.out.println(es.getKey() + " " + es.getValue()));


        //Pasarlo a un map string-Jugador
        //Como segundo parámetro se pone j -> j, o Function.identity()
        Map<String, Jugador> jugadores6 = jugadores.stream()
                .collect(Collectors.toMap(Jugador::getNombre, Function.identity())); // j -> j
        jugadores6.entrySet()
                .forEach( es -> System.out.println(es.getKey() + " " + es.getValue()));

    }
}
