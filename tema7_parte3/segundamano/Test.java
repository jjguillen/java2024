package tema7_parte3.segundamano;

import tema7_parte3.segundamano.models.Compra;
import tema7_parte3.segundamano.models.Producto2Mano;
import tema7_parte3.segundamano.models.Usuario;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        Producto2Mano pm1 = new Producto2Mano(1L, "Kayak", "Kayak de travesía",
                Producto2Mano.Categoria.BICICLETAS, Producto2Mano.Estado.BUENO, false, 350.0 );

        Usuario u1 = new Usuario(1L, "Pepe", "García", 0,
                LocalDate.of(2004,10,5), "XXXXX111", "pepegarcia@gmail.com",
                "12345678");

        Usuario u2 = new Usuario(2L, "Isabel", "Pérez", 1,
                LocalDate.of(2000,1,15), "XXXXX222", "isaperez@gmail.com",
                "12345678");

        Compra c1 = new Compra(1L, u2, u1, pm1, LocalDate.now(), 275.0);

        System.out.println("La compra realizada es: ");
        System.out.println(c1);

    }


}
