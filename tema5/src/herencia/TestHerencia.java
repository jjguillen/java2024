package herencia;

import java.util.ArrayList;

public class TestHerencia {

    public static void main(String[] args) {
        Empleado em1 = new Empleado("Pepe", "666555444", "pepe@gmail.com",
                "Vera", "su casa", "RRHH", 35000);

        Cliente cli1 = new Cliente("Pepe", "666555444", "pepe@gmail.com",
                "Vera", "su casa", "ES33-45", 35);

        System.out.println(em1);

        System.out.println(em1.getNombre());
        System.out.println(em1.getSalario());
        em1.contratarTarifaFibra();

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(em1);
        personas.add(cli1);

        for(Persona nombreVariable : personas) {
            nombreVariable.contratarTarifaFibra();
        }

        /*
        Persona javi = new Persona("Javi", "65656565","javi@gmail.com",
                "mojácar", "micasa");
        */


    }
}
