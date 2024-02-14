package ejerciciosclase.tienda;

public class ProductoHardware extends Producto {

    private Double peso;

    public ProductoHardware(String nombre, Long id, Double precio, Double peso) {
        super(nombre, id, precio);
        this.peso = peso;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
