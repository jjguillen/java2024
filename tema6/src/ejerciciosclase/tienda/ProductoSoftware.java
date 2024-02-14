package ejerciciosclase.tienda;

public class ProductoSoftware extends Producto {

    private String version;

    public ProductoSoftware(String nombre, Long id, Double precio, String version) {
        super(nombre, id, precio);
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
