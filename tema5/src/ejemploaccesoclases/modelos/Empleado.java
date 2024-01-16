package ejemploaccesoclases.modelos;

public class Empleado {

    public enum Departamento { RRHH, VENTAS, DESARROLLO }

    private String nombre;
    protected double salario;
    private Departamento departamento;
    private Proyecto proyectoActual;

    public Empleado(String nombre, double salario, Departamento departamento, Proyecto proyectoActual) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
        this.proyectoActual = proyectoActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        calcularNeto();
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    private void calcularNeto() {
        this.salario = this.salario - this.salario * 0.15;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Empleado{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", salario=").append(salario);
        sb.append(", departamento=").append(departamento);
        sb.append('}');
        return sb.toString();
    }
}
