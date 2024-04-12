package tema7_parte3.io.ejemplo_persona;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        try {
            List<Persona> personas = DAOPersona.leerArchivo();
            personas.stream().forEach(System.out::println);

            long lineas = personas.size();
            Persona nueva = new Persona(lineas+1, "Pepe", "Flores",
                    "pepe@flores.com", "Vera");
            DAOPersona.nuevaPersona(nueva);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
