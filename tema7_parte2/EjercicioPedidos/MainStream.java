package tema7_parte2.EjercicioPedidos;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.LocalDate;
import tema7_parte2.EjercicioPedidos.Producto.CategoriaProducto;

public class MainStream {

    public static void main(String[] args) {

        Cliente c1 = new Cliente(1L, "Manuel García", 2);
        Cliente c2 = new Cliente(2L, "Esther Expósito", 1);
        Cliente c3 = new Cliente(3L, "Goyo Jiménez", 2);

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

        System.out.println("-------------------------------------");

        //3. Genera una lista con todos los Libros pero cambia su precio para que lleven un 10% de descuento
        List<Producto> libros = Stream.of(prod1, prod2, prod3, prod4, prod5)
                .map( prod -> {
                    prod.setPrecio(prod.getPrecio() * 0.90);
                    return prod;
                })
                //.peek( prod -> prod.setPrecio(prod.getPrecio() * 0.90))
                .toList();
        libros.forEach(System.out::println);

        System.out.println("-------------------------------------");

        //4. Saca los productos que aparecen en los pedidos de clientes de nivel 2, realizados entre el 20-04-
        //2022 y el 20-05-2022
        pedidos.stream()
                .filter( pedido -> pedido.getCliente().getNivel() == 2)
                .filter( pedido -> pedido.getFechaPedido().isAfter(LocalDate.of(2024,04,04))
                                && pedido.getFechaPedido().isBefore(LocalDate.of(2024,04,8)) )
                .flatMap( pedido -> pedido.getProductos().stream() )
                .distinct()
                .forEach( System.out::println);

        System.out.println("-------------------------------------");

        //5. Muestra el producto más caro de la categoría Juegos
        Producto prCaro = Stream.of(prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8, prod9, prod10, prod11, prod12,
                prod13, prod14, prod15)
                .filter( producto -> producto.getCategoria().equals(Producto.CategoriaProducto.JUEGOS))
                .sorted(Comparator.comparing(Producto::getPrecio).reversed())
                .findFirst()
                .orElse( null );
        System.out.println(prCaro);

        Producto prCaro2 = Stream.of(prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8, prod9, prod10, prod11, prod12,
                        prod13, prod14, prod15)
                .filter( producto -> producto.getCategoria().equals(Producto.CategoriaProducto.JUEGOS))
                .max(Comparator.comparing(Producto::getPrecio))
                .orElse( null );
        System.out.println(prCaro2);

        System.out.println("-------------------------------------");

        //6. Devuelve los dos pedidos más recientes
        pedidos.stream()
                .sorted( Comparator.comparing(Pedido::getFechaPedido).reversed())
                .limit(2)
                .forEach( System.out::println );

        System.out.println("-------------------------------------");

        //7. Muestra los pedidos hechos hoy, debe aparecer el pedido y debajo la lista de productos de ese
        //pedido
        pedidos.stream()
                .filter( pedido -> pedido.getFechaPedido().equals(LocalDate.now()))
                .peek( pedido -> System.out.println("Pedido: " + pedido.getId()) )
                .forEach( pedido -> pedido.getProductos()
                                        .stream()
                                            .forEach( System.out::println));


        pedidos.stream()
                .filter( pedido -> pedido.getFechaPedido().equals(LocalDate.now()))
                .forEach( pedido -> {
                    System.out.println("Pedido: " + pedido.getId());
                    pedido.getProductos()
                        .stream()
                        .forEach( System.out::println );
                });

        System.out.println("-------------------------------------");

        //8. Calcula el total de todos los pedidos de Abril de 2024
        Double total = pedidos.stream()
                .filter( pedido -> pedido.getFechaPedido().getMonth().equals(Month.APRIL))
                .flatMap( pedido -> pedido.getProductos().stream())
                .mapToDouble( producto -> producto.getPrecio() )
                .sum();
        System.out.println(total + " euros" );

        Double total2 = pedidos.stream()
                .filter( pedido -> pedido.getFechaPedido().getMonth().equals(Month.APRIL))
                .flatMap( pedido -> pedido.getProductos().stream())
                        .collect(Collectors.summingDouble( Producto::getPrecio) );
        System.out.println(total2 + " euros" );

        System.out.println("-------------------------------------");

        //9.Obtén una colección de estadísticas de los Juegos: número, media, máximo, mínimo, total. Hay que
        //usar el método de Streams summaryStatistics() que devuelve un DoubleSummaryStatistics
        String estadisticasJuegos = Stream.of(prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8, prod9, prod10, prod11, prod12,
                        prod13, prod14, prod15)
                .filter( producto -> producto.getCategoria().equals(Producto.CategoriaProducto.JUEGOS))
                .collect( Collectors.summarizingDouble( Producto::getPrecio ))
                .toString();
        System.out.println(estadisticasJuegos);

        DoubleSummaryStatistics estadisticasJuegos2 = Stream.of(prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8, prod9, prod10, prod11, prod12,
                        prod13, prod14, prod15)
                .filter( producto -> producto.getCategoria().equals(Producto.CategoriaProducto.JUEGOS))
                .collect( Collectors.summarizingDouble( Producto::getPrecio ));
        System.out.println("Maximo " + estadisticasJuegos2.getMax() + " Media: " + estadisticasJuegos2.getAverage());

        System.out.println("-------------------------------------");

        //10. Genera un Map<Long, Integer> donde como clave aparezca el id de pedido y como valor el número
        //de productos en el pedido. Collectors.toMap, que el primer parámetro será función lambda para
        //quedarnos con el id, y el segundo parámetro una función lambda para el tamaño del Set de
        //productos

        Map<Long, Integer> pedidoProductos = pedidos.stream()
                .collect( Collectors.toMap( Pedido::getId, pedido -> pedido.getProductos().size()));
        pedidoProductos.forEach( (k,v) -> System.out.println("Pedido: " + k + ", total productos: " + v));

        System.out.println("-------------------------------------");

        //11. Genera un Map<Pedido, Double> donde la clave sea cada pedido y el valor sea el total del pedido.
        //Hay que usar Collectors.toMap pero al poner la clave es el propio pedido, se pone
        //Function.identity() en el primer parámetro de Collectors.toMap

        Map<Pedido, Double> pedidosTotal = pedidos.stream()
                .collect( Collectors.toMap( Function.identity() ,
                            pedido -> pedido.getProductos().stream()
                                    .mapToDouble( Producto::getPrecio )
                                    .sum()
                ));
        pedidosTotal.forEach( (k,v) -> System.out.println("Pedido: " + k.getId() + ", total precio productos: " + v));

        System.out.println(" Ordenado ----------------------- ");
        TreeMap<Pedido, Double> pedidosTotalOrdenado = new TreeMap<>(pedidosTotal);
        pedidosTotalOrdenado.forEach( (k,v) -> System.out.println("Pedido: " + k.getId() + ", total precio productos: " + v));

        System.out.println("-------------------------------------");

        //12. Genera un Map<String, List<Producto>> con la clave la categoría, y el valor los productos de esa
        //categoría. Usar Collectors.groupingBy

        Map<CategoriaProducto, List<Producto>> productosPorCategoria = Stream.of(prod1, prod2, prod3, prod4, prod5,
                        prod6, prod7, prod8, prod9, prod10, prod11, prod12, prod13, prod14, prod15)
                .collect(Collectors.groupingBy( Producto::getCategoria ));
        productosPorCategoria.forEach( (k,v) -> {
            System.out.println("Categoría: " + k);
            v.forEach( System.out::println );
        });

        System.out.println("-------------------------------------");

        //13. Saca el producto más caro de cada categoría. Genera un Map<String, Optional<Producto>>. Usar
        //Collectors.groupingBy y Collectors.maxBy

        Map<CategoriaProducto, Optional<Producto>> productosPorCategoriaCaro = Stream.of(prod1, prod2, prod3, prod4, prod5,
                        prod6, prod7, prod8, prod9, prod10, prod11, prod12, prod13, prod14, prod15)
                .collect(Collectors.groupingBy( Producto::getCategoria,
                                                Collectors.maxBy( Comparator.comparing(Producto::getPrecio ))));

        productosPorCategoriaCaro.forEach( (k,v) -> System.out.println("Categoría: " + k + " - " +
                                                v.orElseThrow(null)));

    }
}
