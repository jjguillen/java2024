package examen2024.entities;

public class Tecnico extends Persona {

    public enum Especialidad {INFORMATICA, ALBAÑILERIA, FONTANERÍA, CARPINTERIA, PINTURA}

    private Especialidad especialidad;
    private Integer valoracion;

    public Tecnico(Long id, String nombre, String apellidos, String email, String movil,
                   Especialidad especialidad, Integer valoracion) {
        super(id, nombre, apellidos, email, movil);
        this.especialidad = especialidad;
        this.valoracion = valoracion;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getValoracion() {
        return valoracion;
    }

    public void setValoracion(Integer valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", movil='" + movil + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", valoracion='" + valoracion + '\'' +
                '}';
    }
}
