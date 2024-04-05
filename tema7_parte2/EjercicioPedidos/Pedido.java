package tema7_parte2.EjercicioPedidos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Pedido {

    enum EstadoProducto { RECIBIDO, PROCESADO, ENVIADO }

    private Long id;
    private LocalDate fechaPedido;
    private LocalDate fechaEnvio;
    private EstadoProducto estado;
    private Cliente cliente;
    private Set<Producto> productos;

    public Pedido(Long id, Cliente cliente, EstadoProducto estado, LocalDate fechaEnvio, LocalDate fechaPedido) {
        this.cliente = cliente;
        this.estado = estado;
        this.fechaEnvio = fechaEnvio;
        this.fechaPedido = fechaPedido;
        this.id = id;
        this.productos = new HashSet<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public EstadoProducto getEstado() {
        return estado;
    }

    public void setEstado(EstadoProducto estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pedido{");
        sb.append("id=").append(id);
        sb.append(", fechaPedido=").append(fechaPedido);
        sb.append(", fechaEnvio=").append(fechaEnvio);
        sb.append(", estado=").append(estado);
        sb.append(", cliente=").append(cliente);
        sb.append(", productos=").append(productos);
        sb.append('}');
        return sb.toString();
    }
}
