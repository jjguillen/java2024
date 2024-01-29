package herencia;

public class Empleado extends Persona {

    private String departamento;
    private double salario;

    public Empleado(String nombre, String telefono, String email,
                    String ciudad, String direccion, String departamento, double salario) {
        super(nombre, telefono, email, ciudad, direccion);
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Empleado{");
        sb.append("departamento='").append(departamento).append('\'');
        sb.append(", salario=").append(salario);
        sb.append('}');
        sb.append(super.toString()); //Que pinte todo lo del padre
        return sb.toString();
    }

    @Override
    public void contratarTarifaFibra() {
        System.out.println("Son 40€ ;) ");
    }
}
