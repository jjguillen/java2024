package tema6.src.reservasvuelos.ReservasVuelos.src.entidades;

public class AsientoTurista extends Asiento {

    private boolean esVentana;

    public AsientoTurista(Long id, Double precioBase, Integer fila, String letra, boolean esVentana) {
        super(id, precioBase, fila, letra);
        this.esVentana = esVentana;
        this.tipo = TipoAsiento.TURISTA;
    }

    public boolean isEsVentana() {
        return esVentana;
    }

    public void setEsVentana(boolean esVentana) {
        this.esVentana = esVentana;
    }

    @Override
    public String toString() {
        String dni;
        if (pasajero == null)
            dni = "-";
        else
            dni = pasajero.getDniPasaporte();

        return "AsientoTurista{" +
                " codigo=" + this.getCodigo() +
                ", precioBase=" + precioBase +
                ", tipo=" + tipo +
                ", pasajero=" + dni +
                ", esVentana=" + esVentana +
                '}';
    }

    @Override
    public double calcularPrecio() {
        if (this.esVentana)
            return this.precioBase + 10;

        return this.precioBase;
    }
}
