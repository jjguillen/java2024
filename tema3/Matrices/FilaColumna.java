package tema3.Matrices;

import java.util.Arrays;

/**
 * Función que le pasas como parámetro un índice y un char ('f' o 'c') y debe devolver un
 * array con la fila o la columna i de esa matriz si existe. Primero comprobar que el índice sea
 * correcto.
 */

public class FilaColumna {
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

    /**
     * Te devuelve la fila o columna indicada por número de la tabla
     * Si el caracter c es 'f' te devuelve esa fila
     * Si el caracter c es 'c' te devuelve esa columna
     * @param numero
     * @param c
     * @param tabla
     * @return
     * @throws Exception
     */
    public static int[] devuelveParte(int numero, char c, int tabla[][]) throws Exception  {

        //Check numero is valid
        if (numero >= tabla.length && c == 'f') {
            throw new Exception("Número de fila no válido");
        }
        if (numero >= tabla[0].length && c == 'c') {
            throw new Exception("Número de columna no válido");
        }
        if (numero < 0) {
            throw new Exception("Número negativo no es válido");
        }

        //Return row with numero
        if (c == 'f') {
            return tabla[numero];
        }

        //Return column with numero
        if (c == 'c') {
            //Create array aux with column size
            int aux[] = new int[tabla[0].length];

            //0, numero
            //1, numero
            //2, numero
            // ...
            // Para objetener una columna se deja fija la columna, y se va moviendo la fila
            for(int j=0; j<tabla.length; j++) {
                aux[j] = tabla[j][numero];
            }

            return aux;
        }

        return null;
    }

    public static void main(String[] args) {
        
        int tabla[][] = new int[5][5];

        for(int i=0; i < tabla.length; i++) {            //FILAS
            for(int j=0; j < tabla[0].length; j++) {     //COLUMNAS                    
                tabla[i][j] = generarNumero(100, 500);
            }
        }

        pintarMatriz(tabla);

        try {

            int aux[] = devuelveParte(4,'c', tabla);
            System.out.println( Arrays.toString(aux)  ); //Devuelve la fila 1

            int aux2[] = devuelveParte(3,'f', tabla);
            System.out.println( Arrays.toString(aux2)  ); //Devuelve la fila 1

            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}
