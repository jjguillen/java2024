package tema7_parte3.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataOutputStreamExample {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream("dataoutputstream.dat"));

            System.out.println("Escribe un caracter");
            dos.writeChar(sc.nextInt());
            dos.writeChar(sc.nextInt());
            dos.writeChar(sc.nextInt());

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                dos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
