package tema7_parte3.io.ejemplo_persona;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class DAOPersona {

    /**
     * Leer todas las líneas del fichero, convertirlas en objetos Persona
     * y devolver un List<Persona>
     * @return
     */
    public static List<Persona> leerArchivo() throws IOException {
        Path ficheroPersona = Paths.get("personas.csv");
        List<String> personasString = Files.readAllLines(ficheroPersona);

        ArrayList<Persona> personas = new ArrayList<>();
        for(String personaStr : personasString) {
            String[] cad = personaStr.split(",");
            Persona person = new Persona(Long.parseLong(cad[0]),
                    cad[1], cad[2], cad[3], cad[4]);
            personas.add(person);
        }
        return personas;

        /*
        return personasString.stream()
                .map( str -> {
                    String[] cad = str.split(",");
                    Persona person = new Persona(Long.parseLong(cad[0]),
                            cad[1], cad[2], cad[3], cad[4]);
                    return person;
                })
                .toList();
         */
    }

    /**
     * El objeto Persona, lo convierte en una línea de texto y lo añade al final del archivo
     * @param persona
     */
    public static void nuevaPersona(Persona persona) {
        //Pasar el objeto a cadena
        StringBuffer sb = new StringBuffer();
        sb.append(persona.getId());
        sb.append(",");
        sb.append(persona.getNombre());
        sb.append(",");
        sb.append(persona.getApellidos());
        sb.append(",");
        sb.append(persona.getEmail());
        sb.append(",");
        sb.append(persona.getCiudad());

        //Crear BufferedReader con opción Append
        Path ficheroPersona = Paths.get("personas.csv");
        try {
            BufferedWriter bw = Files.newBufferedWriter(ficheroPersona,
                    StandardOpenOption.WRITE,
                    StandardOpenOption.APPEND);

            //Escribimos en el archivo el string del objeto Persona
            bw.write(sb.toString());

            //Salto de línea
            bw.newLine();

            //Cerrar el archivo
            bw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
