package tema7_parte3.io;

import java.io.*;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        BufferedWriter bw = null;
        String linea = null;

        try {
            br = new BufferedReader( new FileReader("bufferedwriter.txt"));
            //bw = new BufferedWriter( new FileWriter("/home/profesor/Documents/bufferedwriteruppercase.txt"));
            bw = new BufferedWriter( new FileWriter("bufferedwriteruppercase.txt"));

            while( (linea = br.readLine()) != null) {
                //System.out.println(linea);
                bw.write(linea.toUpperCase()); //Escribir la línea
                bw.newLine(); //Escribir el salto de línea
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            br.close();
            bw.close();
        }
    }
}
