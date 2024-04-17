package tema7_parte3.segundamano.models;

import java.util.Objects;

public class Producto2Mano {

    public enum Categoria { INMUEBLES, TELEFONÍA, INFORMÁTICA, COCHES, BICICLETAS, MUEBLES, ANTIGUEDADES, ROPA }
    public enum Estado { PERFECTO, BUENO, POCO_USO, MUY_USADO, DEFECTUOSO, MALO }

    private Long id;
    private String nombre;
    private String descripcion;
    private Categoria categoria;
    private Estado estado;
    private boolean envio;
    private Double precio;

    public Producto2Mano(Long id, String nombre, String descripcion, Categoria categoria, Estado estado,
                         boolean envio, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.envio = envio;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public boolean isEnvio() {
        return envio;
    }

    public void setEnvio(boolean envio) {
        this.envio = envio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto2Mano{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", categoria=").append(categoria);
        sb.append(", estado=").append(estado);
        sb.append(", envio=").append(envio);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Producto2Mano that = (Producto2Mano) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
