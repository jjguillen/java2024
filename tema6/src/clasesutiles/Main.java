package clasesutiles;

public class Main {

    public static void main(String[] args) {

        Categoria categoria = Categoria.CPU;
        Producto pr = new Producto("Amd Ryzen 9 5900", Categoria.CPU);
        System.out.println(pr.getCategoria().name());
        System.out.println(pr.getCategoria().ordinal());

        System.out.println(Categoria.CPU.getDescuento());


    }
}
