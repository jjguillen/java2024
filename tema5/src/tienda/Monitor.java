package tienda;

public class Monitor extends Producto {
    private boolean contrataSeguroTransporte;

    public Monitor(long id, String nombre, String descripcion, double precioUnitario,
                   int unidadesDisponibles, int stockMaximo, double descuento,
                   boolean contrataSeguroTransporte) {
        super(id, nombre, descripcion, precioUnitario, unidadesDisponibles, stockMaximo, descuento);
        this.contrataSeguroTransporte = contrataSeguroTransporte;
    }

    public boolean isContrataSeguroTransporte() {
        return contrataSeguroTransporte;
    }

    public void setContrataSeguroTransporte(boolean contrataSeguroTransporte) {
        this.contrataSeguroTransporte = contrataSeguroTransporte;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Monitores{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", precioUnitario=").append(precioUnitario);
        sb.append(", unidadesDisponibles=").append(unidadesDisponibles);
        sb.append(", stockMaximo=").append(stockMaximo);
        sb.append(", descuento=").append(descuento);
        sb.append(", contrataSeguroTransporte=").append(contrataSeguroTransporte);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularPrecio(int cantidad) {
        //Sumar embalaje
        double precio = super.calcularPrecio(cantidad);
        if (this.contrataSeguroTransporte) {
            precio += 50;
        }
        return precio;
    }
}
