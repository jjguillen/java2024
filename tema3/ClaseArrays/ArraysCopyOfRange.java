package tema3.ClaseArrays;

import java.util.Arrays;

public class ArraysCopyOfRange {
    
    public static void main(String[] args) {
        
        String palabras[] = { "En", "la", "feria", "se", "escaquea", "el", "personal", "de", "segundo" };

        String trozoPalabras[] = Arrays.copyOfRange(palabras, 3, 7);    

        System.out.println( Arrays.toString(trozoPalabras));

    }
}
