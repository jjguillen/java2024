package tema6.src.reservasvuelos.ReservasVuelos.src.entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Objects;

public class Vuelo {

    private String codigo;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private LocalTime hora;
    private Double precioBase;
    private Integer asientosDisponibles;
    private ArrayList<Asiento> asientos;


    public Vuelo(String codigo, String origen, String destino, LocalDate fecha, LocalTime hora, Double precioBase,
                 Integer asientosDisponibles) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.precioBase = precioBase;
        this.asientosDisponibles = asientosDisponibles;
        this.asientos = new ArrayList<>(this.asientosDisponibles);

        //Crear asientos business
        for(int i = 0; i < Math.round(this.asientosDisponibles * 0.3); i++) {
            this.asientos.add(new AsientoBusiness((long) i,this.precioBase, (i%(asientosDisponibles/6))+1,
                    Character.toString((char) 65+(i%10)), true));
        }
        //Crear asientos turistas
        for(int i = 0; i < Math.round(this.asientosDisponibles * 0.7); i++) {
            this.asientos.add(new AsientoTurista((long) i,this.precioBase, (i%(asientosDisponibles/6))+1,
                    Character.toString((char) 65+(i%10)), true));
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append( "Vuelo{" +
                "codigo='" + codigo + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", precioBase=" + precioBase +
                ", asientosDisponibles=" + asientosDisponibles +
                "}\n");
        for(Asiento asiento: asientos) {
            sb.append(asiento.toString());
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return Objects.equals(codigo, vuelo.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    /**
     * Devuelve el número de asientos disponibles (sin Pasajero asignado) del tipo indicado
     * @param tipo
     * @return
     */
    public int verificarDisponibilidad(TipoAsiento tipo) {
        int contador=0;
        for(Asiento asiento: asientos) {
            if (asiento.getTipo().equals(tipo) && asiento.getPasajero() == null) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Devuelve el primer asiento del tipoAsiento indicado que está libre o null si no hay ninguno libre
     * @param tipoAsiento
     * @return
     */
    public Asiento buscarAsientoDisponible(TipoAsiento tipoAsiento) {
        for(Asiento asiento: asientos) {
            if (asiento.getTipo().equals(tipoAsiento) && asiento.getPasajero() == null) {
                return asiento;
            }
        }

        return null;
    }

    /**
     * Ocupa el asiento por el pasajero, si el asiento no tiene pasajero
     * @param pasajero
     * @param asiento
     * @return
     */
    public boolean ocuparAsiento(Pasajero pasajero, Asiento asiento) {
        if (asiento.getPasajero() == null) {
            asiento.setPasajero(pasajero);
            pasajero.setAsiento(asiento);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Se libera el asiento quitando el posible pasajero asociado al asiento
     * Si el asiento tenía pasajero asignado, al asiento de ese pasajero se le pone null también
     * @param asiento
     */
    public void liberarAsiento(Asiento asiento) {
        if (asiento.getPasajero() != null) {
            //Asiento -> pasajero
            //Pasajero -> asiento

            asiento.getPasajero().setAsiento(null);
            asiento.setPasajero(null);
        }
    }

    /**
     * Calcula los días que faltan hasta el día del vuelo
     * @return
     */
    public long diasFaltanVuelo() {
        return ChronoUnit.DAYS.between(LocalDate.now(), this.getFecha());
    }

    /**
     * Devolvemos todos los pasajeros que tienen asiento asignado ya en el vuelo
     * @return ArrayList<Pasajero>
     */
    public ArrayList<Pasajero> getPasajeros() {
        ArrayList<Pasajero> pasajerosVuelo = new ArrayList<>();
        for(Asiento asiento: asientos) {
            if (asiento.getPasajero() != null)
                pasajerosVuelo.add(asiento.getPasajero());
        }

        return pasajerosVuelo;
    }
}