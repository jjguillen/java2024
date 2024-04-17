package tema7_parte3.segundamano.services;

import tema7_parte3.segundamano.models.Compra;
import tema7_parte3.segundamano.models.Producto2Mano;
import tema7_parte3.segundamano.models.Usuario;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PerfilUsuario {

    private Usuario usuario;
    private Set<Producto2Mano> productoALaVenta;
    private List<Compra> compras;
    private List<Compra> ventas;

    public PerfilUsuario(Usuario usuario) {
        this.usuario = usuario;
        productoALaVenta = new HashSet<>();
        compras = new ArrayList<>();
        ventas = new ArrayList<>();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Set<Producto2Mano> getProductoALaVenta() {
        return productoALaVenta;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public List<Compra> getVentas() {
        return ventas;
    }

    private void addProducto2Mano(Producto2Mano producto) {
        productoALaVenta.add(producto);
    }

    private void addCompra(Compra compra) {
        compras.add(compra);
    }

    private void addVenta(Compra venta) {
        ventas.add(venta);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PerfilUsuario{");
        sb.append("usuario=").append(usuario.getEmail());
        sb.append(", productoALaVenta=").append(productoALaVenta);
        sb.append(", compras=").append(compras);
        sb.append(", ventas=").append(ventas);
        sb.append('}');
        return sb.toString();
    }
}
