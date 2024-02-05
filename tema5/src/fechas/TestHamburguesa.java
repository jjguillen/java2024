package fechas;

import java.time.LocalDate;

public class TestHamburguesa {

    public static void main(String[] args) {

        Hamburguesa h1 = new Hamburguesa("Doble", 300,"2024-03-01");

        System.out.println(h1);
        System.out.println(h1.estaCaducado());
        System.out.println("Faltan " + h1.numDiasFaltan()+ " días");

    }
}
