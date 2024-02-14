package ejerciciosclase.tienda;
import java.util.ArrayList;
public class Producto {

    protected String nombre;
    protected Long id;
    protected Double precio;
    protected ArrayList<Proveedor> proveedores;

    public Producto(String nombre, Long id, Double precio) {
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
        this.proveedores = new ArrayList<Proveedor>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }


}
