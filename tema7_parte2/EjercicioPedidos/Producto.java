package tema7_parte2.EjercicioPedidos;

public class Producto {

    public enum CategoriaProducto { LIBROS, JUEGOS, PERIFERICOS }

    private Long id;
    private String nombre;
    private CategoriaProducto categoria;
    private Double precio;

    public Producto(Long id, String nombre, CategoriaProducto categoria, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", categoria=").append(categoria);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
