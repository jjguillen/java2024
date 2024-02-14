package ejerciciosclase.tienda;

public class LineaPedido {

    private int orden;
    private int cantidad;
    private Producto producto;

    public LineaPedido(int orden, int cantidad, Producto producto) {
        this.orden = orden;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
