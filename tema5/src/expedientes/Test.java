package expedientes;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        NotasCurso nc1_1 = new NotasCurso("Programacion", 1, 3,5,9);
        NotasCurso nc1_2 = new NotasCurso("Bases de datos", 1, 5,8,5);

        Expediente javi = new Expediente("Javi", "Guillén", 'H',
                LocalDate.of(1988,5,5), Expediente.Modalidad.GRADOSUPERIOR, 1);
        javi.addCalificacion(nc1_1);
        javi.addCalificacion(nc1_2);

        System.out.println("Exp: " + javi.getId() + " Titula: " + javi.titula() + " media: " + javi.mediaExpendiente());

        NotasCurso nc2_1 = new NotasCurso("Programacion", 1, 8,9,9);
        NotasCurso nc2_2 = new NotasCurso("Bases de datos", 1, 10,8,8);

        Expediente alejandro = new Expediente("Alejandro", "Rodriguez", 'H',
                LocalDate.of(2000,3,15), Expediente.Modalidad.GRADOSUPERIOR, 1);
        alejandro.addCalificacion(nc2_1);
        alejandro.addCalificacion(nc2_2);

        System.out.println("Exp: " + alejandro.getId() + " Titula: " + alejandro.titula() + " media: " + alejandro.mediaExpendiente());


    }
}
