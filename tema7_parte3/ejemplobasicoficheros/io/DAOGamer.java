package tema7_parte3.ejemplobasicoficheros.io;

import tema7_parte3.ejemplobasicoficheros.models.Gamer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import tema7_parte3.ejemplobasicoficheros.models.Level;

public class DAOGamer {

    public static List<Gamer> loadGamers() throws IOException {
        //File to read with gamers
        Path file = Paths.get("tema7_parte3", "ejemplobasicoficheros", "resources", "gamers.csv");
        return Files.lines(file)
                .map( str -> {
                    String[] cad = str.split(",");

                    //Create object Gamer
                    return new Gamer(Long.parseLong(cad[0]), cad[1], cad[2], cad[3], Level.valueOf(cad[4]));
                })
                .toList();
    }

    public static void saveGamers(List<Gamer> gamers) throws IOException {

        //Open the file gamers.csv
        Path file = Paths.get("tema7_parte3", "ejemplobasicoficheros", "resources", "gamers.csv");
        BufferedWriter bw = Files.newBufferedWriter(file,
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE); //* to rewrite the file

        //For each gamer generate a string in a line
        for(Gamer gamer : gamers) {
            StringBuffer sb = new StringBuffer();
            sb.append(gamer.getId()).append(",");
            sb.append(gamer.getNick()).append(",");
            sb.append(gamer.getEmail()).append(",");
            sb.append(gamer.getGame()).append(",");
            sb.append(gamer.getLevel());

            //Write line in file gamers.csv
            bw.write(sb.toString());
            bw.newLine();
        }

        //Close the BufferedWriter
        bw.close();
    }
}
