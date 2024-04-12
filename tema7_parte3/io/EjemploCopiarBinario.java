package tema7_parte3.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EjemploCopiarBinario {

    public static void main(String[] args) throws IOException {

        //Path fpdf = Paths.get("d:", "Profesor", "FormularioSolicitudSexenio.pdf");
        Path fpdf = Paths.get("d:/Profesor/FormularioSolicitudSexenio.pdf");

        //Pintar byte a byte, o char a char
        byte[] buffer = Files.readAllBytes(fpdf);
        for(int i=0; i < buffer.length; i++) {
            System.out.print( (char) buffer[i]);
        }

        //Copiarlo en otro fichero
        Path fpdf_copy = Paths.get("d:/Profesor/FormularioSolicitudSexenio_bak.pdf");
        Files.write(fpdf_copy, buffer, StandardOpenOption.WRITE, StandardOpenOption.CREATE);



    }
}
