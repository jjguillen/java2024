package tema7_parte2.flatmap;

public class Soldado {
    private String nombre;
    private String rango;
    private String identificacion;

    public Soldado(String nombre, String rango, String identificacion) {
        this.nombre = nombre;
        this.rango = rango;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Soldado{" +
                "nombre='" + nombre + '\'' +
                ", rango='" + rango + '\'' +
                ", identificacion='" + identificacion + '\'' +
                '}';
    }
}
