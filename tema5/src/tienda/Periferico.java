package tienda;

public class Periferico extends  Producto {
    private double descuentoEspecialPorCantidad;

    public Periferico(long id, String nombre, String descripcion, double precioUnitario,
                      int unidadesDisponibles, int stockMaximo, double descuento,
                      double descuentoEspecialPorCantidad) {
        super(id, nombre, descripcion, precioUnitario, unidadesDisponibles, stockMaximo, descuento);
        this.descuentoEspecialPorCantidad = descuentoEspecialPorCantidad;
    }

    public double getDescuentoEspecialPorCantidad() {
        return descuentoEspecialPorCantidad;
    }

    public void setDescuentoEspecialPorCantidad(double descuentoEspecialPorCantidad) {
        this.descuentoEspecialPorCantidad = descuentoEspecialPorCantidad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", precioUnitario=").append(precioUnitario);
        sb.append(", unidadesDisponibles=").append(unidadesDisponibles);
        sb.append(", stockMaximo=").append(stockMaximo);
        sb.append(", descuento=").append(descuento);
        sb.append("descuentoEspecialPorCantidad=").append(descuentoEspecialPorCantidad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularPrecio(int cantidad) {
        //Restar si compra más de una cantidad
        double precio = super.calcularPrecio(cantidad);
        if (cantidad > 10) {
            precio -= descuentoEspecialPorCantidad;
        }

        return precio;
    }
}
