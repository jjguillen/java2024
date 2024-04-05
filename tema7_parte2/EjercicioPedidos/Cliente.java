package tema7_parte2.EjercicioPedidos;

public class Cliente {

    private Long id;
    private String nombre;
    private Integer nivel;

    public Cliente(Long id, String nombre, Integer nivel) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
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

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append('}');
        return sb.toString();
    }
}
