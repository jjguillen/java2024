package ejerciciosclase.tienda;
import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {


    private String idPedido;
    private Cliente cliente;
    private LocalDate fecha;
    private ArrayList<LineaPedido> lineas;
    private Direccion direccionEnvio;
    private Direccion direccionFacturacion;

    public Pedido(String idPedido, Cliente cliente, LocalDate fecha, Direccion direccionEnvio, Direccion direccionFacturacion) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.fecha = fecha;
        this.direccionEnvio = direccionEnvio;
        this.direccionFacturacion = direccionFacturacion;
        this.lineas = new ArrayList<LineaPedido>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<LineaPedido> getLineas() {
        return lineas;
    }

    public Direccion getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(Direccion direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public Direccion getDireccionFacturacion() {
        return direccionFacturacion;
    }

    public void setDireccionFacturacion(Direccion direccionFacturacion) {
        this.direccionFacturacion = direccionFacturacion;
    }

    public String getIdPedido() {
        return idPedido;
    }
}
