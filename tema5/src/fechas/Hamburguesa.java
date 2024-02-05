package fechas;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Hamburguesa {

    private String nombre;
    private double cantidadCarne;
    private LocalDate fechaCaducidad;

    //Formato de fecha: yyyy-MM-dd
    //LocalDate.parse("yyyy-MM-dd");
    //LocalDate.of(yyyy, M, d);
    //LocalDate.of(2024,2,5).plusDays(3);
    public Hamburguesa(String nombre, double cantidadCarne, String fechaCaducidad) {
        this.nombre = nombre;
        this.cantidadCarne = cantidadCarne;
        this.fechaCaducidad = LocalDate.parse(fechaCaducidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidadCarne() {
        return cantidadCarne;
    }

    public void setCantidadCarne(double cantidadCarne) {
        this.cantidadCarne = cantidadCarne;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hamburguesa{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", cantidadCarne=").append(cantidadCarne);
        sb.append(", fechaCaducidad=").append(fechaCaducidad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hamburguesa that = (Hamburguesa) o;

        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode() : 0;
    }

    public boolean estaCaducado() {
        //Si la fecha actual es anterior a la de caducidad no está caducado
        if (LocalDate.now().isBefore(this.fechaCaducidad)) {
            return false;
        } else
            return true;
    }

    public int numDiasFaltan() {
        Period periodo = Period.between(LocalDate.now(), this.fechaCaducidad);
        return periodo.getDays();
    }
}
