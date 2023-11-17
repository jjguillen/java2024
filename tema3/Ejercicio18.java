package tema3;

import java.util.Arrays;

public class Ejercicio18 {
    
    /**
     * Función que genera un número aleatorio entre un valor mínimo y máximo
     * @param min
     * @param max
     * @return número aleatorio entre min y max, incluidos
     */
    public static int generarNumero(int min, int max) {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }

    public static void main(String[] args) {
        
        int tabla[][] = new int[5][6];
        
        for(int i=0; i < tabla.length-1; i++) {
            for(int j=0; j < tabla[0].length-1; j++) {
                tabla[i][j] = generarNumero(0,9);
            }
        }

        for(int i=0; i < tabla.length; i++)
            System.out.println( Arrays.toString(tabla[i]));


        //Suma filas
        int totalFila=0;
        int totalFilas=0;
        for(int i=0; i < tabla.length-1; i++) {
            for(int j=0; j < tabla[0].length-1; j++) {
                totalFila += tabla[i][j];
            }
            tabla[i][tabla[0].length-1] = totalFila;
            totalFilas += totalFila;
            totalFila = 0;
        }

        //Suma columnas
        int totalColumna=0;
        int totalColumnas=0;
        for(int i=0; i < tabla[0].length-1; i++) {
            for(int j=0; j < tabla.length-1; j++) {
                totalColumna += tabla[j][i];
            }
            totalColumnas += totalColumna;
            tabla[tabla.length-1][i] = totalColumna;
            totalColumna = 0;
        }

        //Suma todo
        tabla[tabla.length-1][tabla[0].length-1] = totalFilas + totalColumnas;

        for(int i=0; i < tabla.length; i++)
            System.out.println( Arrays.toString(tabla[i]));

    }
}
