package tema3.ClaseArrays;

import java.util.Arrays;

public class ArraysCopyOf {
    
    public static void main(String[] args) {
        
        int[] numeros = new int[100];

        for(int i=0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1; 
        }

        System.out.println( Arrays.toString(numeros) );


        //Copiar el array numeros a numerosCopia
        int numerosCopia[] = Arrays.copyOf(numeros, numeros.length);

        //Ordenar
        Arrays.sort(numeros);

        System.out.println( Arrays.toString(numeros) );
        System.out.println( Arrays.toString(numerosCopia) );


    }
}
