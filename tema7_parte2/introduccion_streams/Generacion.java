package tema7_parte2.introduccion_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Generacion {

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

        //Stream.of
        Stream.of(e1,e2,e3,e4,e5)
                .forEach(System.out::println);

        //Dada una colección (List o Set) llamar a .stream() o .parallelStream()
        List<Empleado> empleados = new ArrayList<>(List.of(e1,e2,e3,e4,e5));
        empleados.parallelStream().forEach(System.out::println);

        //Stream.iterate
        Stream<Integer> numeros = Stream.iterate(0, integer -> integer + 5);
        numeros
                .limit(100)
                .forEach(System.out::println);

        //Stream.generate
        Stream<Double> numerosD = Stream.generate(Math::random);
        numerosD
                .limit(10)
                .map( n -> n * 10)
                .forEach(System.out::println);
    }
}
