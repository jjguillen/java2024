package examen2024.services;

import examen2024.entities.Tecnico;
import examen2024.entities.TicketSoporte;
import examen2024.entities.Usuario;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ServicioSoporte {

    private ArrayList<TicketSoporte> tickets;
    private HashSet<Usuario> usuarios;
    private HashSet<Tecnico> tecnicos;

    public ServicioSoporte() {
        this.tickets = new ArrayList<>();
        this.usuarios = new HashSet<>();
        this.tecnicos = new HashSet<>();
    }

    public ArrayList<TicketSoporte> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<TicketSoporte> tickets) {
        this.tickets = tickets;
    }

    public HashSet<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashSet<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public HashSet<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(HashSet<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    //////////////////////////////////////////////////////////////////////

    public void addUsuario(Usuario u) {
        this.usuarios.add(u);
    }

    public void deleteUsuario(Long id) {
        this.usuarios.removeIf(usuario -> usuario.getId() == id);
    }

    public void addTecnico(Tecnico t) {
        this.tecnicos.add(t);
    }

    public void deleteTecnico(Long id) {
        this.tecnicos.removeIf(tecnico -> tecnico.getId() == id);
    }

    public void addTicketSoporte(Long id, LocalDate fechaCreacion, LocalDate fechaFinalizacion,
                                 TicketSoporte.Estado estado, Integer prioridad,
                                 Usuario usuario, Tecnico tecnico, String comentarios) {

        TicketSoporte ts = new TicketSoporte(id, fechaCreacion, fechaFinalizacion, estado,
                prioridad, usuario, tecnico, comentarios);
        this.tickets.add(ts);
    }

    public void deleteTicketSoporte(Long id) {
        this.tickets.removeIf(ticket -> ticket.getId() == id);
    }

    public Tecnico findTecnicoById(Long id) {
        return this.tecnicos.stream()
                .filter(tecnico -> tecnico.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Usuario findUsuarioById(Long id) {
        return this.usuarios.stream()
                .filter(usuario -> usuario.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public TicketSoporte findTicketById(int id) {
        return this.tickets.stream()
                .filter(ticket -> ticket.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Tecnico> getTecnicosByEspecialidad(Tecnico.Especialidad esp) {
        return this.tecnicos.stream()
                .filter(tecnico -> tecnico.getEspecialidad().equals(esp))
                .toList();
    }

    public Map<Tecnico.Especialidad, List<Tecnico>> getTecnicosGroupByEspecialidad(){
        return this.tecnicos.stream()
                .collect(Collectors.groupingBy(Tecnico::getEspecialidad));
    }

    public List<TicketSoporte> getTicketsAbiertos() {
        return this.tickets.stream()
                .filter(ticket -> ticket.getEstado().equals(TicketSoporte.Estado.ABIERTO))
                .sorted(Comparator.comparing(TicketSoporte::getFechaCreacion).reversed())
                .toList();
    }

    public List<TicketSoporte> getTicketsCerrados() {
        return this.tickets.stream()
                .filter(ticket -> ticket.getEstado().equals(TicketSoporte.Estado.RESUELTO))
                .sorted(Comparator.comparing(TicketSoporte::getFechaFinalizacion).reversed())
                .toList();
    }

    public List<TicketSoporte> getTicketsEnProcesoTecnicoInformatico() {
        return this.tickets.stream()
                .filter(ticket -> ticket.getEstado().equals(TicketSoporte.Estado.ENPROCESO))
                .filter(ticket -> ticket.getTecnico().getEspecialidad().equals(Tecnico.Especialidad.INFORMATICA))
                .toList();
    }

    public Long getTotalTicketsResueltos(Integer prioridad) {
        return this.tickets.stream()
                .filter(ticket -> ticket.getEstado().equals(TicketSoporte.Estado.RESUELTO))
                .count();
    }

    public Set<TicketSoporte> findTicketsByEstadoAndPrioridad(TicketSoporte.Estado estado, Integer prioridad) {
        return this.tickets.stream()
                .filter(ticket -> ticket.getEstado().equals(estado))
                .filter(ticket -> ticket.getPrioridad() == prioridad)
                .collect(Collectors.toSet());
    }

    public Map<Tecnico.Especialidad, List<Tecnico>> findTecnicosInTickets() {
        return this.tickets.stream()
                .map(ticket -> ticket.getTecnico())
                .distinct()
                .collect(Collectors.groupingBy(Tecnico::getEspecialidad));
    }

    public Set<Tecnico> findTecnicosRapidos() {
        return this.tickets.stream()
                .filter(ticket -> {
                    boolean menosCinco=false;
                    Period periodo = Period.between(ticket.getFechaCreacion(),ticket.getFechaFinalizacion());
                    int dias = periodo.getDays();
                    if (periodo.isNegative()) {
                        dias = dias * -1;
                    }

                    return (dias < 5);
                })
                .map(ticket -> ticket.getTecnico())
                .distinct()
                .collect(Collectors.toSet());
    }

    public Long getTotalTicketsRetardados() {
        return this.tickets.stream()
                .filter(ticket -> ticket.getEstado().equals(TicketSoporte.Estado.RESUELTO))
                .filter(ticket -> {
                    boolean menosCinco=false;
                    Period periodo = Period.between(ticket.getFechaCreacion(),ticket.getFechaFinalizacion());
                    int dias = periodo.getDays();
                    if (periodo.isNegative()) {
                        dias = dias * -1;
                    }

                    return (dias > 7);
                })
                .count();
    }

    public Double getMediaResolucionTickets(Integer prioridad) {
        return this.tickets.stream()
                .filter(ticket -> ticket.getEstado().equals(TicketSoporte.Estado.RESUELTO))
                .filter(ticket -> ticket.getPrioridad() == prioridad)
                .mapToInt(ticket -> {
                    Period periodo = Period.between(ticket.getFechaCreacion(),ticket.getFechaFinalizacion());
                    int dias = periodo.getDays();
                    if (periodo.isNegative()) {
                        dias = dias * -1;
                    }
                    return dias;
                })
                .average()
                .orElse(-1);
    }

    public Boolean areAllTicketsFinishedLessThanTenDays() {
        return this.tickets.stream()
                .filter(ticket -> ticket.getEstado().equals(TicketSoporte.Estado.RESUELTO))
                .allMatch( ticket -> {
                    Period periodo = Period.between(ticket.getFechaCreacion(),ticket.getFechaFinalizacion());
                    int dias = periodo.getDays();
                    if (periodo.isNegative()) {
                        dias = dias * -1;
                    }

                    return dias < 10;
                });
    }

    public Optional<TicketSoporte> getFirstTicketSolvedOneDay() {
        return this.tickets.stream()
                .filter(ticket -> ticket.getEstado().equals(TicketSoporte.Estado.RESUELTO))
                .filter(ticket -> {
                    boolean menosCinco=false;
                    Period periodo = Period.between(ticket.getFechaCreacion(),ticket.getFechaFinalizacion());
                    int dias = periodo.getDays();
                    if (periodo.isNegative()) {
                        dias = dias * -1;
                    }

                    return (dias <= 1);
                })
                .findFirst();
    }

    public Map<Tecnico, Double> getMediaResolucionTicketsGroupByTecnico() {
        return this.tickets.stream()
                .filter(ticket -> ticket.getEstado().equals(TicketSoporte.Estado.RESUELTO))
                .collect(Collectors.groupingBy(TicketSoporte::getTecnico,
                        Collectors.averagingLong( ticket -> {
                            Period periodo = Period.between(ticket.getFechaCreacion(),ticket.getFechaFinalizacion());
                            int dias = periodo.getDays();
                            if (periodo.isNegative()) {
                                dias = dias * -1;
                            }
                            return dias;
                        })));
    }


}
