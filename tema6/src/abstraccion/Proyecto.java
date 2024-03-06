package tema6.src.abstraccion;

import java.util.ArrayList;

public class Proyecto {
    private String nombre;
    private int horasTrabajo;
    private ArrayList<Empleado> miembros = new ArrayList<>();

    public Proyecto(String nombre, int horasTrabajo) {
        this.nombre = nombre;
        this.horasTrabajo = horasTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public ArrayList<Empleado> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Empleado> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Proyecto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", horasTrabajo=").append(horasTrabajo);
        sb.append(", miembros=").append(miembros);
        sb.append('}');
        return sb.toString();
    }

    public void addMiembro(Empleado empleado) {
        empleado.setProyecto(this);
        this.miembros.add(empleado);
    }
}
