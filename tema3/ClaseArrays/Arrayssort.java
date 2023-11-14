package tema3.ClaseArrays;

import java.util.Arrays;

public class Arrayssort {
    
    public static void main(String[] args) {
        
        int[] numeros = new int[100];

        for(int i=0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1; 
        }

        System.out.println( Arrays.toString(numeros) );

        //Ordenar
        Arrays.sort(numeros);

        System.out.println( Arrays.toString(numeros) );


    }
}
