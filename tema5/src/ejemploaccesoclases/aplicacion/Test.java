package ejemploaccesoclases.aplicacion;
import ejemploaccesoclases.modelos.Empleado;
import ejemploaccesoclases.modelos.Proyecto;
import ejemploaccesoclases.servicios.Empresa;

public class Test {

    public static void main(String[] args) {

        Proyecto py1 = new Proyecto("Automatización de regadío");

        Empleado em1 = new Empleado("Isa",30000, Empleado.Departamento.RRHH, py1);
        Empleado em2 = new Empleado("Andrés",25000, Empleado.Departamento.DESARROLLO, py1);

        Empresa empresa = new Empresa("Gofarsa");
        empresa.addEmpleado(em1);
        empresa.addEmpleado(em2);

        System.out.println(empresa);


    }
}
