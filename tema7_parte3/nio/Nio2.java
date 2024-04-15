package tema7_parte3.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Nio2 {

    public static void buscar(String nombreArchivo, Path ruta) throws IOException {
        Files.walk(ruta, 10)
                .filter(Files::isRegularFile)
                .map(Path::getFileName)
                .filter( fl -> fl.equals(nombreArchivo))
                .peek(fn -> {

                    System.out.println(nombreArchivo + "-" + fn);
                })
                .forEach(System.out::println);
    }


    public static void main(String[] args) throws IOException {

        Path raiz = Paths.get("/home","profesor","Documentos");

        //Recorrer todos los archivos y carpetas a partir de una ruta
        Files.walk(raiz, 10)
                .filter(Files::isDirectory)  //Solo va a mostrar las carpetas
                .forEach(System.out::println);

        System.out.println( Files.walk(raiz, 10)
                .filter(Files::isDirectory)  //Solo va a mostrar las carpetas
                .count() );

        //Borrar todos los ficheros .class de este proyecto

        Path proyecto = Paths.get(".");
        /*
        Files.walk(proyecto, 10)
                .filter(Files::isRegularFile)
                .filter( p -> p.toString().endsWith(".class") )
                .peek( System.out::println)
                .forEach( p -> {
                    try {
                        Files.deleteIfExists(p);
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                } );

         */

        //Leer el fichero personas.csv - ESTE ES EL QUE HAY QUE USAR
        Path personas = Paths.get("personas.csv");
        Files.lines(personas)
                .filter(linea -> linea.contains("Z"))
                .forEach(System.out::println);


        //Solo muestra las carpetas y ficheros en el primer nivel del Path que le pasamos
        Files.list(proyecto)
                .forEach(System.out::println);


        System.out.println("----------------------------");
        Nio2.buscar("Documento.java", Paths.get("."));

    }

}
