package examen2023.entities;

import java.time.LocalDate;

public class Reserva implements Comparable<Reserva> {

    private static Long numero=1L;

    private Long id;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private Integer cantidadHabitaciones;
    private Integer numPersonasPorHabitacion;
    private String dni;
    private String nacionalidad;
    private Hotel hotel;

    public Reserva(LocalDate fechaEntrada, LocalDate fechaSalida, Integer cantidadHabitaciones,
                   Integer numPersonasPorHabitacion, String dni, String nacionalidad, Hotel hotel) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numPersonasPorHabitacion = numPersonasPorHabitacion;
        this.dni = dni;
        this.nacionalidad = nacionalidad;
        this.hotel = hotel;
        this.id = Reserva.numero++;
    }

    public static Long getNumero() {
        return numero;
    }

    public static void setNumero(Long numero) {
        Reserva.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getNumPersonasPorHabitacion() {
        return numPersonasPorHabitacion;
    }

    public void setNumPersonasPorHabitacion(Integer numPersonasPorHabitacion) {
        this.numPersonasPorHabitacion = numPersonasPorHabitacion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reserva{");
        sb.append("id=").append(id);
        sb.append(", fechaEntrada=").append(fechaEntrada);
        sb.append(", fechaSalida=").append(fechaSalida);
        sb.append(", cantidadHabitaciones=").append(cantidadHabitaciones);
        sb.append(", numPersonasPorHabitacion=").append(numPersonasPorHabitacion);
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", nacionalidad='").append(nacionalidad).append('\'');
        sb.append(", hotel=").append(hotel);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reserva reserva = (Reserva) o;
        return id.equals(reserva.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public int compareTo(Reserva o) {
        return this.getFechaEntrada().compareTo(o.getFechaEntrada());
    }
}
