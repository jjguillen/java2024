package tema3;

import java.util.Arrays;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        int numeros[] = { 1, 3, 9, 50, 99 };

        int temp = numeros[0];
        numeros[0] = numeros[numeros.length-1];
        numeros[numeros.length-1] = temp;

        System.out.println( Arrays.toString(numeros) );
    }
}
