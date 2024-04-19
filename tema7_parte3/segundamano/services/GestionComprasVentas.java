package tema7_parte3.segundamano.services;

import tema7_parte3.segundamano.models.Compra;
import tema7_parte3.segundamano.models.Producto2Mano;
import tema7_parte3.segundamano.models.Usuario;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class GestionComprasVentas {

    private Set<PerfilUsuario> usuarios;

    public Set<PerfilUsuario> getUsuarios() {
        return usuarios;
    }

    public GestionComprasVentas() {
        usuarios = new HashSet<PerfilUsuario>();
    }

    /**
     * Método que añade una compraventa al sistema. Se añadirá como compra al comprador, y como venta al
     * vendedor
     *      * @param vendedor
     * @param comprador
     * @param producto
     * @param precio
     */
    public void realizarCompra(PerfilUsuario vendedor, PerfilUsuario comprador, Producto2Mano producto,
                               Double precio) throws Exception {

        //Solo se puede vendor un producto que no esté vendido
        if (!producto.isEstaVendido()) {

            //Generamos el objeto Compra
            Compra compra = new Compra(comprador.getUsuario(), vendedor.getUsuario(),
                    producto, LocalDate.now(), precio);

            //El producto ya está vendido
            producto.setEstaVendido(true);

            //Añadimos a la lista de compras del comprador
            comprador.addCompra(compra);

            //Añadimos a la lista de ventas del vendedor
            vendedor.addVenta(compra);
        } else {
            throw new Exception("Producto ya vendido");
        }

    }

    //STREAMS --------------------------------------------------------------------

    //Calcular el importe total de compra
    public Double importeTotalCompras() {
        return usuarios.stream()
                .flatMap(pu -> pu.getCompras().stream())
                .mapToDouble(Compra::getPrecioCompra)
                .sum();
    }

    //Sacar las compras agrupadas por usuario (Map) ordenadas por fecha. (Map<Usuario,List<Compra>>)
    public Map<Usuario, List<Compra>> comprasPorUsuario() {
        /*
        return usuarios.stream()
                .collect(Collectors.toMap(PerfilUsuario::getUsuario, PerfilUsuario::getCompras));
         */

        return usuarios.stream()
                .collect(Collectors.toMap(PerfilUsuario::getUsuario, pu -> {
                    return pu.getCompras().stream()
                            .sorted(Comparator.comparing(Compra::getFecha))
                            .toList();
                }));
    }

    //Sacar todas las compras agrupadas por categoría (Map<Categoria, List<Compra>>)
    public Map<Producto2Mano.Categoria, List<Compra>> getComprasByCategoria() {
        return usuarios.stream()
                .flatMap(pu -> pu.getCompras().stream())
                .collect(Collectors.groupingBy(compra -> compra.getProducto().getCategoria()));
    }

    //Sacar el número total de compras agrupadas por estado (Map<Estado, Long>)
    public Map<Producto2Mano.Estado, Long> getTotalComprasByEstado() {
        return usuarios.stream()
                .flatMap(pu -> pu.getCompras().stream())
                .collect(Collectors.groupingBy(compra -> compra.getProducto().getEstado(), Collectors.counting()));
    }

    //Sacar el número total de compras por categorías para usuarios que compran de menos de 30 años
    public Map<Producto2Mano.Categoria, List<Compra>> getComprasByCategoriaMenores30() {
        return usuarios.stream()
                .flatMap(pu -> pu.getCompras().stream())
                .filter( compra -> LocalDate.now().getYear() -
                        compra.getUsuarioCompra().getFechaNacimiento().getYear() < 30)
                .collect(Collectors.groupingBy(compra -> compra.getProducto().getCategoria()));
    }

    //Sacar el número total de compras agrupadas por día de la semana (lunes-100, martes-55, …)
    //Map<DayOfWeek, Long>
    public Map<DayOfWeek, Long> getComprasByDayOfWeek() {
        return usuarios.stream()
                .flatMap(pu -> pu.getCompras().stream())
                .collect(Collectors.groupingBy(compra -> compra.getFecha().getDayOfWeek(), Collectors.counting()));
    }


}
