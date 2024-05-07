package examen2024.app;

import examen2024.entities.Tecnico;
import examen2024.entities.Usuario;
import examen2024.io.DAOTicketsSoporte;
import examen2024.services.ServicioSoporte;

import java.io.IOException;
import java.util.Comparator;

public class App {

    public static void main(String[] args) throws IOException {

        ServicioSoporte ss = DAOTicketsSoporte.cargarCSV();

        ss.getTecnicos().stream()
                .sorted(Comparator.comparing(Tecnico::getId))
                .forEach(System.out::println);

        ss.getUsuarios().stream()
                .sorted(Comparator.comparing(Usuario::getId))
                .forEach(System.out::println);

        ss.getTicketsAbiertos()
                .forEach(System.out::println);

        ss.getMediaResolucionTicketsGroupByTecnico()
                .forEach( (k,v) -> System.out.println( k.getNombre() + " - " + v));


        System.out.println(ss.getFirstTicketSolvedOneDay().orElse(null));
        System.out.println(ss.getMediaResolucionTickets(2));

        ss.findTecnicosRapidos().forEach(System.out::println);

        System.out.println(ss.getTotalTicketsResueltos(3));

        ss.findTecnicosInTickets().forEach( (k,v) -> {
            System.out.println(k + "---------------");
            v.forEach( x -> System.out.println(x.getNombre()));
        });

        ss.deleteUsuario(99L); //Borramos usuario y sus tickets y grabamos a ver si lo hace
        DAOTicketsSoporte.grabarCSV(ss);


    }
}
