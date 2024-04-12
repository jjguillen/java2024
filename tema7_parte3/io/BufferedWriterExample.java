package tema7_parte3.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) throws IOException {

        String texto = "Esto es un texto que se va a escribir en un fichero";

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter( new FileWriter("bufferedwriter.txt"));
            writer.write(texto);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            writer.close();
        }

    }
}
