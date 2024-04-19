package tema7_parte3.segundamano.models;

import java.time.LocalDate;
import java.util.UUID;

public class Compra {

    private Long id;
    private Usuario usuarioCompra;
    private Usuario usuarioVende;
    private Producto2Mano producto;
    private LocalDate fecha;
    private Double precioCompra;

    public Compra(Usuario usuarioCompra, Usuario usuarioVende, Producto2Mano producto,
                  LocalDate fecha, Double precioCompra) {
        this.id = UUID.randomUUID().timestamp();
        this.usuarioCompra = usuarioCompra;
        this.usuarioVende = usuarioVende;
        this.producto = producto;
        this.fecha = fecha;
        this.precioCompra = precioCompra;
    }

    public Compra(Long id, Usuario usuarioCompra, Usuario usuarioVende, Producto2Mano producto,
                  LocalDate fecha, Double precioCompra) {
        this.id = id;
        this.usuarioCompra = usuarioCompra;
        this.usuarioVende = usuarioVende;
        this.producto = producto;
        this.fecha = fecha;
        this.precioCompra = precioCompra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuarioCompra() {
        return usuarioCompra;
    }

    public void setUsuarioCompra(Usuario usuarioCompra) {
        this.usuarioCompra = usuarioCompra;
    }

    public Usuario getUsuarioVende() {
        return usuarioVende;
    }

    public void setUsuarioVende(Usuario usuarioVende) {
        this.usuarioVende = usuarioVende;
    }

    public Producto2Mano getProducto() {
        return producto;
    }

    public void setProducto(Producto2Mano producto) {
        this.producto = producto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Compra{");
        sb.append("id=").append(id);
        sb.append(", usuarioCompra=").append(usuarioCompra.getEmail());
        sb.append(", usuarioVende=").append(usuarioVende.getEmail());
        sb.append(", producto=").append(producto.getId()).append("-").append(producto.getNombre());
        sb.append(", fecha=").append(fecha);
        sb.append(", precioCompra=").append(precioCompra);
        sb.append('}');
        return sb.toString();
    }
}
