package tema7_parte2.introduccion_streams;

import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.List;

public class Intermedias {

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
        Empleado e6 = new Empleado("Laura", "Martos", Empleado.Departamento.RRHH,
                30000d, "lauram@gmail.com");

        //Stream.of
        List<Empleado> empleados = new ArrayList<>(List.of(e1,e2,e3,e4,e5,e6));
        empleados.stream()
                .skip(2)
                .distinct()
                .forEach( emp -> System.out.println(emp.getEmail()) );

        empleados.stream()
                .map( emp -> emp.getApellidos().toUpperCase() )
                .map( apellido -> apellido.toLowerCase())
                .forEach(System.out::println);

        empleados.stream()
                .map( emp -> emp.getSalarioBrutoAnual() )
                .forEach(System.out::println);

        empleados.stream()
                .map( emp -> emp.getNombre() )
                .sorted()
                .forEach(System.out::println);
    }
}
