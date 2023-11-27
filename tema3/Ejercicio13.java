package tema3;

import java.util.Arrays;

public class Ejercicio13 {
    
    public static int generarNumero(int min, int max) {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }

    public static void pintarMatriz(int tabla[][]) {
        for(int i=0; i<tabla.length; i++) {
            for(int j=0; j<tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int tabla[][] = new int[3][4];

        for(int i=0; i<tabla.length; i++) {
            for(int j=0; j<tabla[i].length; j++) {
                tabla[i][j] = generarNumero(0, 9);
            }
        }

        pintarMatriz(tabla);

        int sumaFilas[] = new int[tabla.length]; //3

        for(int i=0; i<tabla.length; i++) {
            for(int j=0; j<tabla[i].length; j++) {
                sumaFilas[i] += tabla[i][j];
            }
        }

        System.out.println(Arrays.toString(sumaFilas));

        //Para sumar las columnas el for de fuera se recorre las columnas
        //Luego el for de dentro va hasta el número de filas
        /*
        for(int j=0; j<tabla[0].length; j++) {
            for(int i=0; i<tabla.length; i++) {
                sumaColumnas[i] += tabla[i][j];
            }
        }
        */

        int sumaColumnas[] = new int[tabla[0].length];
        for(int i=0; i<tabla[0].length; i++) {
            for(int j=0; j<tabla.length; j++) {
                sumaColumnas[i] += tabla[j][i];
            }
        }

        System.out.println(Arrays.toString(sumaColumnas));

    }
}
