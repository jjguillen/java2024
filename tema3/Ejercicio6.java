package tema3;

import java.util.Arrays;

public class Ejercicio6 {
    
    /**
     * Función que genera un número aleatorio entre un valor mínimo y máximo
     * @param min
     * @param max
     * @return número aleatorio entre min y max, incluidos
     */
    public static int generarNumero(int min, int max)  {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }

    public static void main(String[] args) {
        
        int numeros[] = new int[10];

        for(int i=0; i<numeros.length; i++) {
            numeros[i] = generarNumero(1, 20);
        }

        System.out.println( Arrays.toString(numeros) );

        for(int i=0; i < numeros.length / 2; i++) {
            System.out.println(numeros[i]);
            System.out.println(numeros[numeros.length - i - 1]);
        }


    }
}
