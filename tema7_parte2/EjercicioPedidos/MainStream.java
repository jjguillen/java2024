package tema7_parte2.EjercicioPedidos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class MainStream {

    public static void main(String[] args) {

        Cliente c1 = new Cliente(1L, "Manuel García", 3);
        Cliente c2 = new Cliente(2L, "Esther Expósito", 1);
        Cliente c3 = new Cliente(3L, "Goyo Jiménez", 3);

        Producto prod1 = new Producto(1L, "Libro1", Producto.CategoriaProducto.LIBROS, 19.95);
        Producto prod2 = new Producto(2L, "Libro2", Producto.CategoriaProducto.LIBROS, 27.95);
        Producto prod3 = new Producto(3L, "Libro3", Producto.CategoriaProducto.LIBROS, 22.95);
        Producto prod4 = new Producto(4L, "Libro4", Producto.CategoriaProducto.LIBROS, 15.95);
        Producto prod5 = new Producto(5L, "Libro5", Producto.CategoriaProducto.LIBROS, 19.95);

        Producto prod6 = new Producto(6L, "Juego1", Producto.CategoriaProducto.JUEGOS, 59.95);
        Producto prod7 = new Producto(7L, "Juego2", Producto.CategoriaProducto.JUEGOS, 67.95);
        Producto prod8 = new Producto(8L, "Juego3", Producto.CategoriaProducto.JUEGOS, 52.95);
        Producto prod9 = new Producto(9L, "Juego4", Producto.CategoriaProducto.JUEGOS, 55.95);
        Producto prod10 = new Producto(10L, "Juego5", Producto.CategoriaProducto.JUEGOS, 69.95);

        Producto prod11 = new Producto(11L, "Periferico1", Producto.CategoriaProducto.PERIFERICOS, 19.95);
        Producto prod12 = new Producto(12L, "Periferico2", Producto.CategoriaProducto.PERIFERICOS, 27.95);
        Producto prod13 = new Producto(13L, "Periferico3", Producto.CategoriaProducto.PERIFERICOS, 32.95);
        Producto prod14 = new Producto(14L, "Periferico4", Producto.CategoriaProducto.PERIFERICOS, 45.95);
        Producto prod15 = new Producto(15L, "Periferico5", Producto.CategoriaProducto.PERIFERICOS, 59.95);

        Pedido ped1 = new Pedido(1L, c1, Pedido.EstadoProducto.RECIBIDO,
                LocalDate.now().plusDays(5), LocalDate.now());

        Pedido ped2 = new Pedido(2L, c2, Pedido.EstadoProducto.RECIBIDO,
                LocalDate.now().plusDays(10), LocalDate.now().minusDays(3));

        Pedido ped3 = new Pedido(3L, c3, Pedido.EstadoProducto.RECIBIDO,
                LocalDate.now().plusDays(7), LocalDate.now());

        Pedido ped4 = new Pedido(4L, c1, Pedido.EstadoProducto.RECIBIDO,
                LocalDate.now().plusDays(2), LocalDate.now().minusDays(3));

        ped1.setProductos(new HashSet<>( List.of(prod1, prod3, prod5, prod10)));
        ped2.setProductos(new HashSet<>( List.of(prod2, prod4, prod8, prod12)));
        ped3.setProductos(new HashSet<>( List.of(prod11, prod13, prod14, prod15)));
        ped4.setProductos(new HashSet<>( List.of(prod6, prod7, prod9, prod1, prod2, prod10)));

        ArrayList<Pedido> pedidos = new ArrayList<>(List.of(ped1, ped2, ped3, ped4));

        //STREAMS --------------------------------------------------------------------------
        //1. Muestra los libros de precio de más de 20€
        pedidos.stream()
                .flatMap( pedido -> pedido.getProductos().stream() )
                .distinct()
                .filter( producto -> producto.getCategoria().equals(Producto.CategoriaProducto.LIBROS))
                .filter( producto -> producto.getPrecio() > 20L)
                .forEach( System.out::println );

        /*
        Stream.of(prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8, prod9, prod10, prod11, prod12)
                .filter( producto -> producto.getCategoria().equals(Producto.CategoriaProducto.LIBROS))
                .filter( producto -> producto.getPrecio() > 20L)
                .forEach( System.out::println );

        */

        System.out.println("-------------------------------------");

        //2. Muestra los pedidos que tengan algún producto de categoría "Juegos
        //Stream.of(ped1, ped2, ped3, ped4)
        pedidos.stream()
                .filter( pedido -> pedido.getProductos().stream()
                                    .anyMatch( producto -> producto.getCategoria()
                                            .equals(Producto.CategoriaProducto.JUEGOS)))
                .forEach(System.out::println);



    }
}
