package tema7_parte3.segundamano.io;

import tema7_parte3.ejemplobasicoficheros.models.Gamer;
import tema7_parte3.ejemplobasicoficheros.models.Level;
import tema7_parte3.segundamano.models.Compra;
import tema7_parte3.segundamano.models.Producto2Mano;
import tema7_parte3.segundamano.models.Usuario;
import tema7_parte3.segundamano.services.GestionComprasVentas;
import tema7_parte3.segundamano.services.PerfilUsuario;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class DAOSegundaMano {

    public static GestionComprasVentas cargarCSV() throws IOException {
        //File to read with usuarios
        Path fileUsuarios = Paths.get("tema7_parte3", "segundamano", "resources", "usuarios.csv");
        Path fileProductos = Paths.get("tema7_parte3", "segundamano", "resources", "productos.csv");
        Path fileCompras = Paths.get("tema7_parte3", "segundamano", "resources", "compras.csv");

        //Cargar usuarios
        List<Usuario> usuarios = Files.lines(fileUsuarios)
                .map( linea -> {
                    String[] cad = linea.split(",");

                    return new Usuario(Long.parseLong(cad[0]), cad[1], cad[2], Integer.parseInt(cad[3]),
                            LocalDate.parse(cad[4]), cad[5], cad[6], cad[7]);

                })
                .toList();

        //Cargar productos
        List<Producto2Mano> productos = Files.lines(fileProductos)
                .map( linea -> {
                    String[] cad = linea.split(",");

                    return new Producto2Mano(Long.parseLong(cad[0]), cad[1], cad[2],
                            Producto2Mano.Categoria.valueOf(cad[3]), Producto2Mano.Estado.valueOf(cad[4]),
                            Boolean.parseBoolean(cad[5]), Double.parseDouble(cad[6]));

                })
                .toList();

        //Cargar compras
        List<Compra> compras = Files.lines(fileCompras)
                .skip(1)
                .map( linea -> {
                    String[] cad = linea.split(",");

                    Long idUsuarioCompra = Long.parseLong(cad[1]);
                    Long idUsuarioVenta = Long.parseLong((cad[2]));
                    Long idProducto = Long.parseLong(cad[3]);

                    Usuario usuarioCompra = usuarios.stream()
                            .filter(usuario -> usuario.getId() == idUsuarioCompra)
                            .findFirst()
                            .orElse(null);

                    Usuario usuarioVenta = usuarios.stream()
                            .filter(usuario -> usuario.getId() == idUsuarioVenta)
                            .findFirst()
                            .orElse(null);

                    Producto2Mano producto = productos.stream()
                            .filter(prod -> prod.getId() == idProducto)
                            .findFirst()
                            .orElse(null);

                    return new Compra(Long.parseLong(cad[0]), usuarioCompra, usuarioVenta,
                            producto, LocalDate.parse(cad[4]), Double.parseDouble(cad[5]));

                })
                .toList();

        //Creamos el objeto GestionComprasVentas
        GestionComprasVentas gcv = new GestionComprasVentas();
        for(Usuario user: usuarios) {
            PerfilUsuario pu = new PerfilUsuario(user);

            //Añadirle sus productos
            compras.stream()
                    .filter( c -> c.getUsuarioVende().equals(user))
                    .forEach( c -> {
                        pu.addProducto2Mano(c.getProducto());
                    });

            //Añadirle sus compras
            compras.stream()
                    .filter( c -> c.getUsuarioCompra().equals(user))
                    .forEach( c -> {
                        pu.addCompra( c );
                    });

            //Añadirle sus ventas
            compras.stream()
                    .filter( c -> c.getUsuarioVende().equals(user))
                    .forEach( c -> {
                        pu.addVenta( c );
                    });

            //Añadir el PerfilUsuario a GestionComprasVentas
            gcv.getUsuarios().add(pu);
        }

        return gcv;
    }
}
