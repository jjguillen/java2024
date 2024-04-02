package tema7_parte2.groupingBy;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
       Jugador j1 = new Jugador("j1", 2.03, "España");
       Jugador j2 = new Jugador("j2", 1.93, "España");
       Jugador j3 = new Jugador("j3", 2.13, "EEUU");
       Jugador j4 = new Jugador("j4", 2.07, "EEUU");
       Jugador j5 = new Jugador("j5", 1.95, "España");
       Jugador j6 = new Jugador("j6", 2.05, "EEUU");

       ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
       jugadores.add(j1);
       jugadores.add(j2);
       jugadores.add(j3);
       jugadores.add(j5);
       jugadores.add(j4);
       jugadores.add(j6);

       Map<String, List<Jugador>> jugadorPorPais = jugadores.stream()
               .collect(Collectors.groupingBy(Jugador::getPais));

       jugadorPorPais.forEach( (k,v) -> {
             System.out.println("Pais: " + k + " ------------------------");
             v.forEach( j -> System.out.println(j.getNombre())
            );
       });


    }
}
