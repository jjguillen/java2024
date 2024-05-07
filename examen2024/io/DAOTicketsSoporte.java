package examen2024.io;

import examen2024.entities.Tecnico;
import examen2024.entities.TicketSoporte;
import examen2024.entities.Usuario;
import examen2024.services.ServicioSoporte;
import tema7_parte3.ejemplobasicoficheros.models.Gamer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
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
        List<TicketSoporte> ticketsMutable = Files.lines(ticketsFile)
                .map( linea -> {
                    String[] cad = linea.split(",");

                    return new TicketSoporte(Long.parseLong(cad[0]),
                                        LocalDate.parse(cad[1]),
                                        LocalDate.parse(cad[2]),
                                        TicketSoporte.Estado.valueOf(cad[3]),
                                        Integer.parseInt(cad[4]),
                                        ss.findUsuarioById(Long.parseLong(cad[5])),
                                        ss.findTecnicoById(Long.parseLong(cad[6])),
                                        cad[7]);
                })
                .toList();  //Mutable aunque no garantizado

        //Este ArrayList ya es mutable, se puede modificar, añadir, etc.
        ArrayList<TicketSoporte> tickets = new ArrayList<>(ticketsMutable);

        ss.setTickets((ArrayList<TicketSoporte>) tickets);

        return ss;
    }

    public static void grabarCSV(ServicioSoporte ss) throws IOException {

        Path tecnicosFile = Paths.get(".", "examen2024", "resources", "tecnico.csv");
        Path usuariosFile = Paths.get(".", "examen2024", "resources", "usuarios.csv");
        Path ticketsFile = Paths.get(".", "examen2024", "resources", "tickets.csv");

        //TECNICOS ------------------------------------------------------
        BufferedWriter bw = Files.newBufferedWriter(tecnicosFile,
                StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE); //* to rewrite the file

        for(Tecnico tecnico : ss.getTecnicos()) {
            StringBuffer sb = new StringBuffer();
            sb.append(tecnico.getId()).append(",");
            sb.append(tecnico.getNombre()).append(",");
            sb.append(tecnico.getApellidos()).append(",");
            sb.append(tecnico.getEmail()).append(",");
            sb.append(tecnico.getMovil()).append(",");
            sb.append(tecnico.getEspecialidad()).append(",");
            sb.append(tecnico.getValoracion());

            bw.write(sb.toString());
            bw.newLine();
        }
        bw.close();

        //USUARIOS ------------------------------------------------------------------
        bw = Files.newBufferedWriter(usuariosFile,
                StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE); //* to rewrite the file

        for(Usuario usuario : ss.getUsuarios()) {
            StringBuffer sb = new StringBuffer();
            sb.append(usuario.getId()).append(",");
            sb.append(usuario.getNombre()).append(",");
            sb.append(usuario.getApellidos()).append(",");
            sb.append(usuario.getEmail()).append(",");
            sb.append(usuario.getMovil()).append(",");
            sb.append(usuario.getFechaAlta());

            bw.write(sb.toString());
            bw.newLine();
        }
        bw.close();


        //TICKETS ----------------------------------------------------------
        bw = Files.newBufferedWriter(ticketsFile,
                StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE); //* to rewrite the file

        for(TicketSoporte ts : ss.getTickets()) {
            StringBuffer sb = new StringBuffer();
            sb.append(ts.getId()).append(",");
            sb.append(ts.getFechaCreacion()).append(",");
            sb.append(ts.getFechaFinalizacion()).append(",");
            sb.append(ts.getEstado()).append(",");
            sb.append(ts.getPrioridad()).append(",");
            sb.append(ts.getUsuario().getId()).append(",");
            sb.append(ts.getTecnico().getId()).append(",");
            sb.append(ts.getComentarios());

            bw.write(sb.toString());
            bw.newLine();
        }
        bw.close();





    }



}
