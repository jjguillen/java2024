package tema3.Matrices;

import java.util.Arrays;

public class Matriz {

    /**
     * Función que genera un número aleatorio entre un valor mínimo y máximo
     * @param min
     * @param max
     * @return número aleatorio entre min y max, incluidos
     */
    public static int generarNumero(int min, int max)  {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }

    /**
     * Función para pintar por consola los valores de una matriz de enteros
     * @param matriz
     *      */
    public static void pintarMatriz(int matriz[][]) {
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        //Matriz 3x2 -> 3 filas 2 columnas
        int tabla[][] = new int[4][3];
        // 0,0 0,1
        // 1,0 1,1
        // 2,0 2,1

        //Rellenarlo
        for(int i=0; i < tabla.length; i++) {            //tabla.length <- 3     -> Número de filas
            for(int j=0; j < tabla[0].length; j++) {     //tabla[0].length <- 2  -> Tamaño de cada fila, 
                                                         //                         Número de columnas
                tabla[i][j] = generarNumero(1, 10);
            }
        }

        pintarMatriz(tabla);

    }

}