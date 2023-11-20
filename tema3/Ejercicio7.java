package tema3;

import java.util.Arrays;

public class Ejercicio7 {
    
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
        
        int vector[] = new int[5];

        for(int i=0; i<vector.length; i++) {
            vector[i] = generarNumero(1, 10);
        }

        System.out.println(Arrays.toString(vector));

        int nveces = 3;
        for(int j=0; j < nveces; j++) {
            //Desplaza una posición a la derecha
            int ultimo = vector[vector.length-1];
            for(int i=vector.length-1; i>0; i--) {
                vector[i] = vector[i-1];
            }
            vector[0] = ultimo;

            //System.out.println(Arrays.toString(vector));

        }

        System.out.println(Arrays.toString(vector));


    }
}
