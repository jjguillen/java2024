package examen2024.entities;

import java.time.LocalDate;

public class TicketSoporte implements Comparable<TicketSoporte>{

    public enum Estado {ABIERTO, ENPROCESO, RESUELTO}

    private Long id;
    private LocalDate fechaCreacion;
    private LocalDate fechaFinalizacion;
    private Estado estado;
    private Integer prioridad;
    private Usuario usuario;
    private Tecnico tecnico;
    private String comentarios;


    public TicketSoporte(Long id, LocalDate fechaCreacion, LocalDate fechaFinalizacion, Estado estado, Integer prioridad, Usuario usuario, Tecnico tecnico, String comentarios) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.usuario = usuario;
        this.tecnico = tecnico;
        this.comentarios = comentarios;
    }

    public TicketSoporte(LocalDate fechaCreacion, LocalDate fechaFinalizacion, Estado estado, Integer prioridad, Usuario usuario, Tecnico tecnico, String comentarios) {
        this.fechaCreacion = fechaCreacion;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.usuario = usuario;
        this.tecnico = tecnico;
        this.comentarios = comentarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "TicketSoporte{" +
                "id=" + id +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaFinalizacion=" + fechaFinalizacion +
                ", estado=" + estado +
                ", prioridad=" + prioridad +
                ", usuario=" + usuario +
                ", tecnico=" + tecnico +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }

    @Override
    public int compareTo(TicketSoporte o) {
        return this.getFechaCreacion().compareTo(o.getFechaCreacion());
    }
}
