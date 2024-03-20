package tema7_parte2.introduccion_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainEmpresa {

    public static void main(String[] args) {

        Empleado e1 = new Empleado("Manuel", "Sánchez", Empleado.Departamento.DESARROLLO,
                50000d, "manuels@gmail.com");
        Empleado e2 = new Empleado("Laura", "Martos", Empleado.Departamento.RRHH,
                30000d, "lauram@gmail.com");
        Empleado e3 = new Empleado("Sonia", "Díaz", Empleado.Departamento.DESARROLLO,
                40000d, "soniad@gmail.com");
        Empleado e4 = new Empleado("Isabel", "Sánchez", Empleado.Departamento.RRHH,
                55000d, "isabels@gmail.com");
        Empleado e5 = new Empleado("Antonio", "Lucas", Empleado.Departamento.CONTABILIDAD,
                42000d, "antoniol@gmail.com");

        List<Empleado> empleados = new ArrayList<>(List.of(e1,e2,e3,e4,e5));

        //Pinta el apellido de los empleados que trabajan en desarrollo
        empleados.stream()
                .filter( emp -> emp.getDepartamento().equals(Empleado.Departamento.DESARROLLO))
                .map( Empleado::getApellidos )
                .forEach(System.out::println);

        //Pinta el salario de los empleados que trabajan en RRHH
        empleados.parallelStream()
                .filter( emp -> emp.getDepartamento().equals(Empleado.Departamento.RRHH))
                .map( Empleado::getSalarioBrutoAnual ) //.map( emp -> emp.getSalarioBrutoAnual()
                .forEach(System.out::println);

        //Suma el salario de los empleados que trabajan en RRHH
        Double suma = empleados.stream()
                .filter( emp -> emp.getDepartamento().equals(Empleado.Departamento.RRHH))
                .map( Empleado::getSalarioBrutoAnual )
                .reduce(0d, Double::sum);
        System.out.println(suma);

        //Genera una lista con los Empleados que sean de desarrollo con un plus de 5%
        List<Empleado> empleadosDesarrollo = empleados.stream()
                .filter( emp -> emp.getDepartamento().equals(Empleado.Departamento.DESARROLLO))
                .peek( emp -> emp.setSalarioBrutoAnual(emp.getSalarioBrutoAnual() * 1.05))
                .toList();
        empleadosDesarrollo.forEach(System.out::println);

    }
}
