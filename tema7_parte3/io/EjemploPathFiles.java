package tema7_parte3.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class EjemploPathFiles {

    public static void main(String[] args) throws IOException {

        //Path -> Rutas, no dice nada del fichero
        Path ruta = Paths.get("./ejemplo.txt");
        /*
        System.out.println(ruta.getFileSystem());
        System.out.println(ruta.getFileName());
        System.out.println(ruta.getParent());
        */

        //Files -> abrir ficheros
        if (Files.exists(ruta)) {
            System.out.println(Files.isReadable(ruta));
            //Copiar el fichero
            Path rutaDondeCopiar = Paths.get("d:","Profesor", "ejemplo.bak.txt");
            //Files.copy(ruta, rutaDondeCopiar, StandardCopyOption.REPLACE_EXISTING);
        } else {
            System.out.println("No existe");
        }

        //Files - Crear carpeta
        Path rutaDirectorio = Paths.get("./resources");
        //Crear directorio
        Files.createDirectory(rutaDirectorio);
        Path ficheroDentroDirectorio = rutaDirectorio.resolve("ejemplonuevo.txt");

        //Crear fichero
        Path ficheroNuevo = Files.createFile(ficheroDentroDirectorio);

        //Escribir dentro del fichero
        BufferedWriter bw = Files.newBufferedWriter(ficheroNuevo);
        bw.write("Ejemplo escribir en ficheros");
        bw.close();

        //Borrar fichero
        //Files.deleteIfExists(ficheroNuevo);

    }

}
