package tienda;

public class Test {

    public static void main(String[] args) {

        Periferico pr1 = new Periferico(1, "Teclado", "Teclado mecánico switches rojos",
                120, 20, 40, 0.10, 50);

        Monitor pr2 = new Monitor(2, "Monitor Oled", "Monitor gaming Oled 32'",
                600, 10, 25, 0.15, true);

        Tienda miTienda = new Tienda();
        miTienda.adquirirProducto(pr1);
        miTienda.adquirirProducto(pr2);

        miTienda.venderProducto(1, 10);
        System.out.println(miTienda.getVentas());

        miTienda.venderProducto(1, 11);
        System.out.println(miTienda.getVentas());



    }
}
