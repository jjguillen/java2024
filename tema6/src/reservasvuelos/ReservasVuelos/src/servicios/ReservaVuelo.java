package tema6.src.reservasvuelos.ReservasVuelos.src.servicios;

import tema6.src.reservasvuelos.ReservasVuelos.src.entidades.*;
import java.util.ArrayList;

public class ReservaVuelo {
    private static Long numeroReservas=0l;

    private Long id;
    private Vuelo vuelo;
    private ArrayList<Pasajero> pasajeros;
    private TipoAsiento tipoAsiento;
    private TipoTarifa tipoTarifa;

    public ReservaVuelo(Vuelo vuelo, TipoAsiento tipoAsiento, TipoTarifa tipoTarifa) {
        this.id = ReservaVuelo.numeroReservas++;
        this.vuelo = vuelo;
        this.tipoAsiento = tipoAsiento;
        this.tipoTarifa = tipoTarifa;
        this.pasajeros = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public TipoAsiento getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(TipoAsiento tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }

    public TipoTarifa getTipoTarifa() {
        return tipoTarifa;
    }

    public void setTipoTarifa(TipoTarifa tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void addPasajero(Pasajero pasajero) {
        this.pasajeros.add(pasajero);
    }

    public void removePasajero(Pasajero pasajero) {
        this.pasajeros.remove(pasajero);
    }

    /**
     * Devuelve los asientos ocupados por los pasajeros de la reserva
     * @return
     */
    public ArrayList<Asiento> getAsientos() {
        ArrayList<Asiento> asientos = new ArrayList<>();
        for(Pasajero pasajero: pasajeros) {
            asientos.add(pasajero.getAsiento());
        }
        return asientos;
    }

    /**
     * Añade un pasajero a la reserva asignándole un asiento del tipo indicado en el vuelo
     * @param pasajero
     * @return true si ha podido reservar un asiento, false en caso contrario
     */
    public boolean reservaAsiento(Pasajero pasajero) {
        if (this.vuelo.verificarDisponibilidad(this.tipoAsiento) > 0) {
            //Clonar pasajero
            Pasajero nuevoPasajero = new Pasajero(pasajero);

            //Ocupar el asiento
            this.vuelo.ocuparAsiento(nuevoPasajero, this.vuelo.buscarAsientoDisponible(this.tipoAsiento));

            //Añadir el pasajero a la reserva
            this.addPasajero(nuevoPasajero);

            return true;
        }

        return false;
    }

    /**
     * Calcula el precio total de la reserva, sumando a cada precio de asiento lo que corresponde por el
     * tipo de tarifa
     * @return double
     */
    public double calcularPrecioTotal() {
        double precio = 0;
        for(Pasajero pasajero: pasajeros) {
            precio += pasajero.getAsiento().calcularPrecio();
            switch (tipoTarifa) {
                case OPTIMA: precio += precio*0.1; break;
                case CONFORT: precio += precio*0.15; break;
                case FLEXIBLE: precio += precio*0.3; break;
            }
        }

        return precio;
    }

    public void imprimirBilletes() {
        System.out.println("\nRESERVA: " + this.getId());
        System.out.println(" - Vuelo: " + this.getVuelo().getCodigo());
        System.out.println(" - TipoAsientos: " + this.getTipoAsiento());
        System.out.println(" - TipoTarifa: " + this.getTipoTarifa());
        int contador=1;
        for(Pasajero pasajero: pasajeros) {
            System.out.println("Pasajero " + contador + " ------------------");
            System.out.println(pasajero.getNombre() + " " + pasajero.getApellidos());
            System.out.println(pasajero.getAsiento());
            contador++;
        }
        System.out.println("COSTE TOTAL RESERVA: " + this.calcularPrecioTotal() + "€");
    }

    @Override
    public String toString() {
        this.imprimirBilletes();
        return ""+ this.getId();
    }
}
