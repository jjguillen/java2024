package examen2024.io;

import examen2024.entities.Tecnico;
import examen2024.entities.TicketSoporte;
import examen2024.entities.Usuario;
import examen2024.services.ServicioSoporte;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DAOTicketsSoporte {

    public static ServicioSoporte cargarCSV() throws IOException {
        Path tecnicosFile = Paths.get(".", "examen2024", "resources", "tecnico.csv");
        Path usuariosFile = Paths.get(".", "examen2024", "resources", "usuarios.csv");
        Path ticketsFile = Paths.get(".", "examen2024", "resources", "tickets.csv");

        ServicioSoporte ss = new ServicioSoporte();

        //LEER TECNICOS
        Set<Tecnico> tecnicos = Files.lines(tecnicosFile)
                .map(linea -> {
                    String[] cad = linea.split(",");

                    return new Tecnico(Long.parseLong(cad[0]),
                            cad[1], cad[2], cad[3], cad[4],
                            Tecnico.Especialidad.valueOf(cad[5]),
                            Integer.parseInt(cad[6]));
                })
                        .collect(Collectors.toSet());

        ss.setTecnicos((HashSet<Tecnico>) tecnicos);

        //LEER USUARIOS
        Set<Usuario> usuarios = Files.lines(usuariosFile)
                .map(linea -> {
                    String[] cad = linea.split(",");

                    return new Usuario(Long.parseLong(cad[0]),
                            cad[1], cad[2], cad[3], cad[4],
                            LocalDate.parse(cad[5]));
                })
                .collect(Collectors.toSet());

        ss.setUsuarios((HashSet<Usuario>) usuarios);

        //LEER TICKETS


        return ss;
    }



}
