package servicios;

import entidades.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Atrapame {

    private ArrayList<Vuelo> vuelos = new ArrayList<>();
    private ArrayList<ReservaVuelo> reservas= new ArrayList<>();

    public void addVuelo(Vuelo vuelo) {
        this.vuelos.add(vuelo);
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public ArrayList<ReservaVuelo> getReservas() {
        return reservas;
    }

    /**
     * Crea la reserva si hay disponibilidad de asientos para todos los pasajeros que se desea añadir a la reserva
     * Si no hay devuelve false, si hay hace la reserva, reserva asientos para cada pasajero y devuelve true
     * Añade la reserva a las reservas
     * @param vuelo
     * @param pasajeros
     * @param tipoT
     * @param tipoA
     * @return
     */
    public boolean crearReserva(Vuelo vuelo, ArrayList<Pasajero> pasajeros, TipoTarifa tipoT, TipoAsiento tipoA) {
        if (vuelo.verificarDisponibilidad(tipoA) >= pasajeros.size()) {
            ReservaVuelo rv = new ReservaVuelo(vuelo, tipoA, tipoT);
            for(Pasajero pasajero: pasajeros) {
                rv.reservaAsiento(pasajero);
            }
            reservas.add(rv);
            System.out.println(rv);
            return true;
        }

        return false;
    }

    /**
     * Para cancelar una reserva primero la buscamos por id
     * Si la encontramos primero obtenemos sus asientos, y del vuelo liberamos esos asientos
     * Luego ya podemos eliminar la reserva de la colección de reservas.
     * @param id
     */
    public void cancelarReserva(Long id) {
        ReservaVuelo reservaACancelar=null;
        //Buscar reserva
        for(ReservaVuelo reserva: reservas) {
            if (reserva.getId() == id) {
                reservaACancelar = reserva;
            }
        }

        if (reservaACancelar != null) {
            //Entrar a su vuelo y liberar los asientos de la reserva
            for(Asiento asiento: reservaACancelar.getAsientos()) {
                reservaACancelar.getVuelo().liberarAsiento(asiento);
            }

            //Eliminar reserva de las reservas
            reservas.remove(reservaACancelar);
        }
    }

    /**
     * Busca todos los vuelos al mismo destino indicado y los devuelve
     * @param destino
     * @return ArrayList<Vuelo>
     */
    public ArrayList<Vuelo> buscarVuelos(String destino) {
        ArrayList<Vuelo> vuelosEncontrados = new ArrayList<>();
        for(Vuelo vuelo: vuelos) {
            if (vuelo.getDestino().equals(destino))
                vuelosEncontrados.add(vuelo);
        }
        return vuelosEncontrados;
    }

    /**
     * Busca todos los vuelos que salen el mismo día
     * @param fecha
     * @return ArrayList<Vuelo>
     */
    public ArrayList<Vuelo> buscarVuelos(LocalDate fecha) {
        ArrayList<Vuelo> vuelosEncontrados = new ArrayList<>();
        for(Vuelo vuelo: vuelos) {
            if (vuelo.getFecha().equals(fecha))
                vuelosEncontrados.add(vuelo);
        }
        return vuelosEncontrados;
    }

    /**
     * Busca todos los vuelos que salen el mismo día al mismo destino
     * @param fecha
     * @param destino
     * @return
     */
    public ArrayList<Vuelo> buscarVuelos(LocalDate fecha, String destino) {
        ArrayList<Vuelo> vuelosEncontrados = new ArrayList<>();
        for(Vuelo vuelo: vuelos) {
            if (vuelo.getFecha().equals(fecha) && vuelo.getDestino().equals(destino))
                vuelosEncontrados.add(vuelo);
        }
        return vuelosEncontrados;
    }

    /**
     * Devuelve todas las reservas que ha hecho una persona indicada por su dni
     * @param dni
     * @return
     */
    public ArrayList<ReservaVuelo> buscarReservas(String dni) {
        ArrayList<ReservaVuelo> reservasEncontradas = new ArrayList<>();
        for(ReservaVuelo reserva: reservas) {
            if (reserva.getPasajeros().contains(new Pasajero(1l, "", "", dni, "", "",
                    "", "", "", "", "" ))) {
                reservasEncontradas.add(reserva);
            }
        }
        return reservasEncontradas;
    }



}
