package ejemploaccesoclases.servicios;

import ejemploaccesoclases.modelos.Empleado;
import java.util.ArrayList;

public class Empresa {

    private ArrayList<Empleado> empleados;
    private String nombre;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Empresa{");
        sb.append("empleados=");

        for (Empleado empleado : empleados) {
            sb.append(empleado);
            sb.append('\n');
        }

        sb.append(", nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
