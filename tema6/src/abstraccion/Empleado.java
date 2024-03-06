package tema6.src.abstraccion;

public class Empleado extends Persona {


    private double salarioBruto;
    private String departamento;
    private Proyecto proyecto;


    public Empleado(String nombre, String apellidos, String email, String dni, String ciudad) {
        super(nombre, apellidos, email, dni, ciudad);
    }

    public Empleado(String nombre, String apellidos, String email, String dni, String ciudad,
                    double salarioBruto, String departamento) {
        super(nombre, apellidos, email, dni, ciudad);
        this.salarioBruto = salarioBruto;
        this.departamento = departamento;
    }

    public Empleado() {
        super();
        this.salarioBruto = 30000;
        this.ciudad = super.ciudad + "---";

    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double calcularNominaMensual() {
        return salarioBruto * (1 - 0.20) / 14;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Empleado{");
        sb.append("salarioBruto=").append(salarioBruto);
        sb.append(", departamento='").append(departamento).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", ciudad='").append(ciudad).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
