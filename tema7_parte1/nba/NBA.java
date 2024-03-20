package tema7_parte1.nba;

import java.util.*;

public class NBA {

    private HashMap<String,Equipo> equipos = new HashMap<String,Equipo>();

    public void addEquipo(String name,Equipo equipo) {
        equipos.put(name,equipo);
    }

    public Jugador buscarMasAlto1() {
        Jugador jAlto = null;
        double altura = 0;
        for(String equipo : equipos.keySet()) {
            for(Jugador jugador : equipos.get(equipo).getJugadores()) {
                if (jugador.getAltura() > altura) {
                    altura = jugador.getAltura();
                    jAlto = jugador;
                }
            }
        }
        return jAlto;
    }

    public Jugador buscarMasAlto2() {
        List<Jugador> jugadores = new ArrayList<>();

        //METEMOS EN UNA LISTA TODOS LOS JUGADORES
        for(String equipo : equipos.keySet()) {
            jugadores.addAll(equipos.get(equipo).getJugadores());
        }

        //ORDENAMOS LA LISTA POR ALTURA
        Collections.sort(jugadores, new Comparator<Jugador> () {
            @Override
            public int compare(Jugador o1, Jugador o2) {
                return o2.getAltura().compareTo(o1.getAltura());
            }
        });

       return jugadores.get(0);
    }

    public Jugador buscarMasAlto3() {
        Jugador jAlto=null;
        Set<Jugador> jugadores = new TreeSet<>( (j1,j2) -> j2.getAltura().compareTo(j1.getAltura() ));

        //METEMOS EN UNA LISTA TODOS LOS JUGADORES
        for (String equipo : equipos.keySet()) {
            jugadores.addAll(equipos.get(equipo).getJugadores());
        }

        for(Jugador jugador: jugadores) {
            jAlto = jugador;
            break;
        }

        return jAlto;
    }


    public Jugador buscarMasAlto4() {
        List<Jugador> jugadores = new ArrayList<>();

        //METEMOS EN UNA LISTA TODOS LOS JUGADORES
        for(String equipo : equipos.keySet()) {
            jugadores.addAll(equipos.get(equipo).getJugadores());
        }

        return jugadores.stream()
                .sorted()
                .limit(1)
                .findFirst()
                .get();
    }

    //INTENTAR EVITAR
    public Jugador buscarMasAlto5() {
        final double[] altura = {0};
        final Jugador[] jAlto = {null};

        this.equipos.values().forEach( equipo -> {
            equipo.getJugadores().forEach( jugador -> {
                if (jugador.getAltura() > altura[0]) {
                    altura[0] = jugador.getAltura();
                    jAlto[0] = jugador;
                }
            });
        });
        return jAlto[0];

    }

    public Jugador buscarMasAlto6() {
        return this.equipos.values().stream() //Stream<Equipo>
                .flatMap( equipo -> equipo.getJugadores().stream()) //Stream<Jugador>
                .sorted( (j1,j2) -> j2.getNombre().compareTo(j1.getNombre()))
                .limit(1)
                .findFirst()
                .get();
    }

    public Jugador buscarMasAlto7() {
        return this.equipos.values().stream() //Stream<Equipo>
                .flatMap( equipo -> equipo.getJugadores().stream()) //Stream<Jugador>
                .max(Comparator.comparing(Jugador::getAltura))
                .get();
    }

}
