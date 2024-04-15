package tema7_parte3.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class EjemploLecturaLineasList {

    public static void main(String[] args) throws IOException {

        Path personasFile = Paths.get("personas.csv");

        //Leer todas las líneas del fichero
        List<String> personasStrings = Files.readAllLines(personasFile);

        //Acceder a las líneas
        personasStrings.stream()
                .forEach(System.out::println);

        //Escribir una nueva línea en el archivo
        BufferedWriter bw = Files.newBufferedWriter(personasFile,
                StandardOpenOption.WRITE,
                StandardOpenOption.APPEND); //Añadimos al final
        bw.write("1002,Javier,Profe,jj@wikimedia.org,Mojacar");
        bw.newLine(); //Una nueva fila
        bw.close();

    }
}
