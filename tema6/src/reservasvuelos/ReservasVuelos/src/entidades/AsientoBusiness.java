package tema6.src.reservasvuelos.ReservasVuelos.src.entidades;

public class AsientoBusiness extends Asiento {

    private boolean tieneComida;

    public AsientoBusiness(Long id, Double precioBase, Integer fila, String letra, boolean tieneComida) {
        super(id, precioBase, fila, letra);
        this.tieneComida = tieneComida;
        this.tipo = TipoAsiento.BUSINESS;
    }

    public boolean isTieneComida() {
        return tieneComida;
    }

    public void setTieneComida(boolean tieneComida) {
        this.tieneComida = tieneComida;
    }

    @Override
    public String toString() {
        String dni;
        if (pasajero == null)
            dni = "-";
        else
            dni = pasajero.getDniPasaporte();

        return "AsientoBusiness{" +
                " codigo=" + this.getCodigo() +
                ", precioBase=" + precioBase +
                ", tipo=" + tipo +
                ", pasajero=" + dni +
                ", tieneComida=" + tieneComida +
                '}';
    }

    @Override
    public double calcularPrecio() {
        if (this.tieneComida)
            return this.precioBase + 30 + (this.precioBase * 0.25);

        return this.precioBase + (this.precioBase * 0.25);
    }
}
