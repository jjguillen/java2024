package arrayList;

public class TestTienda {
    public static void main(String[] args) {

        Producto pr1 = new Producto(1, "Play5", "Consolas", 500);
        Producto pr2 = new Producto(2, "iPhone 15", "Móviles", 1000);
        Producto pr3 = new Producto(3, "Nintendo Switch Oled", "Consolas", 400);

        Tienda mediaMark = new Tienda("MediaMark");
        mediaMark.addProducto(pr1);
        mediaMark.addProducto(pr2);
        mediaMark.addProducto(pr3);

        //System.out.println(mediaMark);

        for(Producto pr : mediaMark.getProductos()) {
            System.out.println(pr.getNombre() + ": " + pr.getPrecio() + "€");
        }

    }
}
