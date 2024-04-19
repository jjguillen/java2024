package tema7_parte3.segundamano;

import tema7_parte3.segundamano.io.DAOSegundaMano;
import tema7_parte3.segundamano.models.Compra;
import tema7_parte3.segundamano.models.Producto2Mano;
import tema7_parte3.segundamano.models.Usuario;
import tema7_parte3.segundamano.services.GestionComprasVentas;

import java.io.IOException;
import java.time.LocalDate;

public class Test {

    public static void main(String[] args) throws IOException {

        GestionComprasVentas gcv = DAOSegundaMano.cargarCSV();
        System.out.println(gcv.getTotalComprasByEstado());
        System.out.println(gcv.getComprasByDayOfWeek());

    }


}
