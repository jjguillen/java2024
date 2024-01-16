package ejemploaccesoclases.modelos;

public class EmpleadoJefe extends Empleado {


    public EmpleadoJefe(String nombre, double salario, Departamento departamento, Proyecto proyectoActual) {
        super(nombre, salario, departamento, proyectoActual);
    }

    public void sumarPlus() {
        this.salario += 2000;
    }
}
