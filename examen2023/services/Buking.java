package examen2023.services;

import examen2023.entities.Hotel;
import examen2023.entities.HotelPlaya;
import examen2023.entities.Reserva;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class Buking {

    private List<Hotel> hoteles;
    private Set<Reserva> reservas;

    public Buking() {
        this.hoteles = new ArrayList<>();
        this.reservas = new TreeSet<>();
    }

    public List<Hotel> getHoteles() {
        return hoteles;
    }

    public Set<Reserva> getReservas() {
        return reservas;
    }

    public void setHoteles(List<Hotel> hoteles) {
        this.hoteles = hoteles;
    }

    public void setReservas(Set<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void addHotel(Hotel h) {
        this.hoteles.add(h);
    }

    public void removeHotel(Hotel h) {
        this.hoteles.remove(h);
    }

    public void addReserva(LocalDate fechaEntrada, LocalDate fechaSalida, Integer cantidadHabitaciones,
                           Integer numPersonasPorHabitacion, String dni, String nacionalidad, Hotel hotel) {
        Reserva reserva = new Reserva(fechaEntrada, fechaSalida, cantidadHabitaciones, numPersonasPorHabitacion,
                dni, nacionalidad, hotel);

        this.reservas.add(reserva);
    }

    public Reserva removeReserva(Long idReserva) {
        return this.reservas.stream()
                .filter(reserva -> reserva.getId().equals(idReserva))
                .findFirst()
                .orElseThrow();
    }

    public Hotel findHotelById(Long idHotel) {

        return this.hoteles.stream()
                .filter(hotel -> hotel.getId().equals(idHotel))
                .findFirst()
                .orElseThrow();
    }

    public List<Hotel> findHotelByProvincia(String provincia) {
        return this.hoteles.stream()
                .filter(hotel -> hotel.getProvincia().equals(provincia))
                .toList();
    }

    public List<Hotel> getHotelesMini() {
        return this.hoteles.stream()
                .filter(hotel -> hotel.getNumHabitaciones() < 20)
                .sorted(Comparator.comparing(Hotel::getPrecioNoche).reversed())
                .toList();
    }

    public List<Hotel> getHotelesCaros() {
        return this.hoteles.stream()
                .sorted(Comparator.comparing(Hotel::getPrecioNoche).reversed())
                .limit(2)
                .toList();
    }

    public HashMap<String, List<Hotel>> getHotelesGroupByLocalidad() {
        return (HashMap<String, List<Hotel>>) this.hoteles.stream()
                .collect(Collectors.groupingBy(Hotel::getLocalidad));
    }

    public HashMap<String, List<Hotel>> getHotelesGroupByLocalidad2() {
        HashMap<String, List<Hotel>> hotelesAgrupados = (HashMap<String, List<Hotel>>) this.hoteles.stream()
                .collect(Collectors.groupingBy(Hotel::getLocalidad));

        hotelesAgrupados.forEach((k,v) -> {
            v.sort(Comparator.comparing(Hotel::getPrecioNoche));
        });

        return  hotelesAgrupados;
    }

    public Set<Hotel> getHotelesPlaya() {
        return this.hoteles.stream()
                .filter(hotel -> hotel instanceof HotelPlaya) //Rompe la POO
                .collect(Collectors.toSet());
    }

    public Reserva findReservaById(Long id) {
        return this.reservas.stream()
                .filter(r -> r.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    public HashMap<String, Long> getReservasPais() {
        return (HashMap<String, Long>) this.reservas.stream()
                .collect(Collectors.groupingBy(Reserva::getNacionalidad, Collectors.counting()));
    }

    public double getImporteReserva(Long idReserva) {
        Reserva reserva = this.findReservaById(idReserva);
        int numDias = Period.between(reserva.getFechaEntrada(),reserva.getFechaSalida()).getDays();
        return reserva.getCantidadHabitaciones() * reserva.getHotel().getPrecioNoche() * numDias;
    }

    public List<Reserva> getReservasActivas(Long idHotel) {
        return this.reservas.stream()
                .filter(r -> r.getHotel().getId() == idHotel)
                .filter(r -> r.getFechaEntrada().isBefore(LocalDate.now()) ||
                        r.getFechaEntrada().equals(LocalDate.now()))
                .filter(r -> r.getFechaSalida().isAfter(LocalDate.now()) ||
                        r.getFechaSalida().equals(LocalDate.now()))
                .toList();
    }

    public Double getImporteReservasFinalizadas(Long idHotel) {
        return this.reservas.parallelStream()
                .filter(r -> r.getHotel().getId() == idHotel)
                .filter(r -> r.getFechaSalida().isBefore(LocalDate.now()))
                .mapToDouble(r -> {
                    int numDias = Period.between(r.getFechaEntrada(),r.getFechaSalida()).getDays();
                    return r.getCantidadHabitaciones() * r.getHotel().getPrecioNoche() * numDias;
                })
                .sum();
    }





}
