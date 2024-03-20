package tema7_parte2.introduccion_streams;

import java.util.Objects;

public class Empleado {

    enum Departamento { RRHH, DESARROLLO, CONTABILIDAD }

    private String nombre;
    private String apellidos;
    private Departamento departamento;
    private Double salarioBrutoAnual;
    private String email;

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, Departamento departamento, Double salarioBrutoAnual, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.departamento = departamento;
        this.salarioBrutoAnual = salarioBrutoAnual;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Double getSalarioBrutoAnual() {
        return salarioBrutoAnual;
    }

    public void setSalarioBrutoAnual(Double salarioBrutoAnual) {
        this.salarioBrutoAnual = salarioBrutoAnual;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Empleado{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", departamento=").append(departamento);
        sb.append(", salarioBrutoAnual=").append(salarioBrutoAnual);
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Empleado empleado = (Empleado) o;

        return Objects.equals(email, empleado.email);
    }

    @Override
    public int hashCode() {
        return email != null ? email.hashCode() : 0;
    }
}
