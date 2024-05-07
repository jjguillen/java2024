package examen2024.entities;

import java.time.LocalDate;

public class Usuario extends Persona {

    private LocalDate fechaAlta;

    public Usuario(Long id, String nombre, String apellidos, String email, String movil,
                   LocalDate fechaAlta) {
        super(id, nombre, apellidos, email, movil);
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", movil='" + movil + '\'' +
                ", fechaDeAlta='" + fechaAlta + '\'' +
                '}';
    }

}
